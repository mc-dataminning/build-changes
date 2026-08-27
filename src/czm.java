import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class czm extends cua {
   private static final hx[] a = hx.values();
   public static final dgs b = dgr.L;
   public static final dgs c = dgr.M;
   public static final dgs d = dgr.N;
   public static final dgs e = dgr.O;
   public static final dgs f = dgr.J;
   public static final dgs g = dgr.K;
   public static final Map<hx, dgs> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, b);
      $$0.put(hx.f, c);
      $$0.put(hx.d, d);
      $$0.put(hx.e, e);
      $$0.put(hx.b, f);
      $$0.put(hx.a, g);
   }));
   protected final eiy[] i;

   protected czm(float $$0, dga.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends czm> a();

   private eiy[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eiy $$3 = cua.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eiy[] $$4 = new eiy[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         hx $$6 = a[$$5];
         $$4[$$5] = eiv.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eiy[] $$7 = new eiy[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eiy $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eiv.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return false;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(dgb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
