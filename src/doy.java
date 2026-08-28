import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doy extends dmh {
   public static final MapCodec<doy> b = b(doy::new);
   @Nullable
   private static dsm h;
   @Nullable
   private static dsm i;

   @Override
   public MapCodec<doy> a() {
      return b;
   }

   protected doy(dsg.d $$0) {
      super(dmh.b.d, $$0);
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, @Nullable bsy $$3, cua $$4) {
      a($$0, $$1);
   }

   public static void a(dcd $$0, ja $$1) {
      if ($$0.c_($$1) instanceof dqz $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dcd $$0, ja $$1, dqz $$2) {
      if (!$$0.B) {
         dsh $$3 = $$2.n();
         boolean $$4 = $$3.a(dfh.gG) || $$3.a(dfh.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqa.a) {
            dsm.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cie $$6 = bsj.bp.a($$0);
               if ($$6 != null) {
                  dfz.a($$0, $$5);
                  ja $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jf.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == jf.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aql $$8 : $$0.a(aql.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfz.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dcd $$0, ja $$1, cua $$2) {
      return $$2.a(cud.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqa.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsm y() {
      if (h == null) {
         h = dsn.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avu.aF)).a('^', dsl.a(dsq.a(dfh.gG).or(dsq.a(dfh.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsm z() {
      if (i == null) {
         i = dsn.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avu.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
