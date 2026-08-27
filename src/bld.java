import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bld extends bkq<bjh> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<biy, Float> f;
   private final Function<biy, Double> g;

   public bld(Function<biy, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bld(Function<biy, Float> $$0, Function<biy, Double> $$1) {
      super(ac.a(() -> {
         Builder<bsa<?>, bsb> $$0x = ImmutableMap.builder();
         $$0x.put(bsa.n, bsb.c);
         $$0x.put(bsa.m, bsb.c);
         $$0x.put(bsa.O, bsb.b);
         $$0x.put(bsa.Q, bsb.c);
         $$0x.put(bsa.N, bsb.a);
         $$0x.put(bsa.r, bsb.b);
         $$0x.put(bsa.Y, bsb.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjh $$0) {
      return this.f.apply($$0);
   }

   private Optional<cbn> b(bjh $$0) {
      return $$0.dM().c(bsa.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(akk $$0, bjh $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dM().a(bsa.r) && !$$1.dM().a(bsa.Y);
   }

   protected void b(akk $$0, bjh $$1, long $$2) {
      $$1.dM().a(bsa.Q, true);
   }

   protected void c(akk $$0, bjh $$1, long $$2) {
      bjz<?> $$3 = $$1.dM();
      $$3.a(bsa.O, 100);
      $$3.a(bsa.Q, false);
      $$3.b(bsa.m);
      $$3.b(bsa.n);
   }

   protected void d(akk $$0, bjh $$1, long $$2) {
      cbn $$3 = this.b($$1).get();
      bjz<?> $$4 = $$1.dM();
      $$4.a(bsa.n, new blb($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < arp.k($$5)) {
         $$4.b(bsa.m);
      } else {
         $$4.a(bsa.m, new bsd(new blb($$3, false), this.a($$1), 2));
      }
   }
}
