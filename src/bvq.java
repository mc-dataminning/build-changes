import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvq extends bvd<btt> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btk, Float> f;
   private final Function<btk, Double> g;

   public bvq(Function<btk, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvq(Function<btk, Float> $$0, Function<btk, Double> $$1) {
      super(ac.a(() -> {
         Builder<cco<?>, ccp> $$0x = ImmutableMap.builder();
         $$0x.put(cco.n, ccp.c);
         $$0x.put(cco.m, ccp.c);
         $$0x.put(cco.P, ccp.b);
         $$0x.put(cco.R, ccp.c);
         $$0x.put(cco.O, ccp.a);
         $$0x.put(cco.r, ccp.b);
         $$0x.put(cco.Z, ccp.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btt $$0) {
      return this.f.apply($$0);
   }

   private Optional<cms> b(btt $$0) {
      return $$0.dS().c(cco.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arb $$0, btt $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(cco.r) && !$$1.dS().a(cco.Z);
   }

   protected void b(arb $$0, btt $$1, long $$2) {
      $$1.dS().a(cco.R, true);
   }

   protected void c(arb $$0, btt $$1, long $$2) {
      bum<?> $$3 = $$1.dS();
      $$3.a(cco.P, 100);
      $$3.a(cco.R, false);
      $$3.b(cco.m);
      $$3.b(cco.n);
   }

   protected void d(arb $$0, btt $$1, long $$2) {
      cms $$3 = this.b($$1).get();
      bum<?> $$4 = $$1.dS();
      $$4.a(cco.n, new bvo($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayu.k($$5)) {
         $$4.b(cco.m);
      } else {
         $$4.a(cco.m, new ccr(new bvo($$3, false), this.a($$1), 2));
      }
   }
}
