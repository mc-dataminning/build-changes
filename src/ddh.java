import com.mojang.serialization.MapCodec;

public class ddh extends dcv {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final int b = 6;
   public static final dqy c = dqo.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ety[] g = new ety[]{
      dcv.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dcv.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dcv.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dcv.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dcv.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dcv.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dcv.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   protected ddh(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      cry $$7 = $$0.f();
      if ($$0.a(avw.ai) && $$1.c(c) == 0 && dcv.a($$7) instanceof ddk $$8) {
         if (!$$4.f()) {
            $$0.g(1);
         }

         $$2.a(null, $$3, auz.dr, ava.e, 1.0F, 1.0F);
         $$2.b($$3, ddl.a($$8));
         $$2.a($$4, dur.c, $$3);
         $$4.b(avj.c.b($$7));
         return bos.a;
      } else {
         return bos.d;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return boq.a;
         }

         if ($$3.b(bop.a).d()) {
            return boq.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static boq a(czv $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$3.t(false)) {
         return boq.d;
      } else {
         $$3.a(avj.U);
         $$3.gk().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dur.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dur.f, $$1);
         }

         return boq.a;
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
