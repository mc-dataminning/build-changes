import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgh extends ddr {
   public static final MapCodec<dgh> b = b(dgh::new);
   @Nullable
   private static djm h;
   @Nullable
   private static djm i;

   @Override
   public MapCodec<dgh> a() {
      return b;
   }

   protected dgh(djg.d $$0) {
      super(ddr.b.d, $$0);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgv $$5 = $$0.c_($$1);
      if ($$5 instanceof dig) {
         a($$0, $$1, (dig)$$5);
      }
   }

   public static void a(ctp $$0, hx $$1, dig $$2) {
      if (!$$0.B) {
         djh $$3 = $$2.r();
         boolean $$4 = $$3.a(cws.gG) || $$3.a(cws.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.ak() != bjy.a) {
            djm.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cbi $$6 = blz.bm.a($$0);
               if ($$6 != null) {
                  cxk.a($$0, $$5);
                  hx $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ic.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ic.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (ane $$8 : $$0.a(ane.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cxk.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(ctp $$0, hx $$1, cmy $$2) {
      return $$2.a(cnb.uf) && $$1.v() >= $$0.J_() + 2 && $$0.ak() != bjy.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static djm s() {
      if (h == null) {
         h = djn.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(ash.aE)).a('^', djl.a(djq.a(cws.gG).or(djq.a(cws.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static djm y() {
      if (i == null) {
         i = djn.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(ash.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
