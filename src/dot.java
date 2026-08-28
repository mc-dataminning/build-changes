import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends dmc {
   public static final MapCodec<dot> b = b(dot::new);
   @Nullable
   private static dsi h;
   @Nullable
   private static dsi i;

   @Override
   public MapCodec<dot> a() {
      return b;
   }

   protected dot(dsc.d $$0) {
      super(dmc.b.d, $$0);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, @Nullable btq $$3, cuq $$4) {
      a($$0, $$1);
   }

   public static void a(dbz $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dqu $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dbz $$0, iz $$1, dqu $$2) {
      if (!$$0.B) {
         dsd $$3 = $$2.n();
         boolean $$4 = $$3.a(dfc.gG) || $$3.a(dfc.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqs.a) {
            dsi.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               ciw $$6 = btb.bp.a($$0);
               if ($$6 != null) {
                  dfu.a($$0, $$5);
                  iz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == je.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == je.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (arg $$8 : $$0.a(arg.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfu.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dbz $$0, iz $$1, cuq $$2) {
      return $$2.a(cut.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqs.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsi y() {
      if (h == null) {
         h = dsj.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aF)).a('^', dsh.a(dsm.a(dfc.gG).or(dsm.a(dfc.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsi z() {
      if (i == null) {
         i = dsj.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
