import com.mojang.serialization.MapCodec;

public class dix extends der implements diw {
   public static final MapCodec<dix> b = b(dix::new);

   @Override
   public MapCodec<dix> a() {
      return b;
   }

   public dix(dph.d $$0) {
      super(bnh.a(1), $$0);
   }

   @Override
   public int a(djb.a $$0, czh $$1, id $$2, axt $$3, djb $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         id $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               id $$10 = $$7.c();
               dpi $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aup.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(djb $$0, id $$1, id $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = axm.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = axm.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dpi a(czh $$0, id $$1, axt $$2, boolean $$3) {
      dpi $$4;
      if ($$2.a(11) == 0) {
         $$4 = dcj.qV.n().a(dja.d, Boolean.valueOf($$3));
      } else {
         $$4 = dcj.qQ.n();
      }

      return $$4.b(dpy.C) && !$$0.b_($$1).c() ? $$4.a(dpy.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(czh $$0, id $$1) {
      dpi $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dcj.G) && $$2.u().b(elc.c)) {
         int $$3 = 0;

         for (id $$4 : id.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dpi $$5 = $$0.a_($$4);
            if ($$5.a(dcj.qQ) || $$5.a(dcj.qV)) {
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
