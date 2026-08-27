import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class aks {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azb> b = CompletableFuture.completedFuture(azb.a);
   private final akr.b c;
   private final aks.a d;
   private final ee e;
   private final cxg f;
   private final awi g;
   private final aku h;
   private final akv i;

   private aks(jk.b $$0, cnu $$1, ee.a $$2, int $$3) {
      this.c = new akr.b($$0);
      this.d = new aks.a($$0);
      this.d.a(aks.b.a);
      this.f = new cxg(this.d);
      this.g = new awi($$0);
      this.e = new ee($$2, dz.a(this.d, $$1));
      this.h = new aku(this.d);
      this.i = new akv($$3, this.e.a());
   }

   public akv a() {
      return this.i;
   }

   public akr.b b() {
      return this.c;
   }

   public cxg c() {
      return this.f;
   }

   public ee d() {
      return this.e;
   }

   public aku e() {
      return this.h;
   }

   public List<atl> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<aks> a(atr $$0, jd<akq> $$1, cnu $$2, ee.a $$3, int $$4, Executor $$5, Executor $$6) {
      return akr.a($$1, $$0, $$5).thenCompose($$6x -> {
         aks $$7 = new aks($$6x.a(), $$2, $$3, $$4);
         return atx.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(aks.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (awi.a<?>)$$0));
      dna.f();
      ddg.a();
   }

   private static <T> void a(jk $$0, awi.a<T> $$1) {
      akg<? extends jj<T>> $$2 = $$1.a();
      Map<awg<T>, List<iw<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awg.a($$2, (akh)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends iw<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements iy.a {
      private final jk a;
      aks.b b;

      a(jk $$0) {
         this.b = aks.b.b;
         this.a = $$0;
      }

      public void a(aks.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<akg<? extends jj<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> iy.b<T> a(final iy.b<T> $$0, final iy.b<T> $$1) {
         return new iy.b.a<T>() {
            @Override
            public iy.b<T> a() {
               return switch (a.this.b) {
                  case b -> $$0;
                  case a -> $$1;
               };
            }
         };
      }
   }

   static enum b {
      a,
      b;
   }
}
