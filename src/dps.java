import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dps extends dnb {
   public static final MapCodec<dps> b = b(dps::new);
   @Nullable
   private static dth h;
   @Nullable
   private static dth i;

   @Override
   public MapCodec<dps> a() {
      return b;
   }

   protected dps(dtb.d $$0) {
      super(dnb.b.d, $$0);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, @Nullable btn $$3, cuq $$4) {
      a($$0, $$1);
   }

   public static void a(dcw $$0, jd $$1) {
      if ($$0.c_($$1) instanceof dru $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dcw $$0, jd $$1, dru $$2) {
      if (!$$0.B) {
         dtc $$3 = $$2.n();
         boolean $$4 = $$3.a(dga.gG) || $$3.a(dga.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqo.a) {
            dth.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               ciu $$6 = bsx.bp.a($$0);
               if ($$6 != null) {
                  dgs.a($$0, $$5);
                  jd $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ji.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == ji.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aqv $$8 : $$0.a(aqv.class, $$6.cL().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dgs.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dcw $$0, jd $$1, cuq $$2) {
      return $$2.a(cut.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqo.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dth y() {
      if (h == null) {
         h = dti.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awe.aF)).a('^', dtg.a(dtl.a(dga.gG).or(dtl.a(dga.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dth z() {
      if (i == null) {
         i = dti.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awe.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
