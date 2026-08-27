import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class deb extends cyo {
   private static final ie[] a = ie.values();
   public static final dlw b = dlv.L;
   public static final dlw c = dlv.M;
   public static final dlw d = dlv.N;
   public static final dlw e = dlv.O;
   public static final dlw f = dlv.J;
   public static final dlw g = dlv.K;
   public static final Map<ie, dlw> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ie.class), $$0 -> {
      $$0.put(ie.c, b);
      $$0.put(ie.f, c);
      $$0.put(ie.d, d);
      $$0.put(ie.e, e);
      $$0.put(ie.b, f);
      $$0.put(ie.a, g);
   }));
   protected final eol[] i;

   protected deb(float $$0, dle.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends deb> a();

   private eol[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eol $$3 = cyo.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eol[] $$4 = new eol[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ie $$6 = a[$$5];
         $$4[$$5] = eoi.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eol[] $$7 = new eol[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eol $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eoi.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return false;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dlf $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
