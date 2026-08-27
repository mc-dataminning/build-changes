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

public class ajm {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<axo> b = CompletableFuture.completedFuture(axo.a);
   private final ajm.a c;
   private final dv d;
   private final csv e;
   private final auv f;
   private final ekb g;
   private final ajo h;
   private final ajp i;

   public ajm(iy.b $$0, ckl $$1, dv.a $$2, int $$3) {
      this.c = new ajm.a($$0);
      this.c.a(ajm.b.a);
      this.e = new csv(this.c);
      this.f = new auv($$0);
      this.d = new dv($$2, dq.a(this.c, $$1));
      this.g = new ekb(this.c);
      this.h = new ajo(this.c, this.g);
      this.i = new ajp($$3, this.d.a());
   }

   public ajp a() {
      return this.i;
   }

   public ekb b() {
      return this.g;
   }

   public csv c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public ajo e() {
      return this.h;
   }

   public List<arz> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<ajm> a(asf $$0, iy.b $$1, ckl $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      ajm $$7 = new ajm($$1, $$2, $$3, $$4);
      return asl.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(ajm.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iy $$0) {
      this.f.a().forEach($$1 -> a($$0, (auv.a<?>)$$1));
      dja.f();
      czh.a();
   }

   private static <T> void a(iy $$0, auv.a<T> $$1) {
      ajb<? extends ix<T>> $$2 = $$1.a();
      Map<aut<T>, List<il<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> aut.a($$2, (ajc)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends il<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements in.a {
      private final iy a;
      ajm.b b;

      a(iy $$0) {
         this.b = ajm.b.b;
         this.a = $$0;
      }

      public void a(ajm.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ajb<? extends ix<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<in.b<T>> a(ajb<? extends ix<? extends T>> $$0) {
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
