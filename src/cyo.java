import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class cyo extends ctc {
   private static final ha[] a = ha.values();
   public static final dfu b = dft.L;
   public static final dfu c = dft.M;
   public static final dfu d = dft.N;
   public static final dfu e = dft.O;
   public static final dfu f = dft.J;
   public static final dfu g = dft.K;
   public static final Map<ha, dfu> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, b);
      $$0.put(ha.f, c);
      $$0.put(ha.d, d);
      $$0.put(ha.e, e);
      $$0.put(ha.b, f);
      $$0.put(ha.a, g);
   }));
   protected final eia[] i;

   protected cyo(float $$0, dfc.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyo> a();

   private eia[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eia $$3 = ctc.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eia[] $$4 = new eia[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ha $$6 = a[$$5];
         $$4[$$5] = ehx.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eia[] $$7 = new eia[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eia $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ehx.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return false;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(dfd $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
