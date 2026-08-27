import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends dla {
   public static final MapCodec<dnr> b = b(dnr::new);
   @Nullable
   private static drg h;
   @Nullable
   private static drg i;

   @Override
   public MapCodec<dnr> a() {
      return b;
   }

   protected dnr(dra.d $$0) {
      super(dla.b.d, $$0);
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, @Nullable bso $$3, cto $$4) {
      a($$0, $$1);
   }

   public static void a(dax $$0, io $$1) {
      if ($$0.c_($$1) instanceof dps $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dax $$0, io $$1, dps $$2) {
      if (!$$0.B) {
         drb $$3 = $$2.n();
         boolean $$4 = $$3.a(dea.gG) || $$3.a(dea.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bpr.a) {
            drg.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               chu $$6 = bsa.bp.a($$0);
               if ($$6 != null) {
                  des.a($$0, $$5);
                  io $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == it.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aZ = $$5.b().o() == it.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aqn $$8 : $$0.a(aqn.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  des.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dax $$0, io $$1, cto $$2) {
      return $$2.a(ctr.um) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bpr.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static drg s() {
      if (h == null) {
         h = drh.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avw.aF)).a('^', drf.a(drk.a(dea.gG).or(drk.a(dea.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static drg y() {
      if (i == null) {
         i = drh.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avw.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
