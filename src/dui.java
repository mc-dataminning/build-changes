import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dui extends drr {
   public static final MapCodec<dui> b = b(dui::new);
   @Nullable
   private static dya h;
   @Nullable
   private static dya i;

   @Override
   public MapCodec<dui> a() {
      return b;
   }

   protected dui(dxu.d $$0) {
      super(drr.b.d, $$0);
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, @Nullable bwg $$3, cxp $$4) {
      a($$0, $$1);
   }

   public static void a(dhi $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dwm $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dhi $$0, jh $$1, dwm $$2) {
      if (!$$0.C) {
         dxv $$3 = $$2.m();
         boolean $$4 = $$3.a(dko.gW) || $$3.a(dko.gX);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.al() != btg.a) {
            dya.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               clo $$6 = bvr.bJ.a($$0, bvq.k);
               if ($$6 != null) {
                  dlh.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (asi $$8 : $$0.a(asi.class, $$6.cR().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dlh.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dhi $$0, jh $$1, cxp $$2) {
      return $$2.a(cxt.vc) && $$1.v() >= $$0.L_() + 2 && $$0.al() != btg.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dya q() {
      if (h == null) {
         h = dyb.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axu.aI)).a('^', dxz.a(dye.a(dko.gW).or(dye.a(dko.gX)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dya r() {
      if (i == null) {
         i = dyb.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axu.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
