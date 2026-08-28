import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dmr extends dku implements dsb {
   public static final dzd a = dqm.b;
   public static final dzd b = dqm.c;
   public static final dzd c = dqm.d;
   public static final dzd d = dqm.e;
   public static final dzd e = dzc.I;
   public static final Map<jo, dzd> f = dqm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   private final Function<dym, fdo> g;
   private final Function<dym, fdo> h;

   protected dmr(float $$0, float $$1, float $$2, float $$3, float $$4, dyl.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dmr> a();

   protected Function<dym, fdo> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      fdo $$5 = dku.b((double)$$0, 0.0, (double)$$1);
      Map<jo, fdo> $$6 = fdl.c(dku.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         fdo $$3x = $$5;

         for (Entry<jo, dzd> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fdl.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new dzp[]{e});
   }

   @Override
   protected boolean e_(dym $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(e) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
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
   protected dym a(dym $$0, dpv $$1) {
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
