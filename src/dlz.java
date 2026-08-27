import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dji {
   public static final MapCodec<dlz> b = b(dlz::new);
   @Nullable
   private static dpn h;
   @Nullable
   private static dpn i;

   @Override
   public MapCodec<dlz> a() {
      return b;
   }

   protected dlz(dph.d $$0) {
      super(dji.b.d, $$0);
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, @Nullable bqt $$3, crs $$4) {
      a($$0, $$1);
   }

   public static void a(czg $$0, id $$1) {
      if ($$0.c_($$1) instanceof doa $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(czg $$0, id $$1, doa $$2) {
      if (!$$0.B) {
         dpi $$3 = $$2.n();
         boolean $$4 = $$3.a(dcj.gG) || $$3.a(dcj.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != boc.a) {
            dpn.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cfy $$6 = bqg.bo.a($$0);
               if ($$6 != null) {
                  ddb.a($$0, $$5);
                  id $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ij.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == ij.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (apv $$8 : $$0.a(apv.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ddb.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(czg $$0, id $$1, crs $$2) {
      return $$2.a(crv.uk) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != boc.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dpn s() {
      if (h == null) {
         h = dpo.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(ave.aF)).a('^', dpm.a(dpr.a(dcj.gG).or(dpr.a(dcj.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dpn y() {
      if (i == null) {
         i = dpo.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(ave.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
