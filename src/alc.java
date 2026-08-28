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

public class alc {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azs> b = CompletableFuture.completedFuture(azs.a);
   private final alb.b c;
   private final alc.a d;
   private final eu e;
   private final czd f;
   private final aww g;
   private final ale h;
   private final alf i;

   private alc(ka.b $$0, cpl $$1, eu.a $$2, int $$3) {
      this.c = new alb.b($$0);
      this.d = new alc.a($$0);
      this.d.a(alc.b.a);
      this.f = new czd(this.d);
      this.g = new aww($$0);
      this.e = new eu($$2, ep.a(this.d, $$1));
      this.h = new ale(this.d);
      this.i = new alf($$3, this.e.a());
   }

   public alf a() {
      return this.i;
   }

   public alb.b b() {
      return this.c;
   }

   public czd c() {
      return this.f;
   }

   public eu d() {
      return this.e;
   }

   public ale e() {
      return this.h;
   }

   public List<aty> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<alc> a(aue $$0, jt<ala> $$1, cpl $$2, eu.a $$3, int $$4, Executor $$5, Executor $$6) {
      return alb.a($$1, $$0, $$5).thenCompose($$6x -> {
         alc $$7 = new alc($$6x.a(), $$2, $$3, $$4);
         return auk.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(alc.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (aww.a<?>)$$0));
      dpv.f();
      dga.a();
   }

   private static <T> void a(ka $$0, aww.a<T> $$1) {
      akq<? extends jz<T>> $$2 = $$1.a();
      Map<awu<T>, List<jm<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awu.a($$2, (akr)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends jm<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jo.a {
      private final ka a;
      alc.b b;

      a(ka $$0) {
         this.b = alc.b.b;
         this.a = $$0;
      }

      public void a(alc.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<akq<? extends jz<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jo.b<T>> a(akq<? extends jz<? extends T>> $$0) {
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
