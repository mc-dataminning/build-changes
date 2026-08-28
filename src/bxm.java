import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxm extends bwz<bvo> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bvg, Float> f;
   private final Function<bvg, Double> g;

   public bxm(Function<bvg, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxm(Function<bvg, Float> $$0, Function<bvg, Double> $$1) {
      super(af.a(() -> {
         Builder<cek<?>, cel> $$0x = ImmutableMap.builder();
         $$0x.put(cek.n, cel.c);
         $$0x.put(cek.m, cel.c);
         $$0x.put(cek.P, cel.b);
         $$0x.put(cek.R, cel.c);
         $$0x.put(cek.O, cel.a);
         $$0x.put(cek.r, cel.b);
         $$0x.put(cek.Z, cel.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvo $$0) {
      return this.f.apply($$0);
   }

   private Optional<cox> b(bvo $$0) {
      return $$0.ec().c(cek.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arc $$0, bvo $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cek.r) && !$$1.ec().a(cek.Z);
   }

   protected void b(arc $$0, bvo $$1, long $$2) {
      $$1.ec().a(cek.R, true);
   }

   protected void c(arc $$0, bvo $$1, long $$2) {
      bwi<?> $$3 = $$1.ec();
      $$3.a(cek.P, 100);
      $$3.a(cek.R, false);
      $$3.b(cek.m);
      $$3.b(cek.n);
   }

   protected void d(arc $$0, bvo $$1, long $$2) {
      cox $$3 = this.b($$1).get();
      bwi<?> $$4 = $$1.ec();
      $$4.a(cek.n, new bxk($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(cek.m);
      } else {
         $$4.a(cek.m, new cen(new bxk($$3, false), this.a($$1), 2));
      }
   }
}
