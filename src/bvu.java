import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvu extends bvh<btx> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bto, Float> f;
   private final Function<bto, Double> g;

   public bvu(Function<bto, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvu(Function<bto, Float> $$0, Function<bto, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccs<?>, cct> $$0x = ImmutableMap.builder();
         $$0x.put(ccs.n, cct.c);
         $$0x.put(ccs.m, cct.c);
         $$0x.put(ccs.P, cct.b);
         $$0x.put(ccs.R, cct.c);
         $$0x.put(ccs.O, cct.a);
         $$0x.put(ccs.r, cct.b);
         $$0x.put(ccs.Z, cct.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btx $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmw> b(btx $$0) {
      return $$0.dS().c(ccs.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(are $$0, btx $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(ccs.r) && !$$1.dS().a(ccs.Z);
   }

   protected void b(are $$0, btx $$1, long $$2) {
      $$1.dS().a(ccs.R, true);
   }

   protected void c(are $$0, btx $$1, long $$2) {
      buq<?> $$3 = $$1.dS();
      $$3.a(ccs.P, 100);
      $$3.a(ccs.R, false);
      $$3.b(ccs.m);
      $$3.b(ccs.n);
   }

   protected void d(are $$0, btx $$1, long $$2) {
      cmw $$3 = this.b($$1).get();
      buq<?> $$4 = $$1.dS();
      $$4.a(ccs.n, new bvs($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayy.k($$5)) {
         $$4.b(ccs.m);
      } else {
         $$4.a(ccs.m, new ccv(new bvs($$3, false), this.a($$1), 2));
      }
   }
}
