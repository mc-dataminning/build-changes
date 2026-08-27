import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class blb extends bko<bjf> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<biw, Float> f;
   private final Function<biw, Double> g;

   public blb(Function<biw, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public blb(Function<biw, Float> $$0, Function<biw, Double> $$1) {
      super(ac.a(() -> {
         Builder<bry<?>, brz> $$0x = ImmutableMap.builder();
         $$0x.put(bry.n, brz.c);
         $$0x.put(bry.m, brz.c);
         $$0x.put(bry.O, brz.b);
         $$0x.put(bry.Q, brz.c);
         $$0x.put(bry.N, brz.a);
         $$0x.put(bry.r, brz.b);
         $$0x.put(bry.Y, brz.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjf $$0) {
      return this.f.apply($$0);
   }

   private Optional<cbl> b(bjf $$0) {
      return $$0.dM().c(bry.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aki $$0, bjf $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dM().a(bry.r) && !$$1.dM().a(bry.Y);
   }

   protected void b(aki $$0, bjf $$1, long $$2) {
      $$1.dM().a(bry.Q, true);
   }

   protected void c(aki $$0, bjf $$1, long $$2) {
      bjx<?> $$3 = $$1.dM();
      $$3.a(bry.O, 100);
      $$3.a(bry.Q, false);
      $$3.b(bry.m);
      $$3.b(bry.n);
   }

   protected void d(aki $$0, bjf $$1, long $$2) {
      cbl $$3 = this.b($$1).get();
      bjx<?> $$4 = $$1.dM();
      $$4.a(bry.n, new bkz($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < aro.k($$5)) {
         $$4.b(bry.m);
      } else {
         $$4.a(bry.m, new bsb(new bkz($$3, false), this.a($$1), 2));
      }
   }
}
