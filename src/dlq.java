import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends diz {
   public static final MapCodec<dlq> b = b(dlq::new);
   @Nullable
   private static dpe h;
   @Nullable
   private static dpe i;

   @Override
   public MapCodec<dlq> a() {
      return b;
   }

   protected dlq(doy.d $$0) {
      super(diz.b.d, $$0);
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, @Nullable bqo $$3, crj $$4) {
      a($$0, $$1);
   }

   public static void a(cyx $$0, ib $$1) {
      if ($$0.c_($$1) instanceof dnr $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cyx $$0, ib $$1, dnr $$2) {
      if (!$$0.B) {
         doz $$3 = $$2.n();
         boolean $$4 = $$3.a(dca.gG) || $$3.a(dca.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bnx.a) {
            dpe.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cfr $$6 = bqb.bo.a($$0);
               if ($$6 != null) {
                  dcs.a($$0, $$5);
                  ib $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ih.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == ih.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (apt $$8 : $$0.a(apt.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dcs.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cyx $$0, ib $$1, crj $$2) {
      return $$2.a(crm.uk) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bnx.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dpe s() {
      if (h == null) {
         h = dpf.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avc.aF)).a('^', dpd.a(dpi.a(dca.gG).or(dpi.a(dca.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dpe y() {
      if (i == null) {
         i = dpf.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avc.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
