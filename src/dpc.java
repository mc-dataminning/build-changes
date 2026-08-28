import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dpc extends djk {
   private static final jn[] a = jn.values();
   public static final dxm b = dxl.O;
   public static final dxm c = dxl.P;
   public static final dxm d = dxl.Q;
   public static final dxm e = dxl.R;
   public static final dxm f = dxl.M;
   public static final dxm g = dxl.N;
   public static final Map<jn, dxm> h = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, b);
      $$0.put(jn.f, c);
      $$0.put(jn.d, d);
      $$0.put(jn.e, e);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   }));
   protected final fbs[] i;

   protected dpc(float $$0, dwu.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpc> a();

   private fbs[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fbs $$3 = djk.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fbs[] $$4 = new fbs[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jn $$6 = a[$$5];
         $$4[$$5] = fbp.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fbs[] $$7 = new fbs[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fbs $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fbp.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dwv $$0) {
      return false;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dwv $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
