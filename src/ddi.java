import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddi extends cut {
   public static final MapCodec<ddi> a = b(ddi::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ekb g = cut.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ekb h = cut.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dhw e = dhm.aE;
   public static final dhw f = dhm.aD;

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddi(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
      if (!$$3.bS()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      if (!($$3 instanceof cbt)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(crs $$0, dgw $$1, ht $$2, bki $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cuv.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(crs $$0, ht $$1, dgw $$2) {
      $$0.a(null, $$1, aqn.yp, aqo.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dlg.f, $$1, dlg.a.a($$2));
         $$0.c(2001, $$1, cut.i($$2));
      }
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, aqn.yq, aqo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dlg.c, $$2, dlg.a.a($$0));
         } else {
            $$1.a(null, $$2, aqn.yr, aqo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dlg.f, $$2, dlg.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cut.i($$0));
               bxk $$6 = bkm.bd.a((crs)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(cqy $$0, ht $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cqy $$0, ht $$1) {
      return $$0.a_($$1).a(arc.H);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(crs $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(crs $$0, cdm $$1, ht $$2, dgw $$3, @Nullable der $$4, clb $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e, f);
   }

   private boolean a(crs $$0, bki $$1) {
      if ($$1 instanceof bxk || $$1 instanceof bwe) {
         return false;
      } else {
         return !($$1 instanceof bky) ? false : $$1 instanceof cdm || $$0.X().b(cro.c);
      }
   }
}
