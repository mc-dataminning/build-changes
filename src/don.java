import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class don extends dlw {
   public static final MapCodec<don> b = b(don::new);
   @Nullable
   private static dsc h;
   @Nullable
   private static dsc i;

   @Override
   public MapCodec<don> a() {
      return b;
   }

   protected don(drw.d $$0) {
      super(dlw.b.d, $$0);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, @Nullable btk $$3, cuk $$4) {
      a($$0, $$1);
   }

   public static void a(dbt $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dqo $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dbt $$0, iz $$1, dqo $$2) {
      if (!$$0.B) {
         drx $$3 = $$2.n();
         boolean $$4 = $$3.a(dew.gG) || $$3.a(dew.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqm.a) {
            dsc.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               ciq $$6 = bsv.bp.a($$0);
               if ($$6 != null) {
                  dfo.a($$0, $$5);
                  iz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == je.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == je.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (arc $$8 : $$0.a(arc.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfo.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dbt $$0, iz $$1, cuk $$2) {
      return $$2.a(cun.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqm.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dsc s() {
      if (h == null) {
         h = dsd.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awl.aF)).a('^', dsb.a(dsg.a(dew.gG).or(dsg.a(dew.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsc y() {
      if (i == null) {
         i = dsd.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awl.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
