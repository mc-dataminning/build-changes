import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dif extends dfp {
   public static final MapCodec<dif> b = b(dif::new);
   @Nullable
   private static dlk h;
   @Nullable
   private static dlk i;

   @Override
   public MapCodec<dif> a() {
      return b;
   }

   protected dif(dle.d $$0) {
      super(dfp.b.d, $$0);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      a($$0, $$1);
   }

   public static void a(cvn $$0, hz $$1) {
      if ($$0.c_($$1) instanceof dke $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cvn $$0, hz $$1, dke $$2) {
      if (!$$0.B) {
         dlf $$3 = $$2.r();
         boolean $$4 = $$3.a(cyq.gG) || $$3.a(cyq.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.ak() != blr.a) {
            dlk.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cdg $$6 = bnu.bn.a($$0);
               if ($$6 != null) {
                  czi.a($$0, $$5);
                  hz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ie.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ie.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (aow $$8 : $$0.a(aow.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  czi.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cvn $$0, hz $$1, coz $$2) {
      return $$2.a(cpc.ui) && $$1.v() >= $$0.J_() + 2 && $$0.ak() != blr.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dlk s() {
      if (h == null) {
         h = dll.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(atz.aE)).a('^', dlj.a(dlo.a(cyq.gG).or(dlo.a(cyq.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dlk y() {
      if (i == null) {
         i = dll.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(atz.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
