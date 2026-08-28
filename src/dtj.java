import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtj extends dqs {
   public static final MapCodec<dtj> b = b(dtj::new);
   @Nullable
   private static dxb h;
   @Nullable
   private static dxb i;

   @Override
   public MapCodec<dtj> a() {
      return b;
   }

   protected dtj(dwv.d $$0) {
      super(dqs.b.d, $$0);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable bvg $$3, cwo $$4) {
      a($$0, $$1);
   }

   public static void a(dgh $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dvn $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgh $$0, ji $$1, dvn $$2) {
      if (!$$0.C) {
         dww $$3 = $$2.m();
         boolean $$4 = $$3.a(djn.hd) || $$3.a(djn.he);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.am() != bsg.a) {
            dxb.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cko $$6 = bur.bI.a($$0, buq.k);
               if ($$6 != null) {
                  dkg.a($$0, $$5);
                  ji $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jn.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jn.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (are $$8 : $$0.a(are.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dkg.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dgh $$0, ji $$1, cwo $$2) {
      return $$2.a(cws.vl) && $$1.v() >= $$0.L_() + 2 && $$0.am() != bsg.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxb q() {
      if (h == null) {
         h = dxc.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('^', dxa.a(dxf.a(djn.hd).or(dxf.a(djn.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxb r() {
      if (i == null) {
         i = dxc.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
