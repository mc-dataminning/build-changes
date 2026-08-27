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

public class akp {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<ayy> b = CompletableFuture.completedFuture(ayy.a);
   private final akp.a c;
   private final ed d;
   private final cwj e;
   private final awf f;
   private final eod g;
   private final akr h;
   private final aks i;

   public akp(jj.b $$0, cmy $$1, ed.a $$2, int $$3) {
      this.c = new akp.a($$0);
      this.c.a(akp.b.a);
      this.e = new cwj(this.c);
      this.f = new awf($$0);
      this.d = new ed($$2, dy.a(this.c, $$1));
      this.g = new eod(this.c);
      this.h = new akr(this.c, this.g);
      this.i = new aks($$3, this.d.a());
   }

   public aks a() {
      return this.i;
   }

   public eod b() {
      return this.g;
   }

   public cwj c() {
      return this.e;
   }

   public ed d() {
      return this.d;
   }

   public akr e() {
      return this.h;
   }

   public List<ati> f() {
      return List.of(this.f, this.g, this.e, this.i, this.h);
   }

   public static CompletableFuture<akp> a(ato $$0, jj.b $$1, cmy $$2, ed.a $$3, int $$4, Executor $$5, Executor $$6) {
      akp $$7 = new akp($$1, $$2, $$3, $$4);
      return atu.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1x, $$2x) -> $$7.c.a(akp.b.b)).thenApply($$1x -> $$7);
   }

   public void a(jj $$0) {
      this.f.a().forEach($$1 -> a($$0, (awf.a<?>)$$1));
      dmr.f();
      dcx.a();
   }

   private static <T> void a(jj $$0, awf.a<T> $$1) {
      ake<? extends ji<T>> $$2 = $$1.a();
      Map<awd<T>, List<iv<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awd.a($$2, (akf)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends iv<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements ix.a {
      private final jj a;
      akp.b b;

      a(jj $$0) {
         this.b = akp.b.b;
         this.a = $$0;
      }

      public void a(akp.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ake<? extends ji<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> ix.b<T> a(final ix.b<T> $$0, final ix.b<T> $$1) {
         return new ix.b.a<T>() {
            @Override
            public ix.b<T> a() {
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
