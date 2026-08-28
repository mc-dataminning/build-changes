import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bvv extends bvi<bty> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<btp, Float> f;
   private final Function<btp, Double> g;

   public bvv(Function<btp, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bvv(Function<btp, Float> $$0, Function<btp, Double> $$1) {
      super(ac.a(() -> {
         Builder<cct<?>, ccu> $$0x = ImmutableMap.builder();
         $$0x.put(cct.n, ccu.c);
         $$0x.put(cct.m, ccu.c);
         $$0x.put(cct.P, ccu.b);
         $$0x.put(cct.R, ccu.c);
         $$0x.put(cct.O, ccu.a);
         $$0x.put(cct.r, ccu.b);
         $$0x.put(cct.Z, ccu.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bty $$0) {
      return this.f.apply($$0);
   }

   private Optional<cmx> b(bty $$0) {
      return $$0.dS().c(cct.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arf $$0, bty $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(cct.r) && !$$1.dS().a(cct.Z);
   }

   protected void b(arf $$0, bty $$1, long $$2) {
      $$1.dS().a(cct.R, true);
   }

   protected void c(arf $$0, bty $$1, long $$2) {
      bur<?> $$3 = $$1.dS();
      $$3.a(cct.P, 100);
      $$3.a(cct.R, false);
      $$3.b(cct.m);
      $$3.b(cct.n);
   }

   protected void d(arf $$0, bty $$1, long $$2) {
      cmx $$3 = this.b($$1).get();
      bur<?> $$4 = $$1.dS();
      $$4.a(cct.n, new bvt($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(cct.m);
      } else {
         $$4.a(cct.m, new ccw(new bvt($$3, false), this.a($$1), 2));
      }
   }
}
