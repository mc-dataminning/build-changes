import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dmd {
   public static final MapCodec<dou> b = b(dou::new);
   @Nullable
   private static dsj h;
   @Nullable
   private static dsj i;

   @Override
   public MapCodec<dou> a() {
      return b;
   }

   protected dou(dsd.d $$0) {
      super(dmd.b.d, $$0);
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, @Nullable btr $$3, cur $$4) {
      a($$0, $$1);
   }

   public static void a(dca $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dqv $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dca $$0, iz $$1, dqv $$2) {
      if (!$$0.B) {
         dse $$3 = $$2.n();
         boolean $$4 = $$3.a(dfd.gG) || $$3.a(dfd.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqt.a) {
            dsj.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cix $$6 = btc.bp.a($$0);
               if ($$6 != null) {
                  dfv.a($$0, $$5);
                  iz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == je.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == je.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (arg $$8 : $$0.a(arg.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfv.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dca $$0, iz $$1, cur $$2) {
      return $$2.a(cuu.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqt.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsj y() {
      if (h == null) {
         h = dsk.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aF)).a('^', dsi.a(dsn.a(dfd.gG).or(dsn.a(dfd.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsj z() {
      if (i == null) {
         i = dsk.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awp.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
