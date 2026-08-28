import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dpf extends djn {
   private static final jn[] a = jn.values();
   public static final dxp b = dxo.O;
   public static final dxp c = dxo.P;
   public static final dxp d = dxo.Q;
   public static final dxp e = dxo.R;
   public static final dxp f = dxo.M;
   public static final dxp g = dxo.N;
   public static final Map<jn, dxp> h = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, b);
      $$0.put(jn.f, c);
      $$0.put(jn.d, d);
      $$0.put(jn.e, e);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   }));
   protected final fbv[] i;

   protected dpf(float $$0, dwx.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpf> a();

   private fbv[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fbv $$3 = djn.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fbv[] $$4 = new fbv[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jn $$6 = a[$$5];
         $$4[$$5] = fbs.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fbv[] $$7 = new fbv[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fbv $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fbs.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dwy $$0) {
      return false;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dwy $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
