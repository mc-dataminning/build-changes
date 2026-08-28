import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bwk extends bvx<bun> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<buf, Float> f;
   private final Function<buf, Double> g;

   public bwk(Function<buf, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bwk(Function<buf, Float> $$0, Function<buf, Double> $$1) {
      super(ad.a(() -> {
         Builder<cdi<?>, cdj> $$0x = ImmutableMap.builder();
         $$0x.put(cdi.n, cdj.c);
         $$0x.put(cdi.m, cdj.c);
         $$0x.put(cdi.P, cdj.b);
         $$0x.put(cdi.R, cdj.c);
         $$0x.put(cdi.O, cdj.a);
         $$0x.put(cdi.r, cdj.b);
         $$0x.put(cdi.Z, cdj.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bun $$0) {
      return this.f.apply($$0);
   }

   private Optional<cnp> b(bun $$0) {
      return $$0.dX().c(cdi.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arg $$0, bun $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dX().a(cdi.r) && !$$1.dX().a(cdi.Z);
   }

   protected void b(arg $$0, bun $$1, long $$2) {
      $$1.dX().a(cdi.R, true);
   }

   protected void c(arg $$0, bun $$1, long $$2) {
      bvg<?> $$3 = $$1.dX();
      $$3.a(cdi.P, 100);
      $$3.a(cdi.R, false);
      $$3.b(cdi.m);
      $$3.b(cdi.n);
   }

   protected void d(arg $$0, bun $$1, long $$2) {
      cnp $$3 = this.b($$1).get();
      bvg<?> $$4 = $$1.dX();
      $$4.a(cdi.n, new bwi($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azc.k($$5)) {
         $$4.b(cdi.m);
      } else {
         $$4.a(cdi.m, new cdl(new bwi($$3, false), this.a($$1), 2));
      }
   }
}
