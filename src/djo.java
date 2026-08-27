import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class djo extends dea {
   private static final it[] a = it.values();
   public static final dru b = drt.L;
   public static final dru c = drt.M;
   public static final dru d = drt.N;
   public static final dru e = drt.O;
   public static final dru f = drt.J;
   public static final dru g = drt.K;
   public static final Map<it, dru> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(it.class), $$0 -> {
      $$0.put(it.c, b);
      $$0.put(it.f, c);
      $$0.put(it.d, d);
      $$0.put(it.e, e);
      $$0.put(it.b, f);
      $$0.put(it.a, g);
   }));
   protected final evf[] i;

   protected djo(float $$0, drc.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends djo> a();

   private evf[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      evf $$3 = dea.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      evf[] $$4 = new evf[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         it $$6 = a[$$5];
         $$4[$$5] = evc.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      evf[] $$7 = new evf[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         evf $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = evc.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return false;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(drd $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
