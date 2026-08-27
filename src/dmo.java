import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends djx {
   public static final MapCodec<dmo> b = b(dmo::new);
   @Nullable
   private static dqd h;
   @Nullable
   private static dqd i;

   @Override
   public MapCodec<dmo> a() {
      return b;
   }

   protected dmo(dpx.d $$0) {
      super(djx.b.d, $$0);
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, @Nullable bre $$3, csd $$4) {
      a($$0, $$1);
   }

   public static void a(czu $$0, im $$1) {
      if ($$0.c_($$1) instanceof dop $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(czu $$0, im $$1, dop $$2) {
      if (!$$0.B) {
         dpy $$3 = $$2.n();
         boolean $$4 = $$3.a(dcx.gG) || $$3.a(dcx.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bon.a) {
            dqd.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cgj $$6 = bqr.bo.a($$0);
               if ($$6 != null) {
                  ddp.a($$0, $$5);
                  im $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ir.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aZ = $$5.b().o() == ir.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (aqf $$8 : $$0.a(aqf.class, $$6.cI().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ddp.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(czu $$0, im $$1, csd $$2) {
      return $$2.a(csg.um) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bon.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dqd s() {
      if (h == null) {
         h = dqe.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avo.aF)).a('^', dqc.a(dqh.a(dcx.gG).or(dqh.a(dcx.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dqd y() {
      if (i == null) {
         i = dqe.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avo.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
