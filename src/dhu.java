import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dhu extends dch {
   private static final ij[] a = ij.values();
   public static final dpz b = dpy.L;
   public static final dpz c = dpy.M;
   public static final dpz d = dpy.N;
   public static final dpz e = dpy.O;
   public static final dpz f = dpy.J;
   public static final dpz g = dpy.K;
   public static final Map<ij, dpz> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ij.class), $$0 -> {
      $$0.put(ij.c, b);
      $$0.put(ij.f, c);
      $$0.put(ij.d, d);
      $$0.put(ij.e, e);
      $$0.put(ij.b, f);
      $$0.put(ij.a, g);
   }));
   protected final etc[] i;

   protected dhu(float $$0, dph.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhu> a();

   private etc[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      etc $$3 = dch.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      etc[] $$4 = new etc[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ij $$6 = a[$$5];
         $$4[$$5] = esz.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      etc[] $$7 = new etc[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         etc $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = esz.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return false;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dpi $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
