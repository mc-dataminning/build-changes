import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvh extends buu<btk> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btb, Float> f;
   private final Function<btb, Double> g;

   public bvh(Function<btb, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvh(Function<btb, Float> $$0, Function<btb, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccf<?>, ccg> $$0x = ImmutableMap.builder();
         $$0x.put(ccf.n, ccg.c);
         $$0x.put(ccf.m, ccg.c);
         $$0x.put(ccf.P, ccg.b);
         $$0x.put(ccf.R, ccg.c);
         $$0x.put(ccf.O, ccg.a);
         $$0x.put(ccf.r, ccg.b);
         $$0x.put(ccf.Z, ccg.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btk $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmk> b(btk $$0) {
      return $$0.dU().c(ccf.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqm $$0, btk $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dU().a(ccf.r) && !$$1.dU().a(ccf.Z);
   }

   protected void b(aqm $$0, btk $$1, long $$2) {
      $$1.dU().a(ccf.R, true);
   }

   protected void c(aqm $$0, btk $$1, long $$2) {
      bud<?> $$3 = $$1.dU();
      $$3.a(ccf.P, 100);
      $$3.a(ccf.R, false);
      $$3.b(ccf.m);
      $$3.b(ccf.n);
   }

   protected void d(aqm $$0, btk $$1, long $$2) {
      cmk $$3 = this.b($$1).get();
      bud<?> $$4 = $$1.dU();
      $$4.a(ccf.n, new bvf($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayg.k($$5)) {
         $$4.b(ccf.m);
      } else {
         $$4.a(ccf.m, new cci(new bvf($$3, false), this.a($$1), 2));
      }
   }
}
