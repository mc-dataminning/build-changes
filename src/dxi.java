import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.SequencedMap;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxi implements dxf, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final AtomicBoolean b = new AtomicBoolean();
   private final bqd<bqf.b> c;
   private final dxn d;
   private final SequencedMap<dcy, dxi.a> e = new LinkedHashMap<>();
   private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> f = new Long2ObjectLinkedOpenHashMap();
   private static final int g = 1024;

   protected dxi(dxp $$0, Path $$1, boolean $$2) {
      this.d = new dxn($$0, $$1, $$2);
      this.c = new bqd<>(new bqf.a(dxi.b.values().length), ad.h(), "IOWorker-" + $$0.c());
   }

   public boolean a(dcy $$0, int $$1) {
      dcy $$2 = new dcy($$0.e - $$1, $$0.f - $$1);
      dcy $$3 = new dcy($$0.e + $$1, $$0.f + $$1);

      for (int $$4 = $$2.h(); $$4 <= $$3.h(); $$4++) {
         for (int $$5 = $$2.i(); $$5 <= $$3.i(); $$5++) {
            BitSet $$6 = this.a($$4, $$5).join();
            if (!$$6.isEmpty()) {
               dcy $$7 = dcy.a($$4, $$5);
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
      long $$2 = dcy.c($$0, $$1);
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
         dcy $$2 = dcy.a($$0, $$1);
         dcy $$3 = dcy.b($$0, $$1);
         BitSet $$4 = new BitSet();
         dcy.a($$2, $$3).forEach($$1xx -> {
            vj $$2x = new vj(new vl(uk.a, "DataVersion"), new vl(uf.b, "blending_data"));

            try {
               this.a($$1xx, $$2x).join();
            } catch (Exception var7) {
               a.warn("Failed to scan chunk {}", $$1xx, var7);
               return;
            }

            if ($$2x.d() instanceof uf $$5 && this.a($$5)) {
               int $$6 = $$1xx.k() * 32 + $$1xx.j();
               $$4.set($$6);
            }
         });
         return $$4;
      }, ad.g());
   }

   private boolean a(uf $$0) {
      return $$0.b("DataVersion", 99) && $$0.h("DataVersion") >= 3441 ? $$0.b("blending_data", 10) : true;
   }

   public CompletableFuture<Void> a(dcy $$0, @Nullable uf $$1) {
      return this.a($$0, () -> $$1);
   }

   public CompletableFuture<Void> a(dcy $$0, Supplier<uf> $$1) {
      return this.a(() -> {
         uf $$2 = $$1.get();
         dxi.a $$3 = this.e.computeIfAbsent($$0, $$1xx -> new dxi.a($$2));
         $$3.a = $$2;
         return Either.left($$3.b);
      }).thenCompose(Function.identity());
   }

   public CompletableFuture<Optional<uf>> a(dcy $$0) {
      return this.a(() -> {
         dxi.a $$1 = this.e.get($$0);
         if ($$1 != null) {
            return Either.left(Optional.ofNullable($$1.a()));
         } else {
            try {
               uf $$2 = this.d.a($$0);
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
   public CompletableFuture<Void> a(dcy $$0, uz $$1) {
      return this.a(() -> {
         try {
            dxi.a $$2 = this.e.get($$0);
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
      return this.c.c($$1 -> new bqf.b(dxi.b.a.ordinal(), () -> {
            if (!this.b.get()) {
               $$1.a($$0.get());
            }

            this.c();
         }));
   }

   private void b() {
      Entry<dcy, dxi.a> $$0 = this.e.pollFirstEntry();
      if ($$0 != null) {
         this.a($$0.getKey(), $$0.getValue());
         this.c();
      }
   }

   private void c() {
      this.c.a(new bqf.b(dxi.b.b.ordinal(), this::b));
   }

   private void a(dcy $$0, dxi.a $$1) {
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
         this.c.b($$0 -> new bqf.b(dxi.b.c.ordinal(), () -> $$0.a(bah.a))).join();
         this.c.close();

         try {
            this.d.close();
         } catch (Exception var2) {
            a.error("Failed to close storage", var2);
         }
      }
   }

   public dxp a() {
      return this.d.b();
   }

   static class a {
      @Nullable
      uf a;
      final CompletableFuture<Void> b = new CompletableFuture<>();

      public a(@Nullable uf $$0) {
         this.a = $$0;
      }

      @Nullable
      uf a() {
         uf $$0 = this.a;
         return $$0 == null ? null : $$0.i();
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
