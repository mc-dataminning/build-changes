import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class byl extends bxy<bwn> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bwf, Float> f;
   private final Function<bwf, Double> g;

   public byl(Function<bwf, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public byl(Function<bwf, Float> $$0, Function<bwf, Double> $$1) {
      super(ae.a(() -> {
         Builder<cfj<?>, cfk> $$0x = ImmutableMap.builder();
         $$0x.put(cfj.n, cfk.c);
         $$0x.put(cfj.m, cfk.c);
         $$0x.put(cfj.P, cfk.b);
         $$0x.put(cfj.R, cfk.c);
         $$0x.put(cfj.O, cfk.a);
         $$0x.put(cfj.r, cfk.b);
         $$0x.put(cfj.Z, cfk.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bwn $$0) {
      return this.f.apply($$0);
   }

   private Optional<cpw> b(bwn $$0) {
      return $$0.eb().c(cfj.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ash $$0, bwn $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cfj.r) && !$$1.eb().a(cfj.Z);
   }

   protected void b(ash $$0, bwn $$1, long $$2) {
      $$1.eb().a(cfj.R, true);
   }

   protected void c(ash $$0, bwn $$1, long $$2) {
      bxh<?> $$3 = $$1.eb();
      $$3.a(cfj.P, 100);
      $$3.a(cfj.R, false);
      $$3.b(cfj.m);
      $$3.b(cfj.n);
   }

   protected void d(ash $$0, bwn $$1, long $$2) {
      cpw $$3 = this.b($$1).get();
      bxh<?> $$4 = $$1.eb();
      $$4.a(cfj.n, new byj($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < bae.k($$5)) {
         $$4.b(cfj.m);
      } else {
         $$4.a(cfj.m, new cfm(new byj($$3, false), this.a($$1), 2));
      }
   }
}
