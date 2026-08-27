import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class blf extends bks<bjk> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bjb, Float> f;
   private final Function<bjb, Double> g;

   public blf(Function<bjb, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public blf(Function<bjb, Float> $$0, Function<bjb, Double> $$1) {
      super(ac.a(() -> {
         Builder<bsc<?>, bsd> $$0x = ImmutableMap.builder();
         $$0x.put(bsc.n, bsd.c);
         $$0x.put(bsc.m, bsd.c);
         $$0x.put(bsc.O, bsd.b);
         $$0x.put(bsc.Q, bsd.c);
         $$0x.put(bsc.N, bsd.a);
         $$0x.put(bsc.r, bsd.b);
         $$0x.put(bsc.Y, bsd.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjk $$0) {
      return this.f.apply($$0);
   }

   private Optional<cbp> b(bjk $$0) {
      return $$0.dM().c(bsc.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(akn $$0, bjk $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dM().a(bsc.r) && !$$1.dM().a(bsc.Y);
   }

   protected void b(akn $$0, bjk $$1, long $$2) {
      $$1.dM().a(bsc.Q, true);
   }

   protected void c(akn $$0, bjk $$1, long $$2) {
      bkb<?> $$3 = $$1.dM();
      $$3.a(bsc.O, 100);
      $$3.a(bsc.Q, false);
      $$3.b(bsc.m);
      $$3.b(bsc.n);
   }

   protected void d(akn $$0, bjk $$1, long $$2) {
      cbp $$3 = this.b($$1).get();
      bkb<?> $$4 = $$1.dM();
      $$4.a(bsc.n, new bld($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < ars.k($$5)) {
         $$4.b(bsc.m);
      } else {
         $$4.a(bsc.m, new bsf(new bld($$3, false), this.a($$1), 2));
      }
   }
}
