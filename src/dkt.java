import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dkt extends dff {
   private static final jf[] a = jf.values();
   public static final dsy b = dsx.L;
   public static final dsy c = dsx.M;
   public static final dsy d = dsx.N;
   public static final dsy e = dsx.O;
   public static final dsy f = dsx.J;
   public static final dsy g = dsx.K;
   public static final Map<jf, dsy> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, b);
      $$0.put(jf.f, c);
      $$0.put(jf.d, d);
      $$0.put(jf.e, e);
      $$0.put(jf.b, f);
      $$0.put(jf.a, g);
   }));
   protected final ews[] i;

   protected dkt(float $$0, dsg.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkt> a();

   private ews[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ews $$3 = dff.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ews[] $$4 = new ews[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jf $$6 = a[$$5];
         $$4[$$5] = ewp.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ews[] $$7 = new ews[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ews $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ewp.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return false;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dsh $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
