import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhg extends dch {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dqs b = dgr.aE;
   public static final dqp c = dqo.w;
   public static final dqp d = dqo.o;
   public static final ety e = dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ety f = dcv.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ety g = etv.a(e, f);
   public static final ety h = dcv.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ety i = etv.a(g, h);
   public static final ety j = etv.a(
      dcv.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dcv.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dcv.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ety k = etv.a(
      dcv.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dcv.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dcv.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ety l = etv.a(
      dcv.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dcv.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dcv.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ety m = etv.a(
      dcv.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dcv.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dcv.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      return g;
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   public dpy a(cvl $$0) {
      czu $$1 = $$0.q();
      csd $$2 = $$0.n();
      ckl $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gx()) {
         cuq $$5 = $$2.a(jz.F, cuq.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return i;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dof($$0, $$1);
   }

   public static boolean a(@Nullable bql $$0, czu $$1, im $$2, dpy $$3, csd $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bql $$0, czu $$1, im $$2, dpy $$3, csd $$4) {
      if ($$1.c_($$2) instanceof dof $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, auz.cz, ava.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bql $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      dpy $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dur.c, $$2, dur.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(czu $$0, im $$1, dpy $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(czu $$0, im $$1, dpy $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(czu $$0, im $$1, dpy $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dpy $$0, czu $$1, im $$2) {
      if ($$1.c_($$2) instanceof dof $$4) {
         ir $$5 = $$0.c(b);
         csd $$6 = $$4.b().r();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cgv $$9 = new cgv($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$3 == ir.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      if ($$0.c(d)) {
         dnd $$3 = $$1.c_($$2);
         if ($$3 instanceof dof) {
            return ((dof)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$1.c(d)) {
         return bos.d;
      } else if ($$0.a(avw.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bos.a($$2.B) : bos.e;
      } else {
         return $$0.d() && $$5 == bop.a ? bos.e : bos.d;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return boq.a($$1.B);
      } else {
         return boq.b;
      }
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(czu $$0, im $$1, ckl $$2) {
      dnd $$3 = $$0.c_($$1);
      if ($$3 instanceof dof) {
         $$2.a((dof)$$3);
         $$2.a(avj.au);
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
