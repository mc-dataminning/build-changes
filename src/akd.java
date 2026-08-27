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

public class akd {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<aym> b = CompletableFuture.completedFuture(aym.a);
   private final akd.a c;
   private final dv d;
   private final cvm e;
   private final avt f;
   private final ene g;
   private final akf h;
   private final akg i;

   public akd(iz.b $$0, cmg $$1, dv.a $$2, int $$3) {
      this.c = new akd.a($$0);
      this.c.a(akd.b.a);
      this.e = new cvm(this.c);
      this.f = new avt($$0);
      this.d = new dv($$2, dq.a(this.c, $$1));
      this.g = new ene(this.c);
      this.h = new akf(this.c, this.g);
      this.i = new akg($$3, this.d.a());
   }

   public akg a() {
      return this.i;
   }

   public ene b() {
      return this.g;
   }

   public cvm c() {
      return this.e;
   }

   public dv d() {
      return this.d;
   }

   public akf e() {
      return this.h;
   }

   public List<asw> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<akd> a(atc $$0, iz.b $$1, cmg $$2, dv.a $$3, int $$4, Executor $$5, Executor $$6) {
      akd $$7 = new akd($$1, $$2, $$3, $$4);
      return ati.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(akd.b.b)).thenApply($$1x -> $$7);
   }

   public void a(iz $$0) {
      this.f.a().forEach($$1 -> a($$0, (avt.a<?>)$$1));
      dlt.f();
      dca.a();
   }

   private static <T> void a(iz $$0, avt.a<T> $$1) {
      ajs<? extends iy<T>> $$2 = $$1.a();
      Map<avr<T>, List<il<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> avr.a($$2, (ajt)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends il<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements in.a {
      private final iz a;
      akd.b b;

      a(iz $$0) {
         this.b = akd.b.b;
         this.a = $$0;
      }

      public void a(akd.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ajs<? extends iy<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<in.b<T>> a(ajs<? extends iy<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> in.b<T> a(final in.b<T> $$0, final in.b<T> $$1) {
         return new in.b.a<T>() {
            @Override
            public in.b<T> a() {
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
