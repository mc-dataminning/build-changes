import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvw extends bvj<btz> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btq, Float> f;
   private final Function<btq, Double> g;

   public bvw(Function<btq, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvw(Function<btq, Float> $$0, Function<btq, Double> $$1) {
      super(ac.a(() -> {
         Builder<ccu<?>, ccv> $$0x = ImmutableMap.builder();
         $$0x.put(ccu.n, ccv.c);
         $$0x.put(ccu.m, ccv.c);
         $$0x.put(ccu.P, ccv.b);
         $$0x.put(ccu.R, ccv.c);
         $$0x.put(ccu.O, ccv.a);
         $$0x.put(ccu.r, ccv.b);
         $$0x.put(ccu.Z, ccv.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(btz $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmy> b(btz $$0) {
      return $$0.dS().c(ccu.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arf $$0, btz $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(ccu.r) && !$$1.dS().a(ccu.Z);
   }

   protected void b(arf $$0, btz $$1, long $$2) {
      $$1.dS().a(ccu.R, true);
   }

   protected void c(arf $$0, btz $$1, long $$2) {
      bus<?> $$3 = $$1.dS();
      $$3.a(ccu.P, 100);
      $$3.a(ccu.R, false);
      $$3.b(ccu.m);
      $$3.b(ccu.n);
   }

   protected void d(arf $$0, btz $$1, long $$2) {
      cmy $$3 = this.b($$1).get();
      bus<?> $$4 = $$1.dS();
      $$4.a(ccu.n, new bvu($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(ccu.m);
      } else {
         $$4.a(ccu.m, new ccx(new bvu($$3, false), this.a($$1), 2));
      }
   }
}
