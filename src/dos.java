import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dmb {
   public static final MapCodec<dos> b = b(dos::new);
   @Nullable
   private static dsh h;
   @Nullable
   private static dsh i;

   @Override
   public MapCodec<dos> a() {
      return b;
   }

   protected dos(dsb.d $$0) {
      super(dmb.b.d, $$0);
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, @Nullable btp $$3, cup $$4) {
      a($$0, $$1);
   }

   public static void a(dby $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dqt $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dby $$0, iz $$1, dqt $$2) {
      if (!$$0.B) {
         dsc $$3 = $$2.n();
         boolean $$4 = $$3.a(dfb.gG) || $$3.a(dfb.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqr.a) {
            dsh.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               civ $$6 = bta.bp.a($$0);
               if ($$6 != null) {
                  dft.a($$0, $$5);
                  iz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == je.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == je.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (arg $$8 : $$0.a(arg.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dft.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dby $$0, iz $$1, cup $$2) {
      return $$2.a(cus.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqr.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsh y() {
      if (h == null) {
         h = dsi.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aF)).a('^', dsg.a(dsl.a(dfb.gG).or(dsl.a(dfb.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsh z() {
      if (i == null) {
         i = dsi.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
