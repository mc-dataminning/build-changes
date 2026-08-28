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

public class alb {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azr> b = CompletableFuture.completedFuture(azr.a);
   private final ala.b c;
   private final alb.a d;
   private final eu e;
   private final czb f;
   private final awv g;
   private final ald h;
   private final ale i;

   private alb(ka.b $$0, cpj $$1, eu.a $$2, int $$3) {
      this.c = new ala.b($$0);
      this.d = new alb.a($$0);
      this.d.a(alb.b.a);
      this.f = new czb(this.d);
      this.g = new awv($$0);
      this.e = new eu($$2, ep.a(this.d, $$1));
      this.h = new ald(this.d);
      this.i = new ale($$3, this.e.a());
   }

   public ale a() {
      return this.i;
   }

   public ala.b b() {
      return this.c;
   }

   public czb c() {
      return this.f;
   }

   public eu d() {
      return this.e;
   }

   public ald e() {
      return this.h;
   }

   public List<atx> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<alb> a(aud $$0, jt<akz> $$1, cpj $$2, eu.a $$3, int $$4, Executor $$5, Executor $$6) {
      return ala.a($$1, $$0, $$5).thenCompose($$6x -> {
         alb $$7 = new alb($$6x.a(), $$2, $$3, $$4);
         return auj.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(alb.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (awv.a<?>)$$0));
      dpt.f();
      dfy.a();
   }

   private static <T> void a(ka $$0, awv.a<T> $$1) {
      akp<? extends jz<T>> $$2 = $$1.a();
      Map<awt<T>, List<jm<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awt.a($$2, (akq)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends jm<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jo.a {
      private final ka a;
      alb.b b;

      a(ka $$0) {
         this.b = alb.b.b;
         this.a = $$0;
      }

      public void a(alb.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<akp<? extends jz<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jo.b<T>> a(akp<? extends jz<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.q(), $$0x.v()));
      }

      private <T> jo.b<T> a(final jo.b<T> $$0, final jo.b<T> $$1) {
         return new jo.b.a<T>() {
            @Override
            public jo.b<T> a() {
               return switch (a.this.b) {
                  case a -> $$1;
                  case b -> $$0;
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
