import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvi extends buv<btl> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btc, Float> f;
   private final Function<btc, Double> g;

   public bvi(Function<btc, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvi(Function<btc, Float> $$0, Function<btc, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccg<?>, cch> $$0x = ImmutableMap.builder();
         $$0x.put(ccg.n, cch.c);
         $$0x.put(ccg.m, cch.c);
         $$0x.put(ccg.P, cch.b);
         $$0x.put(ccg.R, cch.c);
         $$0x.put(ccg.O, cch.a);
         $$0x.put(ccg.r, cch.b);
         $$0x.put(ccg.Z, cch.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btl $$0) {
      return this.f.apply($$0);
   }

   private Optional<cml> b(btl $$0) {
      return $$0.dV().c(ccg.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqm $$0, btl $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dV().a(ccg.r) && !$$1.dV().a(ccg.Z);
   }

   protected void b(aqm $$0, btl $$1, long $$2) {
      $$1.dV().a(ccg.R, true);
   }

   protected void c(aqm $$0, btl $$1, long $$2) {
      bue<?> $$3 = $$1.dV();
      $$3.a(ccg.P, 100);
      $$3.a(ccg.R, false);
      $$3.b(ccg.m);
      $$3.b(ccg.n);
   }

   protected void d(aqm $$0, btl $$1, long $$2) {
      cml $$3 = this.b($$1).get();
      bue<?> $$4 = $$1.dV();
      $$4.a(ccg.n, new bvg($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayg.k($$5)) {
         $$4.b(ccg.m);
      } else {
         $$4.a(ccg.m, new ccj(new bvg($$3, false), this.a($$1), 2));
      }
   }
}
