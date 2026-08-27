import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ded extends dbu {
   public static final MapCodec<ded> b = b(ded::new);
   @Nullable
   private static dhb h;
   @Nullable
   private static dhb i;

   @Override
   public MapCodec<ded> a() {
      return b;
   }

   protected ded(dgv.d $$0) {
      super(dbu.b.d, $$0);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      der $$5 = $$0.c_($$1);
      if ($$5 instanceof dgc) {
         a($$0, $$1, (dgc)$$5);
      }
   }

   public static void a(crs $$0, ht $$1, dgc $$2) {
      if (!$$0.B) {
         dgw $$3 = $$2.q();
         boolean $$4 = $$3.a(cuv.gG) || $$3.a(cuv.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ai() != bin.a) {
            dhb.b $$5 = x().a($$0, $$1);
            if ($$5 != null) {
               bzt $$6 = bkm.bk.a($$0);
               if ($$6 != null) {
                  cvn.a($$0, $$5);
                  ht $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hx.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hx.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (amb $$8 : $$0.a(amb.class, $$6.cG().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cvn.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(crs $$0, ht $$1, clb $$2) {
      return $$2.a(cle.tt) && $$1.v() >= $$0.I_() + 2 && $$0.ai() != bin.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dhb x() {
      if (h == null) {
         h = dhc.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(arc.aE)).a('^', dha.a(dhf.a(cuv.gG).or(dhf.a(cuv.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dhb y() {
      if (i == null) {
         i = dhc.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(arc.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
