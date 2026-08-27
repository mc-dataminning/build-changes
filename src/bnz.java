import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bnz extends bnm<bme> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<blv, Float> f;
   private final Function<blv, Double> g;

   public bnz(Function<blv, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bnz(Function<blv, Float> $$0, Function<blv, Double> $$1) {
      super(ac.a(() -> {
         Builder<bux<?>, buy> $$0x = ImmutableMap.builder();
         $$0x.put(bux.n, buy.c);
         $$0x.put(bux.m, buy.c);
         $$0x.put(bux.O, buy.b);
         $$0x.put(bux.Q, buy.c);
         $$0x.put(bux.N, buy.a);
         $$0x.put(bux.r, buy.b);
         $$0x.put(bux.Y, buy.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bme $$0) {
      return this.f.apply($$0);
   }

   private Optional<cer> b(bme $$0) {
      return $$0.dO().c(bux.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(amp $$0, bme $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dO().a(bux.r) && !$$1.dO().a(bux.Y);
   }

   protected void b(amp $$0, bme $$1, long $$2) {
      $$1.dO().a(bux.Q, true);
   }

   protected void c(amp $$0, bme $$1, long $$2) {
      bmv<?> $$3 = $$1.dO();
      $$3.a(bux.O, 100);
      $$3.a(bux.Q, false);
      $$3.b(bux.m);
      $$3.b(bux.n);
   }

   protected void d(amp $$0, bme $$1, long $$2) {
      cer $$3 = this.b($$1).get();
      bmv<?> $$4 = $$1.dO();
      $$4.a(bux.n, new bnx($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < aty.k($$5)) {
         $$4.b(bux.m);
      } else {
         $$4.a(bux.m, new bva(new bnx($$3, false), this.a($$1), 2));
      }
   }
}
