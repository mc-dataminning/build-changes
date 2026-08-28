import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dnr extends dlu implements dtb {
   public static final eaf a = drm.b;
   public static final eaf b = drm.c;
   public static final eaf c = drm.d;
   public static final eaf d = drm.e;
   public static final eaf e = eae.I;
   public static final Map<ja, eaf> f = drm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   private final Function<dzo, feq> g;
   private final Function<dzo, feq> h;

   protected dnr(float $$0, float $$1, float $$2, float $$3, float $$4, dzn.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dnr> a();

   protected Function<dzo, feq> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      feq $$5 = dlu.b((double)$$0, 0.0, (double)$$1);
      Map<ja, feq> $$6 = fen.c(dlu.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         feq $$3x = $$5;

         for (Entry<ja, eaf> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fen.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ear[]{e});
   }

   @Override
   protected boolean e_(dzo $$0) {
      return !$$0.c(e);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(e) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
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
   protected dzo a(dzo $$0, dqv $$1) {
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
