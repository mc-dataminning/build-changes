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

public class dyr implements dyo, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final AtomicBoolean b = new AtomicBoolean();
   private final bqv c;
   private final dyw d;
   private final SequencedMap<deh, dyr.a> e = new LinkedHashMap<>();
   private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> f = new Long2ObjectLinkedOpenHashMap();
   private static final int g = 1024;

   protected dyr(dyy $$0, Path $$1, boolean $$2) {
      this.d = new dyw($$0, $$1, $$2);
      this.c = new bqv(dyr.b.values().length, ae.h(), "IOWorker-" + $$0.c());
   }

   public boolean a(deh $$0, int $$1) {
      deh $$2 = new deh($$0.g - $$1, $$0.h - $$1);
      deh $$3 = new deh($$0.g + $$1, $$0.h + $$1);

      for (int $$4 = $$2.h(); $$4 <= $$3.h(); $$4++) {
         for (int $$5 = $$2.i(); $$5 <= $$3.i(); $$5++) {
            BitSet $$6 = this.a($$4, $$5).join();
            if (!$$6.isEmpty()) {
               deh $$7 = deh.a($$4, $$5);
               int $$8 = Math.max($$2.g - $$7.g, 0);
               int $$9 = Math.max($$2.h - $$7.h, 0);
               int $$10 = Math.min($$3.g - $$7.g, 31);
               int $$11 = Math.min($$3.h - $$7.h, 31);

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
      long $$2 = deh.c($$0, $$1);
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
         deh $$2 = deh.a($$0, $$1);
         deh $$3 = deh.b($$0, $$1);
         BitSet $$4 = new BitSet();
         deh.a($$2, $$3).forEach($$1xx -> {
            vo $$2x = new vo(new vq(up.a, "DataVersion"), new vq(uk.b, "blending_data"));

            try {
               this.a($$1xx, $$2x).join();
            } catch (Exception var7) {
               a.warn("Failed to scan chunk {}", $$1xx, var7);
               return;
            }

            if ($$2x.d() instanceof uk $$5 && this.a($$5)) {
               int $$6 = $$1xx.k() * 32 + $$1xx.j();
               $$4.set($$6);
            }
         });
         return $$4;
      }, ae.g());
   }

   private boolean a(uk $$0) {
      return $$0.b("DataVersion", 99) && $$0.h("DataVersion") >= 3441 ? $$0.b("blending_data", 10) : true;
   }

   public CompletableFuture<Void> a(deh $$0, @Nullable uk $$1) {
      return this.a($$0, () -> $$1);
   }

   public CompletableFuture<Void> a(deh $$0, Supplier<uk> $$1) {
      return this.<CompletableFuture<Void>>a((Supplier<CompletableFuture<Void>>)(() -> {
         uk $$2 = $$1.get();
         dyr.a $$3 = this.e.computeIfAbsent($$0, $$1xx -> new dyr.a($$2));
         $$3.a = $$2;
         return $$3.b;
      })).thenCompose(Function.identity());
   }

   public CompletableFuture<Optional<uk>> a(deh $$0) {
      return this.a((dyr.c<Optional<uk>>)(() -> {
         dyr.a $$1 = this.e.get($$0);
         if ($$1 != null) {
            return Optional.ofNullable($$1.a());
         } else {
            try {
               uk $$2 = this.d.a($$0);
               return Optional.ofNullable($$2);
            } catch (Exception var4) {
               a.warn("Failed to read chunk {}", $$0, var4);
               throw var4;
            }
         }
      }));
   }

   public CompletableFuture<Void> a(boolean $$0) {
      CompletableFuture<Void> $$1 = this.<CompletableFuture<Void>>a(
            (Supplier<CompletableFuture<Void>>)(() -> CompletableFuture.allOf(this.e.values().stream().map($$0x -> $$0x.b).toArray(CompletableFuture[]::new)))
         )
         .thenCompose(Function.identity());
      return $$0 ? $$1.thenCompose($$0x -> this.a((dyr.c<Void>)(() -> {
            try {
               this.d.a();
               return null;
            } catch (Exception var2x) {
               a.warn("Failed to synchronize chunks", var2x);
               throw var2x;
            }
         }))) : $$1.thenCompose($$0x -> this.a((Supplier<Void>)(() -> null)));
   }

   @Override
   public CompletableFuture<Void> a(deh $$0, ve $$1) {
      return this.a((dyr.c<Void>)(() -> {
         try {
            dyr.a $$2 = this.e.get($$0);
            if ($$2 != null) {
               if ($$2.a != null) {
                  $$2.a.b($$1);
               }
            } else {
               this.d.a($$0, $$1);
            }

            return null;
         } catch (Exception var4) {
            a.warn("Failed to bulk scan chunk {}", $$0, var4);
            throw var4;
         }
      }));
   }

   private <T> CompletableFuture<T> a(dyr.c<T> $$0) {
      return this.c.a(dyr.b.a.ordinal(), $$1 -> {
         if (!this.b.get()) {
            try {
               $$1.complete($$0.get());
            } catch (Exception var4) {
               $$1.completeExceptionally(var4);
            }
         }

         this.c();
      });
   }

   private <T> CompletableFuture<T> a(Supplier<T> $$0) {
      return this.c.a(dyr.b.a.ordinal(), $$1 -> {
         if (!this.b.get()) {
            $$1.complete($$0.get());
         }

         this.c();
      });
   }

   private void b() {
      Entry<deh, dyr.a> $$0 = this.e.pollFirstEntry();
      if ($$0 != null) {
         this.a($$0.getKey(), $$0.getValue());
         this.c();
      }
   }

   private void c() {
      this.c.a_(new bqx.c(dyr.b.b.ordinal(), this::b));
   }

   private void a(deh $$0, dyr.a $$1) {
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
         this.d();
         this.c.close();

         try {
            this.d.close();
         } catch (Exception var2) {
            a.error("Failed to close storage", var2);
         }
      }
   }

   private void d() {
      this.c.a(dyr.b.c.ordinal(), $$0 -> $$0.complete(bap.a)).join();
   }

   public dyy a() {
      return this.d.b();
   }

   static class a {
      @Nullable
      uk a;
      final CompletableFuture<Void> b = new CompletableFuture<>();

      public a(@Nullable uk $$0) {
         this.a = $$0;
      }

      @Nullable
      uk a() {
         uk $$0 = this.a;
         return $$0 == null ? null : $$0.i();
      }
   }

   static enum b {
      a,
      b,
      c;
   }

   @FunctionalInterface
   interface c<T> {
      @Nullable
      T get() throws Exception;
   }
}
