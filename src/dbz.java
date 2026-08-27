import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbz extends dcv implements dcy {
   public static final MapCodec<dbz> a = b(dbz::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ety e = dcv.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ety f = dcv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ety g = dcv.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dqy h = dqo.aq;
   public static final dqw<dqk> i = dqo.bk;
   public static final dqy j = dqo.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbz(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dqk.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      ety $$4 = $$0.c(i) == dqk.c ? f : e;
      etf $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      etf $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dpy $$0, cza $$1, im $$2) {
      return false;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dpy $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(avo.au)) {
            if ($$2.a(dcx.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(dcx.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               dpy $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dcx.mZ) ? this.n().a(h, $$4.c(h)) : dcx.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.d()).a(avo.au);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ir.b && $$2.a(dcx.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         im $$9 = $$2.b($$4);
         dpy $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dpy $$0, ckl $$1, cza $$2, im $$3) {
      return $$1.eV().f() instanceof cto ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dpy $$0, czu $$1, im $$2, ayd $$3, int $$4) {
      dpy $$5 = $$1.a_($$2.d());
      im $$6 = $$2.c(2);
      dpy $$7 = $$1.a_($$6);
      dqk $$8 = dqk.a;
      if ($$4 >= 1) {
         if (!$$5.a(dcx.mZ) || $$5.c(i) == dqk.a) {
            $$8 = dqk.b;
         } else if ($$5.a(dcx.mZ) && $$5.c(i) != dqk.a) {
            $$8 = dqk.c;
            if ($$7.a(dcx.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dqk.b), 3);
               $$1.a($$6, $$7.a(i, dqk.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dcx.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cza $$0, im $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dcx.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cza $$0, im $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dcx.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
