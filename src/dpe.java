import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dpe extends djm {
   private static final jn[] a = jn.values();
   public static final dxo b = dxn.O;
   public static final dxo c = dxn.P;
   public static final dxo d = dxn.Q;
   public static final dxo e = dxn.R;
   public static final dxo f = dxn.M;
   public static final dxo g = dxn.N;
   public static final Map<jn, dxo> h = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, b);
      $$0.put(jn.f, c);
      $$0.put(jn.d, d);
      $$0.put(jn.e, e);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   }));
   protected final fbu[] i;

   protected dpe(float $$0, dww.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpe> a();

   private fbu[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fbu $$3 = djm.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fbu[] $$4 = new fbu[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jn $$6 = a[$$5];
         $$4[$$5] = fbr.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fbu[] $$7 = new fbu[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fbu $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fbr.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dwx $$0) {
      return false;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dwx $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
