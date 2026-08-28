import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpq extends dmz {
   public static final MapCodec<dpq> b = b(dpq::new);
   @Nullable
   private static dtf h;
   @Nullable
   private static dtf i;

   @Override
   public MapCodec<dpq> a() {
      return b;
   }

   protected dpq(dsz.d $$0) {
      super(dmz.b.d, $$0);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, @Nullable btl $$3, cuo $$4) {
      a($$0, $$1);
   }

   public static void a(dcu $$0, jd $$1) {
      if ($$0.c_($$1) instanceof drs $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dcu $$0, jd $$1, drs $$2) {
      if (!$$0.B) {
         dta $$3 = $$2.n();
         boolean $$4 = $$3.a(dfy.gG) || $$3.a(dfy.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqn.a) {
            dtf.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cis $$6 = bsw.bp.a($$0);
               if ($$6 != null) {
                  dgq.a($$0, $$5);
                  jd $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ji.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == ji.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aqu $$8 : $$0.a(aqu.class, $$6.cL().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dgq.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dcu $$0, jd $$1, cuo $$2) {
      return $$2.a(cur.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqn.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dtf y() {
      if (h == null) {
         h = dtg.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awd.aF)).a('^', dte.a(dtj.a(dfy.gG).or(dtj.a(dfy.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dtf z() {
      if (i == null) {
         i = dtg.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awd.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
