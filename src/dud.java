import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dud extends drm {
   public static final MapCodec<dud> b = b(dud::new);
   @Nullable
   private static dxv f;
   @Nullable
   private static dxv g;

   @Override
   public MapCodec<dud> a() {
      return b;
   }

   protected dud(dxp.d $$0) {
      super(drm.b.d, $$0);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable bvy $$3, cxh $$4) {
      a($$0, $$1);
   }

   public static void a(dgz $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dwh $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgz $$0, ji $$1, dwh $$2) {
      if (!$$0.C) {
         dxq $$3 = $$2.m();
         boolean $$4 = $$3.a(dkg.hd) || $$3.a(dkg.he);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != bsv.a) {
            dxv.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               clj $$6 = bvi.bI.a($$0, bvh.k);
               if ($$6 != null) {
                  dkz.a($$0, $$5);
                  ji $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jn.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == jn.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (are $$8 : $$0.a(are.class, $$6.cQ().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dkz.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dgz $$0, ji $$1, cxh $$2) {
      return $$2.a(cxl.vn) && $$1.v() >= $$0.G_() + 2 && $$0.an() != bsv.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxv q() {
      if (f == null) {
         f = dxw.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('^', dxu.a(dxz.a(dkg.hd).or(dxz.a(dkg.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static dxv r() {
      if (g == null) {
         g = dxw.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
