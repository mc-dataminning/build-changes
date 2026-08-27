import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dkw extends dfc {
   private static final iw[] a = iw.values();
   public static final dtt b = dts.L;
   public static final dtt c = dts.M;
   public static final dtt d = dts.N;
   public static final dtt e = dts.O;
   public static final dtt f = dts.J;
   public static final dtt g = dts.K;
   public static final Map<iw, dtt> h = Map.of(iw.c, b, iw.f, c, iw.d, d, iw.e, e, iw.b, f, iw.a, g);
   protected final exn[] i;

   protected dkw(float $$0, dtb.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkw> a();

   private exn[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      exn $$3 = dfc.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      exn[] $$4 = new exn[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         iw $$6 = a[$$5];
         $$4[$$5] = exk.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      exn[] $$7 = new exn[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         exn $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = exk.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return false;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
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
