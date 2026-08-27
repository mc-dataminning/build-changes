import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpm extends dms {
   public static final MapCodec<dpm> b = b(dpm::new);
   @Nullable
   private static dth h;
   @Nullable
   private static dth i;

   @Override
   public MapCodec<dpm> a() {
      return b;
   }

   protected dpm(dtb.d $$0) {
      super(dms.b.d, $$0);
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, @Nullable bso $$3, cuh $$4) {
      a($$0, $$1);
   }

   public static void a(dca $$0, ir $$1) {
      if ($$0.c_($$1) instanceof drt $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dca $$0, ir $$1, drt $$2) {
      if (!$$0.C) {
         dtc $$3 = $$2.n();
         boolean $$4 = $$3.a(dfe.hA) || $$3.a(dfe.hB);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.al() != bpx.a) {
            dth.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               chu $$6 = bsb.bt.a($$0);
               if ($$6 != null) {
                  dfw.a($$0, $$5);
                  ir $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == iw.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.bj = $$5.b().o() == iw.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (aqu $$8 : $$0.a(aqu.class, $$6.cP().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfw.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dca $$0, ir $$1, cuh $$2) {
      return $$2.a(cuk.vX) && $$1.v() >= $$0.J_() + 2 && $$0.al() != bpx.a && !$$0.C ? y().a($$0, $$1) != null : false;
   }

   private static dth s() {
      if (h == null) {
         h = dti.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awe.aG)).a('^', dtg.a(dtl.a(dfe.hA).or(dtl.a(dfe.hB)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dth y() {
      if (i == null) {
         i = dti.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awe.aG)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
