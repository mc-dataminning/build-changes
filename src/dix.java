import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dix extends dgg {
   public static final MapCodec<dix> b = b(dix::new);
   @Nullable
   private static dmj h;
   @Nullable
   private static dmj i;

   @Override
   public MapCodec<dix> a() {
      return b;
   }

   protected dix(dmd.d $$0) {
      super(dgg.b.d, $$0);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      a($$0, $$1);
   }

   public static void a(cwe $$0, ib $$1) {
      if ($$0.c_($$1) instanceof dkw $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cwe $$0, ib $$1, dkw $$2) {
      if (!$$0.B) {
         dme $$3 = $$2.n();
         boolean $$4 = $$3.a(czh.gG) || $$3.a(czh.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.aj() != bmi.a) {
            dmj.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cdz $$6 = bol.bn.a($$0);
               if ($$6 != null) {
                  czz.a($$0, $$5);
                  ib $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ih.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == ih.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (apb $$8 : $$0.a(apb.class, $$6.cE().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  czz.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cwe $$0, ib $$1, cpq $$2) {
      return $$2.a(cpt.ui) && $$1.v() >= $$0.J_() + 2 && $$0.aj() != bmi.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dmj s() {
      if (h == null) {
         h = dmk.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(aue.aE)).a('^', dmi.a(dmn.a(czh.gG).or(dmn.a(czh.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dmj y() {
      if (i == null) {
         i = dmk.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(aue.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
