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

public class ajr {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<axy> b = CompletableFuture.completedFuture(axy.a);
   private final ajr.a c;
   private final dv d;
   private final ctq e;
   private final avf f;
   private final ekx g;
   private final ajt h;
   private final aju i;

   public ajr(iz.b $$0, clf $$1, dv.a $$2, int $$3) {
      this.c = new ajr.a($$0);
      this.c.a(ajr.b.a);
      this.e = new ctq(this.c);
      this.f = new avf($$0);
      this.d = new dv($$2, dq.a(this.c, $$1));
      this.g = new ekx(this.c);
      this.h = new ajt(this.c, this.g);
      this.i = new aju($$3, this.d.a());
   }

   public aju a() {
      return this.i;
   }

   public ekx b() {
      return this.g;
   }

   public ctq c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public ajt e() {
      return this.h;
   }

   public List<asi> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ajr> a(aso $$0, iz.b $$1, clf $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      ajr $$7 = new ajr($$1, $$2, $$3, $$4);
      return asu.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(ajr.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iz $$0) {
      this.f.a().forEach($$1 -> a($$0, (avf.a<?>)$$1));
      djv.f();
      dac.a();
   }

   private static <T> void a(iz $$0, avf.a<T> $$1) {
      ajg<? extends iy<T>> $$2 = $$1.a();
      Map<avd<T>, List<il<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> avd.a($$2, (ajh)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends il<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements in.a {
      private final iz a;
      ajr.b b;

      a(iz $$0) {
         this.b = ajr.b.b;
         this.a = $$0;
      }

      public void a(ajr.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ajg<? extends iy<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<in.b<T>> a(ajg<? extends iy<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> in.b<T> a(final in.b<T> $$0, final in.b<T> $$1) {
         return new in.b.a<T>() {
            @Override
            protected in.b<T> a() {
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
