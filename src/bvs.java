import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvs extends bvf<btu> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btl, Float> f;
   private final Function<btl, Double> g;

   public bvs(Function<btl, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvs(Function<btl, Float> $$0, Function<btl, Double> $$1) {
      super(ad.a(() -> {
         Builder<ccq<?>, ccr> $$0x = ImmutableMap.builder();
         $$0x.put(ccq.n, ccr.c);
         $$0x.put(ccq.m, ccr.c);
         $$0x.put(ccq.P, ccr.b);
         $$0x.put(ccq.R, ccr.c);
         $$0x.put(ccq.O, ccr.a);
         $$0x.put(ccq.r, ccr.b);
         $$0x.put(ccq.Z, ccr.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btu $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmv> b(btu $$0) {
      return $$0.dU().c(ccq.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqt $$0, btu $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dU().a(ccq.r) && !$$1.dU().a(ccq.Z);
   }

   protected void b(aqt $$0, btu $$1, long $$2) {
      $$1.dU().a(ccq.R, true);
   }

   protected void c(aqt $$0, btu $$1, long $$2) {
      buo<?> $$3 = $$1.dU();
      $$3.a(ccq.P, 100);
      $$3.a(ccq.R, false);
      $$3.b(ccq.m);
      $$3.b(ccq.n);
   }

   protected void d(aqt $$0, btu $$1, long $$2) {
      cmv $$3 = this.b($$1).get();
      buo<?> $$4 = $$1.dU();
      $$4.a(ccq.n, new bvq($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayn.k($$5)) {
         $$4.b(ccq.m);
      } else {
         $$4.a(ccq.m, new cct(new bvq($$3, false), this.a($$1), 2));
      }
   }
}
