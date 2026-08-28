import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dua extends drj {
   public static final MapCodec<dua> b = b(dua::new);
   @Nullable
   private static dxs h;
   @Nullable
   private static dxs i;

   @Override
   public MapCodec<dua> a() {
      return b;
   }

   protected dua(dxm.d $$0) {
      super(drj.b.d, $$0);
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, @Nullable bwb $$3, cxk $$4) {
      a($$0, $$1);
   }

   public static void a(dha $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dwe $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dha $$0, jh $$1, dwe $$2) {
      if (!$$0.C) {
         dxn $$3 = $$2.m();
         boolean $$4 = $$3.a(dkg.gW) || $$3.a(dkg.gX);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.al() != btb.a) {
            dxs.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               clj $$6 = bvm.bJ.a($$0, bvl.k);
               if ($$6 != null) {
                  dkz.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (asi $$8 : $$0.a(asi.class, $$6.cR().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dkz.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dha $$0, jh $$1, cxk $$2) {
      return $$2.a(cxo.vc) && $$1.v() >= $$0.L_() + 2 && $$0.al() != btb.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxs q() {
      if (h == null) {
         h = dxt.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axu.aI)).a('^', dxr.a(dxw.a(dkg.gW).or(dxw.a(dkg.gX)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxs r() {
      if (i == null) {
         i = dxt.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axu.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
