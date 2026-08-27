import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dcc extends cwp {
   private static final ic[] a = ic.values();
   public static final djx b = djw.L;
   public static final djx c = djw.M;
   public static final djx d = djw.N;
   public static final djx e = djw.O;
   public static final djx f = djw.J;
   public static final djx g = djw.K;
   public static final Map<ic, djx> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, b);
      $$0.put(ic.f, c);
      $$0.put(ic.d, d);
      $$0.put(ic.e, e);
      $$0.put(ic.b, f);
      $$0.put(ic.a, g);
   }));
   protected final eml[] i;

   protected dcc(float $$0, djf.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcc> a();

   private eml[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eml $$3 = cwp.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eml[] $$4 = new eml[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ic $$6 = a[$$5];
         $$4[$$5] = emi.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eml[] $$7 = new eml[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eml $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = emi.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return false;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(djg $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
