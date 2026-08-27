import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class buf extends bts<bsi> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bsa, Float> f;
   private final Function<bsa, Double> g;

   public buf(Function<bsa, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public buf(Function<bsa, Float> $$0, Function<bsa, Double> $$1) {
      super(ac.a(() -> {
         Builder<cbd<?>, cbe> $$0x = ImmutableMap.builder();
         $$0x.put(cbd.n, cbe.c);
         $$0x.put(cbd.m, cbe.c);
         $$0x.put(cbd.P, cbe.b);
         $$0x.put(cbd.R, cbe.c);
         $$0x.put(cbd.O, cbe.a);
         $$0x.put(cbd.r, cbe.b);
         $$0x.put(cbd.Z, cbe.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bsi $$0) {
      return this.f.apply($$0);
   }

   private Optional<clh> b(bsi $$0) {
      return $$0.dQ().c(cbd.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqh $$0, bsi $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dQ().a(cbd.r) && !$$1.dQ().a(cbd.Z);
   }

   protected void b(aqh $$0, bsi $$1, long $$2) {
      $$1.dQ().a(cbd.R, true);
   }

   protected void c(aqh $$0, bsi $$1, long $$2) {
      btb<?> $$3 = $$1.dQ();
      $$3.a(cbd.P, 100);
      $$3.a(cbd.R, false);
      $$3.b(cbd.m);
      $$3.b(cbd.n);
   }

   protected void d(aqh $$0, bsi $$1, long $$2) {
      clh $$3 = this.b($$1).get();
      btb<?> $$4 = $$1.dQ();
      $$4.a(cbd.n, new bud($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < axz.k($$5)) {
         $$4.b(cbd.m);
      } else {
         $$4.a(cbd.m, new cbg(new bud($$3, false), this.a($$1), 2));
      }
   }
}
