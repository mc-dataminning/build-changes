import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dti extends dqr {
   public static final MapCodec<dti> b = b(dti::new);
   @Nullable
   private static dxa h;
   @Nullable
   private static dxa i;

   @Override
   public MapCodec<dti> a() {
      return b;
   }

   protected dti(dwu.d $$0) {
      super(dqr.b.d, $$0);
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, @Nullable bvf $$3, cwn $$4) {
      a($$0, $$1);
   }

   public static void a(dgg $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dvm $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgg $$0, ji $$1, dvm $$2) {
      if (!$$0.C) {
         dwv $$3 = $$2.m();
         boolean $$4 = $$3.a(djm.hd) || $$3.a(djm.he);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.am() != bsf.a) {
            dxa.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               ckn $$6 = buq.bI.a($$0, bup.k);
               if ($$6 != null) {
                  dkf.a($$0, $$5);
                  ji $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jn.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jn.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (ard $$8 : $$0.a(ard.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dkf.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dgg $$0, ji $$1, cwn $$2) {
      return $$2.a(cwr.vl) && $$1.v() >= $$0.L_() + 2 && $$0.am() != bsf.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxa q() {
      if (h == null) {
         h = dxb.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awo.aI)).a('^', dwz.a(dxe.a(djm.hd).or(dxe.a(djm.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxa r() {
      if (i == null) {
         i = dxb.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awo.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
