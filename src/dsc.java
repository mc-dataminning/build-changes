import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsc extends dpl {
   public static final MapCodec<dsc> b = b(dsc::new);
   @Nullable
   private static dvt h;
   @Nullable
   private static dvt i;

   @Override
   public MapCodec<dsc> a() {
      return b;
   }

   protected dsc(dvn.d $$0) {
      super(dpl.b.d, $$0);
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, @Nullable bve $$3, cwf $$4) {
      a($$0, $$1);
   }

   public static void a(dff $$0, jh $$1) {
      if ($$0.c_($$1) instanceof duf $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dff $$0, jh $$1, duf $$2) {
      if (!$$0.C) {
         dvo $$3 = $$2.m();
         boolean $$4 = $$3.a(dil.gG) || $$3.a(dil.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bse.a) {
            dvt.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               ckm $$6 = bup.bp.a($$0, buo.k);
               if ($$6 != null) {
                  djd.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.q();

                  for (arr $$8 : $$0.a(arr.class, $$6.cT().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  djd.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dff $$0, jh $$1, cwf $$2) {
      return $$2.a(cwj.uE) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bse.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dvt q() {
      if (h == null) {
         h = dvu.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axd.aH)).a('^', dvs.a(dvx.a(dil.gG).or(dvx.a(dil.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dvt r() {
      if (i == null) {
         i = dvu.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axd.aH)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
