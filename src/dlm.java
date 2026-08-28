import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dlm extends dfy {
   private static final ji[] a = ji.values();
   public static final dtt b = dts.L;
   public static final dtt c = dts.M;
   public static final dtt d = dts.N;
   public static final dtt e = dts.O;
   public static final dtt f = dts.J;
   public static final dtt g = dts.K;
   public static final Map<ji, dtt> h = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(ji.class), $$0 -> {
      $$0.put(ji.c, b);
      $$0.put(ji.f, c);
      $$0.put(ji.d, d);
      $$0.put(ji.e, e);
      $$0.put(ji.b, f);
      $$0.put(ji.a, g);
   }));
   protected final exv[] i;

   protected dlm(float $$0, dtb.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlm> a();

   private exv[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      exv $$3 = dfy.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      exv[] $$4 = new exv[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ji $$6 = a[$$5];
         $$4[$$5] = exs.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      exv[] $$7 = new exv[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         exv $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = exs.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return false;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dtc $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
