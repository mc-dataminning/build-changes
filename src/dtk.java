import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtk extends dqt {
   public static final MapCodec<dtk> b = b(dtk::new);
   @Nullable
   private static dxc h;
   @Nullable
   private static dxc i;

   @Override
   public MapCodec<dtk> a() {
      return b;
   }

   protected dtk(dww.d $$0) {
      super(dqt.b.d, $$0);
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, @Nullable bvg $$3, cwp $$4) {
      a($$0, $$1);
   }

   public static void a(dgi $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dvo $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgi $$0, ji $$1, dvo $$2) {
      if (!$$0.C) {
         dwx $$3 = $$2.m();
         boolean $$4 = $$3.a(djo.hd) || $$3.a(djo.he);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.am() != bsg.a) {
            dxc.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cko $$6 = bur.bJ.a($$0, buq.k);
               if ($$6 != null) {
                  dkh.a($$0, $$5);
                  ji $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jn.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jn.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (ard $$8 : $$0.a(ard.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dkh.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dgi $$0, ji $$1, cwp $$2) {
      return $$2.a(cwt.vl) && $$1.v() >= $$0.L_() + 2 && $$0.am() != bsg.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxc q() {
      if (h == null) {
         h = dxd.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('^', dxb.a(dxg.a(djo.hd).or(dxg.a(djo.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxc r() {
      if (i == null) {
         i = dxd.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
