import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dod extends dmf implements dtq {
   public static final eay a = drz.b;
   public static final eay b = drz.c;
   public static final eay c = drz.d;
   public static final eay d = drz.e;
   public static final eay e = eax.I;
   public static final Map<ja, eay> f = drz.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   private final Function<eah, ffk> g;
   private final Function<eah, ffk> h;

   protected dod(float $$0, float $$1, float $$2, float $$3, float $$4, eag.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dod> a();

   protected Function<eah, ffk> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      ffk $$5 = dmf.b((double)$$0, 0.0, (double)$$1);
      Map<ja, ffk> $$6 = ffh.c(dmf.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         ffk $$3x = $$5;

         for (Entry<ja, eay> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = ffh.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ebk[]{e});
   }

   @Override
   protected boolean e_(eah $$0) {
      return !$$0.c(e);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(e) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
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
   protected eah a(eah $$0, dri $$1) {
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
