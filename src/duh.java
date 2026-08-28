import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duh extends drq {
   public static final MapCodec<duh> b = b(duh::new);
   @Nullable
   private static dxz h;
   @Nullable
   private static dxz i;

   @Override
   public MapCodec<duh> a() {
      return b;
   }

   protected duh(dxt.d $$0) {
      super(drq.b.d, $$0);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
      a($$0, $$1);
   }

   public static void a(dhh $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dwl $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dhh $$0, jh $$1, dwl $$2) {
      if (!$$0.C) {
         dxu $$3 = $$2.m();
         boolean $$4 = $$3.a(dkn.gW) || $$3.a(dkn.gX);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.al() != btf.a) {
            dxz.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cln $$6 = bvq.bJ.a($$0, bvp.k);
               if ($$6 != null) {
                  dlg.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (asi $$8 : $$0.a(asi.class, $$6.cR().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dlg.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dhh $$0, jh $$1, cxo $$2) {
      return $$2.a(cxs.vc) && $$1.v() >= $$0.L_() + 2 && $$0.al() != btf.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxz q() {
      if (h == null) {
         h = dya.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axu.aI)).a('^', dxy.a(dyd.a(dkn.gW).or(dyd.a(dkn.gX)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxz r() {
      if (i == null) {
         i = dya.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axu.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
