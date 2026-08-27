import com.mojang.serialization.MapCodec;

public class djm extends dff implements djl {
   public static final MapCodec<djm> b = b(djm::new);

   @Override
   public MapCodec<djm> a() {
      return b;
   }

   public djm(dpx.d $$0) {
      super(bns.a(1), $$0);
   }

   @Override
   public int a(djq.a $$0, czv $$1, im $$2, ayd $$3, djq $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         im $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               im $$10 = $$7.c();
               dpy $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), ava.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(djq $$0, im $$1, im $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = axw.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = axw.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dpy a(czv $$0, im $$1, ayd $$2, boolean $$3) {
      dpy $$4;
      if ($$2.a(11) == 0) {
         $$4 = dcx.qV.n().a(djp.d, Boolean.valueOf($$3));
      } else {
         $$4 = dcx.qQ.n();
      }

      return $$4.b(dqo.C) && !$$0.b_($$1).c() ? $$4.a(dqo.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(czv $$0, im $$1) {
      dpy $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dcx.G) && $$2.u().b(els.c)) {
         int $$3 = 0;

         for (im $$4 : im.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dpy $$5 = $$0.a_($$4);
            if ($$5.a(dcx.qQ) || $$5.a(dcx.qV)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
