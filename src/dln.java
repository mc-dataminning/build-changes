import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends dcv {
   public static final MapCodec<dln> a = b(dln::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ety g = dcv.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ety h = dcv.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dqy e = dqo.aE;
   public static final dqy f = dqo.aD;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
      if (!$$3.bU()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      if (!($$3 instanceof cik)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(czu $$0, dpy $$1, im $$2, bql $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dcx.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      $$0.a(null, $$1, auz.zT, ava.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dur.f, $$1, dur.a.a($$2));
         $$0.c(2001, $$1, dcv.i($$2));
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, auz.zU, ava.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dur.c, $$2, dur.a.a($$0));
         } else {
            $$1.a(null, $$2, auz.zV, ava.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dur.f, $$2, dur.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dcv.i($$0));
               cdu $$6 = bqr.bg.a((czu)$$1);
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

   public static boolean a(cza $$0, im $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cza $$0, im $$1) {
      return $$0.a_($$1).a(avo.H);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(czu $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(czu $$0, ckl $$1, im $$2, dpy $$3, @Nullable dnd $$4, csd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e, f);
   }

   private boolean a(czu $$0, bql $$1) {
      if ($$1 instanceof cdu || $$1 instanceof cco) {
         return false;
      } else {
         return !($$1 instanceof bre) ? false : $$1 instanceof ckl || $$0.aa().b(czq.c);
      }
   }
}
