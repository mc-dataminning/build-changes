import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvx extends bvk<bua> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btr, Float> f;
   private final Function<btr, Double> g;

   public bvx(Function<btr, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvx(Function<btr, Float> $$0, Function<btr, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccv<?>, ccw> $$0x = ImmutableMap.builder();
         $$0x.put(ccv.n, ccw.c);
         $$0x.put(ccv.m, ccw.c);
         $$0x.put(ccv.P, ccw.b);
         $$0x.put(ccv.R, ccw.c);
         $$0x.put(ccv.O, ccw.a);
         $$0x.put(ccv.r, ccw.b);
         $$0x.put(ccv.Z, ccw.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bua $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmz> b(bua $$0) {
      return $$0.dS().c(ccv.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arf $$0, bua $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(ccv.r) && !$$1.dS().a(ccv.Z);
   }

   protected void b(arf $$0, bua $$1, long $$2) {
      $$1.dS().a(ccv.R, true);
   }

   protected void c(arf $$0, bua $$1, long $$2) {
      but<?> $$3 = $$1.dS();
      $$3.a(ccv.P, 100);
      $$3.a(ccv.R, false);
      $$3.b(ccv.m);
      $$3.b(ccv.n);
   }

   protected void d(arf $$0, bua $$1, long $$2) {
      cmz $$3 = this.b($$1).get();
      but<?> $$4 = $$1.dS();
      $$4.a(ccv.n, new bvv($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(ccv.m);
      } else {
         $$4.a(ccv.m, new ccy(new bvv($$3, false), this.a($$1), 2));
      }
   }
}
