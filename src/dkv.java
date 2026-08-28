import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dkv extends dfh {
   private static final jf[] a = jf.values();
   public static final dtb b = dta.L;
   public static final dtb c = dta.M;
   public static final dtb d = dta.N;
   public static final dtb e = dta.O;
   public static final dtb f = dta.J;
   public static final dtb g = dta.K;
   public static final Map<jf, dtb> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, b);
      $$0.put(jf.f, c);
      $$0.put(jf.d, d);
      $$0.put(jf.e, e);
      $$0.put(jf.b, f);
      $$0.put(jf.a, g);
   }));
   protected final ewy[] i;

   protected dkv(float $$0, dsj.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkv> a();

   private ewy[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ewy $$3 = dfh.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ewy[] $$4 = new ewy[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jf $$6 = a[$$5];
         $$4[$$5] = ewv.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ewy[] $$7 = new ewy[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ewy $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ewv.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return false;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dsk $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
