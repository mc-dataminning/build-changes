import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class blc extends bkp<bjh> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<biy, Float> f;
   private final Function<biy, Double> g;

   public blc(Function<biy, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public blc(Function<biy, Float> $$0, Function<biy, Double> $$1) {
      super(ac.a(() -> {
         Builder<brz<?>, bsa> $$0x = ImmutableMap.builder();
         $$0x.put(brz.n, bsa.c);
         $$0x.put(brz.m, bsa.c);
         $$0x.put(brz.O, bsa.b);
         $$0x.put(brz.Q, bsa.c);
         $$0x.put(brz.N, bsa.a);
         $$0x.put(brz.r, bsa.b);
         $$0x.put(brz.Y, bsa.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjh $$0) {
      return this.f.apply($$0);
   }

   private Optional<cbm> b(bjh $$0) {
      return $$0.dM().c(brz.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(akk $$0, bjh $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dM().a(brz.r) && !$$1.dM().a(brz.Y);
   }

   protected void b(akk $$0, bjh $$1, long $$2) {
      $$1.dM().a(brz.Q, true);
   }

   protected void c(akk $$0, bjh $$1, long $$2) {
      bjy<?> $$3 = $$1.dM();
      $$3.a(brz.O, 100);
      $$3.a(brz.Q, false);
      $$3.b(brz.m);
      $$3.b(brz.n);
   }

   protected void d(akk $$0, bjh $$1, long $$2) {
      cbm $$3 = this.b($$1).get();
      bjy<?> $$4 = $$1.dM();
      $$4.a(brz.n, new bla($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < arp.k($$5)) {
         $$4.b(brz.m);
      } else {
         $$4.a(brz.m, new bsc(new bla($$3, false), this.a($$1), 2));
      }
   }
}
