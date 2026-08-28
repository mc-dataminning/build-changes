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

public class alq {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bac> b = CompletableFuture.completedFuture(bac.a);
   private final alp.b c;
   private final alq.a d;
   private final eq e;
   private final cyz f;
   private final axh g;
   private final als h;
   private final alt i;

   private alq(jw.b $$0, cpm $$1, eq.a $$2, int $$3) {
      this.c = new alp.b($$0);
      this.d = new alq.a($$0);
      this.d.a(alq.b.a);
      this.f = new cyz(this.d);
      this.g = new axh($$0);
      this.e = new eq($$2, el.a(this.d, $$1));
      this.h = new als(this.d);
      this.i = new alt($$3, this.e.a());
   }

   public alt a() {
      return this.i;
   }

   public alp.b b() {
      return this.c;
   }

   public cyz c() {
      return this.f;
   }

   public eq d() {
      return this.e;
   }

   public als e() {
      return this.h;
   }

   public List<auj> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<alq> a(aup $$0, jp<alo> $$1, cpm $$2, eq.a $$3, int $$4, Executor $$5, Executor $$6) {
      return alp.a($$1, $$0, $$5).thenCompose($$6x -> {
         alq $$7 = new alq($$6x.a(), $$2, $$3, $$4);
         return auv.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(alq.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (axh.a<?>)$$0));
      dow.f();
      dfc.a();
   }

   private static <T> void a(jw $$0, axh.a<T> $$1) {
      ale<? extends jv<T>> $$2 = $$1.a();
      Map<axf<T>, List<ji<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> axf.a($$2, (alf)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ji<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jk.a {
      private final jw a;
      alq.b b;

      a(jw $$0) {
         this.b = alq.b.b;
         this.a = $$0;
      }

      public void a(alq.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ale<? extends jv<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jk.b<T>> a(ale<? extends jv<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> jk.b<T> a(final jk.b<T> $$0, final jk.b<T> $$1) {
         return new jk.b.a<T>() {
            @Override
            public jk.b<T> a() {
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
