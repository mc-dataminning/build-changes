import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxb extends bwo<bvd> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<buv, Float> f;
   private final Function<buv, Double> g;

   public bxb(Function<buv, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxb(Function<buv, Float> $$0, Function<buv, Double> $$1) {
      super(ad.a(() -> {
         Builder<cdz<?>, cea> $$0x = ImmutableMap.builder();
         $$0x.put(cdz.n, cea.c);
         $$0x.put(cdz.m, cea.c);
         $$0x.put(cdz.P, cea.b);
         $$0x.put(cdz.R, cea.c);
         $$0x.put(cdz.O, cea.a);
         $$0x.put(cdz.r, cea.b);
         $$0x.put(cdz.Z, cea.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvd $$0) {
      return this.f.apply($$0);
   }

   private Optional<coh> b(bvd $$0) {
      return $$0.ed().c(cdz.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arm $$0, bvd $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ed().a(cdz.r) && !$$1.ed().a(cdz.Z);
   }

   protected void b(arm $$0, bvd $$1, long $$2) {
      $$1.ed().a(cdz.R, true);
   }

   protected void c(arm $$0, bvd $$1, long $$2) {
      bvx<?> $$3 = $$1.ed();
      $$3.a(cdz.P, 100);
      $$3.a(cdz.R, false);
      $$3.b(cdz.m);
      $$3.b(cdz.n);
   }

   protected void d(arm $$0, bvd $$1, long $$2) {
      coh $$3 = this.b($$1).get();
      bvx<?> $$4 = $$1.ed();
      $$4.a(cdz.n, new bwz($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azj.k($$5)) {
         $$4.b(cdz.m);
      } else {
         $$4.a(cdz.m, new cec(new bwz($$3, false), this.a($$1), 2));
      }
   }
}
