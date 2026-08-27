import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dan extends cva {
   private static final hx[] a = hx.values();
   public static final dhz b = dhy.L;
   public static final dhz c = dhy.M;
   public static final dhz d = dhy.N;
   public static final dhz e = dhy.O;
   public static final dhz f = dhy.J;
   public static final dhz g = dhy.K;
   public static final Map<hx, dhz> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, b);
      $$0.put(hx.f, c);
      $$0.put(hx.d, d);
      $$0.put(hx.e, e);
      $$0.put(hx.b, f);
      $$0.put(hx.a, g);
   }));
   protected final ekn[] i;

   protected dan(float $$0, dhh.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dan> a();

   private ekn[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ekn $$3 = cva.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ekn[] $$4 = new ekn[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         hx $$6 = a[$$5];
         $$4[$$5] = ekk.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ekn[] $$7 = new ekn[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ekn $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ekk.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return false;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(dhi $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
