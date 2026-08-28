import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drd extends dom {
   public static final MapCodec<drd> b = b(drd::new);
   @Nullable
   private static dut h;
   @Nullable
   private static dut i;

   @Override
   public MapCodec<drd> a() {
      return b;
   }

   protected drd(dun.d $$0) {
      super(dom.b.d, $$0);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, @Nullable buk $$3, cvp $$4) {
      a($$0, $$1);
   }

   public static void a(deg $$0, je $$1) {
      if ($$0.c_($$1) instanceof dtg $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(deg $$0, je $$1, dtg $$2) {
      if (!$$0.B) {
         duo $$3 = $$2.m();
         boolean $$4 = $$3.a(dhl.gG) || $$3.a(dhl.gH);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.am() != brm.a) {
            dut.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cjr $$6 = btv.bp.a($$0, btu.k);
               if ($$6 != null) {
                  did.a($$0, $$5);
                  je $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jj.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aT = $$5.b().o() == jj.a.a ? 0.0F : 90.0F;
                  $$6.q();

                  for (ari $$8 : $$0.a(ari.class, $$6.cO().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  did.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(deg $$0, je $$1, cvp $$2) {
      return $$2.a(cvt.uo) && $$1.v() >= $$0.G_() + 2 && $$0.am() != brm.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dut y() {
      if (h == null) {
         h = duu.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awt.aG)).a('^', dus.a(dux.a(dhl.gG).or(dux.a(dhl.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dut z() {
      if (i == null) {
         i = duu.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awt.aG)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
