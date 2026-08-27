import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends dde implements dcy, djw {
   public static final MapCodec<djs> a = b(djs::new);
   public static final int b = 4;
   public static final dqy c = dqo.aS;
   public static final dqp d = dqo.C;
   protected static final ety e = dcv.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ety f = dcv.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ety g = dcv.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ety h = dcv.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         elr $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == els.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dpy $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return !$$0.k($$1, $$2).a(ir.b).c() || $$0.d($$1, $$2, ir.b);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!$$0.a($$3, $$4)) {
         return dcx.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(avo.aq)) {
         int $$4 = 5;
         int $$5 = 1;
         int $$6 = 2;
         int $$7 = 0;
         int $$8 = $$2.u() - 2;
         int $$9 = 0;

         for (int $$10 = 0; $$10 < 5; $$10++) {
            for (int $$11 = 0; $$11 < $$5; $$11++) {
               int $$12 = 2 + $$2.v() - 1;

               for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
                  im $$14 = new im($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dcx.G)) {
                     dpy $$15 = $$0.a_($$14.d());
                     if ($$15.a(avo.aq)) {
                        $$0.a($$14, dcx.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
                     }
                  }
               }
            }

            if ($$7 < 2) {
               $$5 += 2;
               $$9++;
            } else {
               $$5 -= 2;
               $$9--;
            }

            $$7++;
         }

         $$0.a($$2, $$3.a(c, Integer.valueOf(4)), 2);
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
