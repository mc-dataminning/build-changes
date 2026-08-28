import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bym extends bxz<bwo> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bwg, Float> f;
   private final Function<bwg, Double> g;

   public bym(Function<bwg, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bym(Function<bwg, Float> $$0, Function<bwg, Double> $$1) {
      super(ae.a(() -> {
         Builder<cfk<?>, cfl> $$0x = ImmutableMap.builder();
         $$0x.put(cfk.n, cfl.c);
         $$0x.put(cfk.m, cfl.c);
         $$0x.put(cfk.P, cfl.b);
         $$0x.put(cfk.R, cfl.c);
         $$0x.put(cfk.O, cfl.a);
         $$0x.put(cfk.r, cfl.b);
         $$0x.put(cfk.Z, cfl.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bwo $$0) {
      return this.f.apply($$0);
   }

   private Optional<cpx> b(bwo $$0) {
      return $$0.ec().c(cfk.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ash $$0, bwo $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cfk.r) && !$$1.ec().a(cfk.Z);
   }

   protected void b(ash $$0, bwo $$1, long $$2) {
      $$1.ec().a(cfk.R, true);
   }

   protected void c(ash $$0, bwo $$1, long $$2) {
      bxi<?> $$3 = $$1.ec();
      $$3.a(cfk.P, 100);
      $$3.a(cfk.R, false);
      $$3.b(cfk.m);
      $$3.b(cfk.n);
   }

   protected void d(ash $$0, bwo $$1, long $$2) {
      cpx $$3 = this.b($$1).get();
      bxi<?> $$4 = $$1.ec();
      $$4.a(cfk.n, new byk($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < bae.k($$5)) {
         $$4.b(cfk.m);
      } else {
         $$4.a(cfk.m, new cfn(new byk($$3, false), this.a($$1), 2));
      }
   }
}
