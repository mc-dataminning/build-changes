import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drx extends dpg {
   public static final MapCodec<drx> b = b(drx::new);
   @Nullable
   private static dvo h;
   @Nullable
   private static dvo i;

   @Override
   public MapCodec<drx> a() {
      return b;
   }

   protected drx(dvi.d $$0) {
      super(dpg.b.d, $$0);
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, @Nullable bva $$3, cwb $$4) {
      a($$0, $$1);
   }

   public static void a(dfb $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dua $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dfb $$0, jh $$1, dua $$2) {
      if (!$$0.C) {
         dvj $$3 = $$2.m();
         boolean $$4 = $$3.a(dig.gG) || $$3.a(dig.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bsa.a) {
            dvo.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cki $$6 = bul.bp.a($$0, buk.k);
               if ($$6 != null) {
                  diy.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.q();

                  for (aro $$8 : $$0.a(aro.class, $$6.cS().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  diy.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dfb $$0, jh $$1, cwb $$2) {
      return $$2.a(cwf.uo) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bsa.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dvo q() {
      if (h == null) {
         h = dvp.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axa.aG)).a('^', dvn.a(dvs.a(dig.gG).or(dvs.a(dig.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dvo r() {
      if (i == null) {
         i = dvp.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axa.aG)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
