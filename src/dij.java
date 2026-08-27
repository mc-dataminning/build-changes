import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dij extends dft {
   public static final MapCodec<dij> b = b(dij::new);
   @Nullable
   private static dlo h;
   @Nullable
   private static dlo i;

   @Override
   public MapCodec<dij> a() {
      return b;
   }

   protected dij(dli.d $$0) {
      super(dft.b.d, $$0);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      a($$0, $$1);
   }

   public static void a(cvr $$0, hz $$1) {
      if ($$0.c_($$1) instanceof dki $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cvr $$0, hz $$1, dki $$2) {
      if (!$$0.B) {
         dlj $$3 = $$2.r();
         boolean $$4 = $$3.a(cyu.gG) || $$3.a(cyu.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.aj() != blt.a) {
            dlo.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cdk $$6 = bnw.bn.a($$0);
               if ($$6 != null) {
                  czm.a($$0, $$5);
                  hz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ie.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ie.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (aox $$8 : $$0.a(aox.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  czm.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cvr $$0, hz $$1, cpd $$2) {
      return $$2.a(cpg.ui) && $$1.v() >= $$0.J_() + 2 && $$0.aj() != blt.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dlo s() {
      if (h == null) {
         h = dlp.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(aua.aE)).a('^', dln.a(dls.a(cyu.gG).or(dls.a(cyu.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dlo y() {
      if (i == null) {
         i = dlp.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(aua.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
