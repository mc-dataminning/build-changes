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

public class eav implements eas, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final AtomicBoolean b = new AtomicBoolean();
   private final brs c;
   private final eba d;
   private final SequencedMap<dgf, eav.a> e = new LinkedHashMap<>();
   private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> f = new Long2ObjectLinkedOpenHashMap();
   private static final int g = 1024;

   protected eav(ebc $$0, Path $$1, boolean $$2) {
      this.d = new eba($$0, $$1, $$2);
      this.c = new brs(eav.b.values().length, ae.h(), "IOWorker-" + $$0.c());
   }

   public boolean a(dgf $$0, int $$1) {
      dgf $$2 = new dgf($$0.h - $$1, $$0.i - $$1);
      dgf $$3 = new dgf($$0.h + $$1, $$0.i + $$1);

      for (int $$4 = $$2.h(); $$4 <= $$3.h(); $$4++) {
         for (int $$5 = $$2.i(); $$5 <= $$3.i(); $$5++) {
            BitSet $$6 = this.a($$4, $$5).join();
            if (!$$6.isEmpty()) {
               dgf $$7 = dgf.a($$4, $$5);
               int $$8 = Math.max($$2.h - $$7.h, 0);
               int $$9 = Math.max($$2.i - $$7.i, 0);
               int $$10 = Math.min($$3.h - $$7.h, 31);
               int $$11 = Math.min($$3.i - $$7.i, 31);

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
      long $$2 = dgf.c($$0, $$1);
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
         dgf $$2 = dgf.a($$0, $$1);
         dgf $$3 = dgf.b($$0, $$1);
         BitSet $$4 = new BitSet();
         dgf.a($$2, $$3).forEach($$1xx -> {
            vq $$2x = new vq(new vs(ur.a, "DataVersion"), new vs(um.b, "blending_data"));

            try {
               this.a($$1xx, $$2x).join();
            } catch (Exception var7) {
               a.warn("Failed to scan chunk {}", $$1xx, var7);
               return;
            }

            if ($$2x.d() instanceof um $$5 && this.a($$5)) {
               int $$6 = $$1xx.k() * 32 + $$1xx.j();
               $$4.set($$6);
            }
         });
         return $$4;
      }, ae.g());
   }

   private boolean a(um $$0) {
      return $$0.b("DataVersion", 99) && $$0.h("DataVersion") >= 3441 ? $$0.b("blending_data", 10) : true;
   }

   public CompletableFuture<Void> a(dgf $$0, @Nullable um $$1) {
      return this.a($$0, () -> $$1);
   }

   public CompletableFuture<Void> a(dgf $$0, Supplier<um> $$1) {
      return this.<CompletableFuture<Void>>a((Supplier<CompletableFuture<Void>>)(() -> {
         um $$2 = $$1.get();
         eav.a $$3 = this.e.computeIfAbsent($$0, $$1xx -> new eav.a($$2));
         $$3.a = $$2;
         return $$3.b;
      })).thenCompose(Function.identity());
   }

   public CompletableFuture<Optional<um>> a(dgf $$0) {
      return this.a((eav.c<Optional<um>>)(() -> {
         eav.a $$1 = this.e.get($$0);
         if ($$1 != null) {
            return Optional.ofNullable($$1.a());
         } else {
            try {
               um $$2 = this.d.a($$0);
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
      return $$0 ? $$1.thenCompose($$0x -> this.a((eav.c<Void>)(() -> {
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
   public CompletableFuture<Void> a(dgf $$0, vg $$1) {
      return this.a((eav.c<Void>)(() -> {
         try {
            eav.a $$2 = this.e.get($$0);
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

   private <T> CompletableFuture<T> a(eav.c<T> $$0) {
      return this.c.a(eav.b.a.ordinal(), $$1 -> {
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
      return this.c.a(eav.b.a.ordinal(), $$1 -> {
         if (!this.b.get()) {
            $$1.complete($$0.get());
         }

         this.c();
      });
   }

   private void b() {
      Entry<dgf, eav.a> $$0 = this.e.pollFirstEntry();
      if ($$0 != null) {
         this.a($$0.getKey(), $$0.getValue());
         this.c();
      }
   }

   private void c() {
      this.c.a_(new bru.c(eav.b.b.ordinal(), this::b));
   }

   private void a(dgf $$0, eav.a $$1) {
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
      this.c.a(eav.b.c.ordinal(), $$0 -> $$0.complete(bba.a)).join();
   }

   public ebc a() {
      return this.d.b();
   }

   static class a {
      @Nullable
      um a;
      final CompletableFuture<Void> b = new CompletableFuture<>();

      public a(@Nullable um $$0) {
         this.a = $$0;
      }

      @Nullable
      um a() {
         um $$0 = this.a;
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
