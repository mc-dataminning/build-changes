import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dmb extends dke implements drl {
   public static final dyh a = dpw.b;
   public static final dyh b = dpw.c;
   public static final dyh c = dpw.d;
   public static final dyh d = dpw.e;
   public static final dyh e = dyg.I;
   public static final Map<jn, dyh> f = dpw.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   private final Function<dxq, fcr> g;
   private final Function<dxq, fcr> h;

   protected dmb(float $$0, float $$1, float $$2, float $$3, float $$4, dxp.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dmb> a();

   protected Function<dxq, fcr> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      fcr $$5 = dke.b((double)$$0, 0.0, (double)$$1);
      Map<jn, fcr> $$6 = fco.c(dke.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         fcr $$3x = $$5;

         for (Entry<jn, dyh> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fco.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new dyt[]{e});
   }

   @Override
   protected boolean e_(dxq $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
