import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dfn extends daa {
   private static final ih[] a = ih.values();
   public static final dnq b = dnp.L;
   public static final dnq c = dnp.M;
   public static final dnq d = dnp.N;
   public static final dnq e = dnp.O;
   public static final dnq f = dnp.J;
   public static final dnq g = dnp.K;
   public static final Map<ih, dnq> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, b);
      $$0.put(ih.f, c);
      $$0.put(ih.d, d);
      $$0.put(ih.e, e);
      $$0.put(ih.b, f);
      $$0.put(ih.a, g);
   }));
   protected final eqk[] i;

   protected dfn(float $$0, dmy.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfn> a();

   private eqk[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eqk $$3 = daa.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eqk[] $$4 = new eqk[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ih $$6 = a[$$5];
         $$4[$$5] = eqh.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eqk[] $$7 = new eqk[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eqk $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eqh.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return false;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dmz $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
