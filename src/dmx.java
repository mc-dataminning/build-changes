import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dmx extends dhj {
   private static final jj[] a = jj.values();
   public static final dvf b = dve.L;
   public static final dvf c = dve.M;
   public static final dvf d = dve.N;
   public static final dvf e = dve.O;
   public static final dvf f = dve.J;
   public static final dvf g = dve.K;
   public static final Map<jj, dvf> h = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.c, b);
      $$0.put(jj.f, c);
      $$0.put(jj.d, d);
      $$0.put(jj.e, e);
      $$0.put(jj.b, f);
      $$0.put(jj.a, g);
   }));
   protected final ezm[] i;

   protected dmx(float $$0, dun.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmx> a();

   private ezm[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ezm $$3 = dhj.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ezm[] $$4 = new ezm[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jj $$6 = a[$$5];
         $$4[$$5] = ezj.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ezm[] $$7 = new ezm[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ezm $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ezj.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(duo $$0) {
      return false;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(duo $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
