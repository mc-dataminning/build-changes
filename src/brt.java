import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class brt extends brg<bpw> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bpo, Float> f;
   private final Function<bpo, Double> g;

   public brt(Function<bpo, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public brt(Function<bpo, Float> $$0, Function<bpo, Double> $$1) {
      super(ac.a(() -> {
         Builder<byr<?>, bys> $$0x = ImmutableMap.builder();
         $$0x.put(byr.n, bys.c);
         $$0x.put(byr.m, bys.c);
         $$0x.put(byr.P, bys.b);
         $$0x.put(byr.R, bys.c);
         $$0x.put(byr.O, bys.a);
         $$0x.put(byr.r, bys.b);
         $$0x.put(byr.Z, bys.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bpw $$0) {
      return this.f.apply($$0);
   }

   private Optional<cis> b(bpw $$0) {
      return $$0.dP().c(byr.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(apf $$0, bpw $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dP().a(byr.r) && !$$1.dP().a(byr.Z);
   }

   protected void b(apf $$0, bpw $$1, long $$2) {
      $$1.dP().a(byr.R, true);
   }

   protected void c(apf $$0, bpw $$1, long $$2) {
      bqp<?> $$3 = $$1.dP();
      $$3.a(byr.P, 100);
      $$3.a(byr.R, false);
      $$3.b(byr.m);
      $$3.b(byr.n);
   }

   protected void d(apf $$0, bpw $$1, long $$2) {
      cis $$3 = this.b($$1).get();
      bqp<?> $$4 = $$1.dP();
      $$4.a(byr.n, new brr($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < aww.k($$5)) {
         $$4.b(byr.m);
      } else {
         $$4.a(byr.m, new byu(new brr($$3, false), this.a($$1), 2));
      }
   }
}
