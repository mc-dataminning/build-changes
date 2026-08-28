import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtl extends dqu {
   public static final MapCodec<dtl> b = b(dtl::new);
   @Nullable
   private static dxd h;
   @Nullable
   private static dxd i;

   @Override
   public MapCodec<dtl> a() {
      return b;
   }

   protected dtl(dwx.d $$0) {
      super(dqu.b.d, $$0);
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, @Nullable bvi $$3, cwq $$4) {
      a($$0, $$1);
   }

   public static void a(dgj $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dvp $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgj $$0, ji $$1, dvp $$2) {
      if (!$$0.C) {
         dwy $$3 = $$2.m();
         boolean $$4 = $$3.a(djp.hd) || $$3.a(djp.he);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.am() != bsi.a) {
            dxd.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               ckq $$6 = but.bI.a($$0, bus.k);
               if ($$6 != null) {
                  dki.a($$0, $$5);
                  ji $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jn.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jn.a.a ? 0.0F : 90.0F;
                  $$6.m();

                  for (are $$8 : $$0.a(are.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dki.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dgj $$0, ji $$1, cwq $$2) {
      return $$2.a(cwu.vl) && $$1.v() >= $$0.L_() + 2 && $$0.am() != bsi.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dxd q() {
      if (h == null) {
         h = dxe.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('^', dxc.a(dxh.a(djp.hd).or(dxh.a(djp.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dxd r() {
      if (i == null) {
         i = dxe.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
