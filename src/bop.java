import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bop extends boc<bmu> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bml, Float> f;
   private final Function<bml, Double> g;

   public bop(Function<bml, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bop(Function<bml, Float> $$0, Function<bml, Double> $$1) {
      super(ac.a(() -> {
         Builder<bvn<?>, bvo> $$0x = ImmutableMap.builder();
         $$0x.put(bvn.n, bvo.c);
         $$0x.put(bvn.m, bvo.c);
         $$0x.put(bvn.O, bvo.b);
         $$0x.put(bvn.Q, bvo.c);
         $$0x.put(bvn.N, bvo.a);
         $$0x.put(bvn.r, bvo.b);
         $$0x.put(bvn.Y, bvo.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bmu $$0) {
      return this.f.apply($$0);
   }

   private Optional<cfi> b(bmu $$0) {
      return $$0.dO().c(bvn.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(and $$0, bmu $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dO().a(bvn.r) && !$$1.dO().a(bvn.Y);
   }

   protected void b(and $$0, bmu $$1, long $$2) {
      $$1.dO().a(bvn.Q, true);
   }

   protected void c(and $$0, bmu $$1, long $$2) {
      bnl<?> $$3 = $$1.dO();
      $$3.a(bvn.O, 100);
      $$3.a(bvn.Q, false);
      $$3.b(bvn.m);
      $$3.b(bvn.n);
   }

   protected void d(and $$0, bmu $$1, long $$2) {
      cfi $$3 = this.b($$1).get();
      bnl<?> $$4 = $$1.dO();
      $$4.a(bvn.n, new bon($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < auo.k($$5)) {
         $$4.b(bvn.m);
      } else {
         $$4.a(bvn.m, new bvq(new bon($$3, false), this.a($$1), 2));
      }
   }
}
