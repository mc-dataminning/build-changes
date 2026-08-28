import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bve extends bur<bth> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bsy, Float> f;
   private final Function<bsy, Double> g;

   public bve(Function<bsy, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bve(Function<bsy, Float> $$0, Function<bsy, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccc<?>, ccd> $$0x = ImmutableMap.builder();
         $$0x.put(ccc.n, ccd.c);
         $$0x.put(ccc.m, ccd.c);
         $$0x.put(ccc.P, ccd.b);
         $$0x.put(ccc.R, ccd.c);
         $$0x.put(ccc.O, ccd.a);
         $$0x.put(ccc.r, ccd.b);
         $$0x.put(ccc.Z, ccd.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bth $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmh> b(bth $$0) {
      return $$0.dT().c(ccc.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqk $$0, bth $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dT().a(ccc.r) && !$$1.dT().a(ccc.Z);
   }

   protected void b(aqk $$0, bth $$1, long $$2) {
      $$1.dT().a(ccc.R, true);
   }

   protected void c(aqk $$0, bth $$1, long $$2) {
      bua<?> $$3 = $$1.dT();
      $$3.a(ccc.P, 100);
      $$3.a(ccc.R, false);
      $$3.b(ccc.m);
      $$3.b(ccc.n);
   }

   protected void d(aqk $$0, bth $$1, long $$2) {
      cmh $$3 = this.b($$1).get();
      bua<?> $$4 = $$1.dT();
      $$4.a(ccc.n, new bvc($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < aye.k($$5)) {
         $$4.b(ccc.m);
      } else {
         $$4.a(ccc.m, new ccf(new bvc($$3, false), this.a($$1), 2));
      }
   }
}
