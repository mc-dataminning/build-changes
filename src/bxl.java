import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxl extends bwy<bvn> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bvf, Float> f;
   private final Function<bvf, Double> g;

   public bxl(Function<bvf, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxl(Function<bvf, Float> $$0, Function<bvf, Double> $$1) {
      super(af.a(() -> {
         Builder<cej<?>, cek> $$0x = ImmutableMap.builder();
         $$0x.put(cej.n, cek.c);
         $$0x.put(cej.m, cek.c);
         $$0x.put(cej.P, cek.b);
         $$0x.put(cej.R, cek.c);
         $$0x.put(cej.O, cek.a);
         $$0x.put(cej.r, cek.b);
         $$0x.put(cej.Z, cek.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvn $$0) {
      return this.f.apply($$0);
   }

   private Optional<cov> b(bvn $$0) {
      return $$0.ec().c(cej.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arc $$0, bvn $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cej.r) && !$$1.ec().a(cej.Z);
   }

   protected void b(arc $$0, bvn $$1, long $$2) {
      $$1.ec().a(cej.R, true);
   }

   protected void c(arc $$0, bvn $$1, long $$2) {
      bwh<?> $$3 = $$1.ec();
      $$3.a(cej.P, 100);
      $$3.a(cej.R, false);
      $$3.b(cej.m);
      $$3.b(cej.n);
   }

   protected void d(arc $$0, bvn $$1, long $$2) {
      cov $$3 = this.b($$1).get();
      bwh<?> $$4 = $$1.ec();
      $$4.a(cej.n, new bxj($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayy.k($$5)) {
         $$4.b(cej.m);
      } else {
         $$4.a(cej.m, new cem(new bxj($$3, false), this.a($$1), 2));
      }
   }
}
