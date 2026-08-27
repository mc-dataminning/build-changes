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

public class ale {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azo> b = CompletableFuture.completedFuture(azo.a);
   private final ald.b c;
   private final ale.a d;
   private final ei e;
   private final czd f;
   private final awv g;
   private final alg h;
   private final alh i;

   private ale(jo.b $$0, cop $$1, ei.a $$2, int $$3) {
      this.c = new ald.b($$0);
      this.d = new ale.a($$0);
      this.d.a(ale.b.a);
      this.f = new czd(this.d);
      this.g = new awv($$0);
      this.e = new ei($$2, ed.a(this.d, $$1));
      this.h = new alg(this.d);
      this.i = new alh($$3, this.e.a());
   }

   public alh a() {
      return this.i;
   }

   public ald.b b() {
      return this.c;
   }

   public czd c() {
      return this.f;
   }

   public ei d() {
      return this.e;
   }

   public alg e() {
      return this.h;
   }

   public List<atx> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<ale> a(aud $$0, jh<alc> $$1, cop $$2, ei.a $$3, int $$4, Executor $$5, Executor $$6) {
      return ald.a($$1, $$0, $$5).thenCompose($$6x -> {
         ale $$7 = new ale($$6x.a(), $$2, $$3, $$4);
         return auj.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(ale.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (awv.a<?>)$$0));
      dpp.f();
      dfe.a();
   }

   private static <T> void a(jo $$0, awv.a<T> $$1) {
      aks<? extends jn<T>> $$2 = $$1.a();
      Map<awt<T>, List<ja<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awt.a($$2, (akt)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ja<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jc.a {
      private final jo a;
      ale.b b;

      a(jo $$0) {
         this.b = ale.b.b;
         this.a = $$0;
      }

      public void a(ale.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<aks<? extends jn<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> jc.b<T> a(final jc.b<T> $$0, final jc.b<T> $$1) {
         return new jc.b.a<T>() {
            @Override
            public jc.b<T> a() {
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
