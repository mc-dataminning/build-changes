import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends dfc {
   public static final MapCodec<doj> a = b(doj::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final exn g = dfc.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final exn h = dfc.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final duc e = dts.aE;
   public static final duc f = dts.aD;

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   public doj(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
      if (!$$3.cb()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      if (!($$3 instanceof cjx)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dca $$0, dtc $$1, ir $$2, brv $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.C && $$0.A.a($$4) == 0 && $$1.a(dfe.nd)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dca $$0, ir $$1, dtc $$2) {
      $$0.a(null, $$1, avo.AD, avq.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dxv.f, $$1, dxv.a.a($$2));
         $$0.c(2001, $$1, dfc.i($$2));
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avo.AE, avq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dxv.c, $$2, dxv.a.a($$0));
         } else {
            $$1.a(null, $$2, avo.AF, avq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dxv.f, $$2, dxv.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfc.i($$0));
               cff $$6 = bsb.bl.a((dca)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.e($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dbg $$0, ir $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbg $$0, ir $$1) {
      return $$0.a_($$1).a(awe.H);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dca $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dca $$0, cly $$1, ir $$2, dtc $$3, @Nullable dqc $$4, cuh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dca $$0, brv $$1) {
      if ($$1 instanceof cff || $$1 instanceof cdy) {
         return false;
      } else {
         return !($$1 instanceof bso) ? false : $$1 instanceof cly || $$0.ab().b(dbw.c);
      }
   }
}
