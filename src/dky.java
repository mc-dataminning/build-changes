import com.mojang.serialization.MapCodec;

public class dky extends dde implements dcy {
   public static final MapCodec<dky> a = b(dky::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dqy c = dqo.as;
   private static final ety e = dcv.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ety f = dcv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(csg.wr);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dpy $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dur.c, $$2, dur.a.a($$5));
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if ($$3 instanceof bre && $$3.ai() != bqr.Q && $$3.ai() != bqr.h) {
         $$3.a($$0, new etf(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.ds() || $$3.af != $$3.dy())) {
            double $$4 = Math.abs($$3.ds() - $$3.ad);
            double $$5 = Math.abs($$3.dy() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(csg.ry) ? bos.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new csd(csg.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, auz.zd, ava.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dpy $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dur.c, $$2, dur.a.a($$3, $$8));
         return boq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
