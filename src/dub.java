import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dub extends drk {
   public static final MapCodec<dub> b = b(dub::new);
   @Nullable
   private static dxt h;
   @Nullable
   private static dxt i;

   @Override
   public MapCodec<dub> a() {
      return b;
   }

   protected dub(dxn.d $$0) {
      super(drk.b.d, $$0);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable bvx $$3, cxg $$4) {
      a($$0, $$1);
   }

   public static void a(dgz $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dwf $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgz $$0, jh $$1, dwf $$2) {
      if (!$$0.C) {
         dxo $$3 = $$2.m();
         boolean $$4 = $$3.a(dkf.hd) || $$3.a(dkf.he);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.am() != bsx.a) {
            dxt.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               clf $$6 = bvi.bJ.a($$0, bvh.k);
               if ($$6 != null) {
                  dky.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (ary $$8 : $$0.a(ary.class, $$6.cR().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dky.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dgz $$0, jh $$1, cxg $$2) {
      return $$2.a(cxk.vl) && $$1.v() >= $$0.L_() + 2 && $$0.am() != bsx.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxt q() {
      if (h == null) {
         h = dxu.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axk.aI)).a('^', dxs.a(dxx.a(dkf.hd).or(dxx.a(dkf.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxt r() {
      if (i == null) {
         i = dxu.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axk.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
