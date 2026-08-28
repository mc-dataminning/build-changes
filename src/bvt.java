import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvt extends bvg<btw> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btn, Float> f;
   private final Function<btn, Double> g;

   public bvt(Function<btn, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvt(Function<btn, Float> $$0, Function<btn, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccr<?>, ccs> $$0x = ImmutableMap.builder();
         $$0x.put(ccr.n, ccs.c);
         $$0x.put(ccr.m, ccs.c);
         $$0x.put(ccr.P, ccs.b);
         $$0x.put(ccr.R, ccs.c);
         $$0x.put(ccr.O, ccs.a);
         $$0x.put(ccr.r, ccs.b);
         $$0x.put(ccr.Z, ccs.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btw $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmv> b(btw $$0) {
      return $$0.dS().c(ccr.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(are $$0, btw $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(ccr.r) && !$$1.dS().a(ccr.Z);
   }

   protected void b(are $$0, btw $$1, long $$2) {
      $$1.dS().a(ccr.R, true);
   }

   protected void c(are $$0, btw $$1, long $$2) {
      bup<?> $$3 = $$1.dS();
      $$3.a(ccr.P, 100);
      $$3.a(ccr.R, false);
      $$3.b(ccr.m);
      $$3.b(ccr.n);
   }

   protected void d(are $$0, btw $$1, long $$2) {
      cmv $$3 = this.b($$1).get();
      bup<?> $$4 = $$1.dS();
      $$4.a(ccr.n, new bvr($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayx.k($$5)) {
         $$4.b(ccr.m);
      } else {
         $$4.a(ccr.m, new ccu(new bvr($$3, false), this.a($$1), 2));
      }
   }
}
