import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends ddz {
   public static final MapCodec<dgp> b = b(dgp::new);
   @Nullable
   private static dju h;
   @Nullable
   private static dju i;

   @Override
   public MapCodec<dgp> a() {
      return b;
   }

   protected dgp(djo.d $$0) {
      super(ddz.b.d, $$0);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dhd $$5 = $$0.c_($$1);
      if ($$5 instanceof dio) {
         a($$0, $$1, (dio)$$5);
      }
   }

   public static void a(ctx $$0, hx $$1, dio $$2) {
      if (!$$0.B) {
         djp $$3 = $$2.r();
         boolean $$4 = $$3.a(cxa.gG) || $$3.a(cxa.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.ak() != bjz.a) {
            dju.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cbp $$6 = bmc.bn.a($$0);
               if ($$6 != null) {
                  cxs.a($$0, $$5);
                  hx $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ic.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ic.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (anf $$8 : $$0.a(anf.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cxs.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(ctx $$0, hx $$1, cng $$2) {
      return $$2.a(cnj.ui) && $$1.v() >= $$0.J_() + 2 && $$0.ak() != bjz.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dju s() {
      if (h == null) {
         h = djv.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(asi.aE)).a('^', djt.a(djy.a(cxa.gG).or(djy.a(cxa.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dju y() {
      if (i == null) {
         i = djv.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(asi.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
