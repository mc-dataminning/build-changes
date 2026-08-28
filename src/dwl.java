import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwl implements dwh, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final AtomicBoolean b = new AtomicBoolean();
   private final bpk<bpm.b> c;
   private final dwq d;
   private final Map<dcd, dwl.a> e = Maps.newLinkedHashMap();
   private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> f = new Long2ObjectLinkedOpenHashMap();
   private static final int g = 1024;

   protected dwl(dws $$0, Path $$1, boolean $$2) {
      this.d = new dwq($$0, $$1, $$2);
      this.c = new bpk<>(new bpm.a(dwl.b.values().length), ad.h(), "IOWorker-" + $$0.c());
   }

   public boolean a(dcd $$0, int $$1) {
      dcd $$2 = new dcd($$0.e - $$1, $$0.f - $$1);
      dcd $$3 = new dcd($$0.e + $$1, $$0.f + $$1);

      for (int $$4 = $$2.h(); $$4 <= $$3.h(); $$4++) {
         for (int $$5 = $$2.i(); $$5 <= $$3.i(); $$5++) {
            BitSet $$6 = this.a($$4, $$5).join();
            if (!$$6.isEmpty()) {
               dcd $$7 = dcd.a($$4, $$5);
               int $$8 = Math.max($$2.e - $$7.e, 0);
               int $$9 = Math.max($$2.f - $$7.f, 0);
               int $$10 = Math.min($$3.e - $$7.e, 31);
               int $$11 = Math.min($$3.f - $$7.f, 31);

               for (int $$12 = $$8; $$12 <= $$10; $$12++) {
                  for (int $$13 = $$9; $$13 <= $$11; $$13++) {
                     int $$14 = $$13 * 32 + $$12;
                     if ($$6.get($$14)) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private CompletableFuture<BitSet> a(int $$0, int $$1) {
      long $$2 = dcd.c($$0, $$1);
      synchronized (this.f) {
         CompletableFuture<BitSet> $$3 = (CompletableFuture<BitSet>)this.f.getAndMoveToFirst($$2);
         if ($$3 == null) {
            $$3 = this.b($$0, $$1);
            this.f.putAndMoveToFirst($$2, $$3);
            if (this.f.size() > 1024) {
               this.f.removeLast();
            }
         }

         return $$3;
      }
   }

   private CompletableFuture<BitSet> b(int $$0, int $$1) {
      return CompletableFuture.supplyAsync(() -> {
         dcd $$2 = dcd.a($$0, $$1);
         dcd $$3 = dcd.b($$0, $$1);
         BitSet $$4 = new BitSet();
         dcd.a($$2, $$3).forEach($$1xx -> {
            vf $$2x = new vf(new vh(ug.a, "DataVersion"), new vh(ub.b, "blending_data"));

            try {
               this.a($$1xx, $$2x).join();
            } catch (Exception var7) {
               a.warn("Failed to scan chunk {}", $$1xx, var7);
               return;
            }

            if ($$2x.d() instanceof ub $$5 && this.a($$5)) {
               int $$6 = $$1xx.k() * 32 + $$1xx.j();
               $$4.set($$6);
            }
         });
         return $$4;
      }, ad.g());
   }

   private boolean a(ub $$0) {
      return $$0.b("DataVersion", 99) && $$0.h("DataVersion") >= 3441 ? $$0.b("blending_data", 10) : true;
   }

   public CompletableFuture<Void> a(dcd $$0, @Nullable ub $$1) {
      return this.a(() -> {
         dwl.a $$2 = this.e.computeIfAbsent($$0, $$1xx -> new dwl.a($$1));
         $$2.a = $$1;
         return Either.left($$2.b);
      }).thenCompose(Function.identity());
   }

   public CompletableFuture<Optional<ub>> a(dcd $$0) {
      return this.a(() -> {
         dwl.a $$1 = this.e.get($$0);
         if ($$1 != null) {
            return Either.left(Optional.ofNullable($$1.a()));
         } else {
            try {
               ub $$2 = this.d.a($$0);
               return Either.left(Optional.ofNullable($$2));
            } catch (Exception var4) {
               a.warn("Failed to read chunk {}", $$0, var4);
               return Either.right(var4);
            }
         }
      });
   }

   public CompletableFuture<Void> a(boolean $$0) {
      CompletableFuture<Void> $$1 = this.a(
            () -> Either.left(CompletableFuture.allOf(this.e.values().stream().map($$0x -> $$0x.b).toArray(CompletableFuture[]::new)))
         )
         .thenCompose(Function.identity());
      return $$0 ? $$1.thenCompose($$0x -> this.a(() -> {
            try {
               this.d.a();
               return Either.left(null);
            } catch (Exception var2x) {
               a.warn("Failed to synchronize chunks", var2x);
               return Either.right(var2x);
            }
         })) : $$1.thenCompose($$0x -> this.a(() -> Either.left(null)));
   }

   @Override
   public CompletableFuture<Void> a(dcd $$0, uv $$1) {
      return this.a(() -> {
         try {
            dwl.a $$2 = this.e.get($$0);
            if ($$2 != null) {
               if ($$2.a != null) {
                  $$2.a.b($$1);
               }
            } else {
               this.d.a($$0, $$1);
            }

            return Either.left(null);
         } catch (Exception var4) {
            a.warn("Failed to bulk scan chunk {}", $$0, var4);
            return Either.right(var4);
         }
      });
   }

   private <T> CompletableFuture<T> a(Supplier<Either<T, Exception>> $$0) {
      return this.c.c($$1 -> new bpm.b(dwl.b.a.ordinal(), () -> {
            if (!this.b.get()) {
               $$1.a($$0.get());
            }

            this.c();
         }));
   }

   private void b() {
      if (!this.e.isEmpty()) {
         Iterator<Entry<dcd, dwl.a>> $$0 = this.e.entrySet().iterator();
         Entry<dcd, dwl.a> $$1 = $$0.next();
         $$0.remove();
         this.a($$1.getKey(), $$1.getValue());
         this.c();
      }
   }

   private void c() {
      this.c.a(new bpm.b(dwl.b.b.ordinal(), this::b));
   }

   private void a(dcd $$0, dwl.a $$1) {
      try {
         this.d.a($$0, $$1.a);
         $$1.b.complete(null);
      } catch (Exception var4) {
         a.error("Failed to store chunk {}", $$0, var4);
         $$1.b.completeExceptionally(var4);
      }
   }

   @Override
   public void close() throws IOException {
      if (this.b.compareAndSet(false, true)) {
         this.c.b($$0 -> new bpm.b(dwl.b.c.ordinal(), () -> $$0.a(azs.a))).join();
         this.c.close();

         try {
            this.d.close();
         } catch (Exception var2) {
            a.error("Failed to close storage", var2);
         }
      }
   }

   public dws a() {
      return this.d.b();
   }

   static class a {
      @Nullable
      ub a;
      final CompletableFuture<Void> b = new CompletableFuture<>();

      public a(@Nullable ub $$0) {
         this.a = $$0;
      }

      @Nullable
      ub a() {
         ub $$0 = this.a;
         return $$0 == null ? null : $$0.i();
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
