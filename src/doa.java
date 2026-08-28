import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doa extends dfi {
   public static final MapCodec<doa> a = b(doa::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final exa g = dfi.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final exa h = dfi.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dtl e = dtb.aE;
   public static final dtl f = dtb.aD;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
      if (!$$3.bY()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      if (!($$3 instanceof ckk)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dfk.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dcg $$0, ja $$1, dsl $$2) {
      $$0.a(null, $$1, avh.Ai, avi.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dxh.f, $$1, dxh.a.a($$2));
         $$0.c(2001, $$1, dfi.i($$2));
      }
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avh.Aj, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dxh.c, $$2, dxh.a.a($$0));
         } else {
            $$1.a(null, $$2, avh.Ak, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dxh.f, $$2, dxh.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfi.i($$0));
               cft $$6 = bsn.bh.a((dcg)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dbm $$0, ja $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbm $$0, ja $$1) {
      return $$0.a_($$1).a(avw.H);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dcg $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dcg $$0, cml $$1, ja $$2, dsl $$3, @Nullable dpq $$4, cud $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dcg $$0, bsh $$1) {
      if ($$1 instanceof cft || $$1 instanceof cen) {
         return false;
      } else {
         return !($$1 instanceof btc) ? false : $$1 instanceof cml || $$0.ab().b(dcc.c);
      }
   }
}
