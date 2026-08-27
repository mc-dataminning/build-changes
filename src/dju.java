import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dju extends dhd {
   public static final MapCodec<dju> b = b(dju::new);
   @Nullable
   private static dng h;
   @Nullable
   private static dng i;

   @Override
   public MapCodec<dju> a() {
      return b;
   }

   protected dju(dna.d $$0) {
      super(dhd.b.d, $$0);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      a($$0, $$1);
   }

   public static void a(cxb $$0, ib $$1) {
      if ($$0.c_($$1) instanceof dlt $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cxb $$0, ib $$1, dlt $$2) {
      if (!$$0.B) {
         dnb $$3 = $$2.n();
         boolean $$4 = $$3.a(dae.gG) || $$3.a(dae.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.aj() != bna.a) {
            dng.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               ces $$6 = bpd.bp.a($$0);
               if ($$6 != null) {
                  daw.a($$0, $$5);
                  ib $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ih.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == ih.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (apg $$8 : $$0.a(apg.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  daw.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cxb $$0, ib $$1, cqm $$2) {
      return $$2.a(cqp.uk) && $$1.v() >= $$0.I_() + 2 && $$0.aj() != bna.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dng s() {
      if (h == null) {
         h = dnh.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(aun.aF)).a('^', dnf.a(dnk.a(dae.gG).or(dnk.a(dae.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dng y() {
      if (i == null) {
         i = dnh.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(aun.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
