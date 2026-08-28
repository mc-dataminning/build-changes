import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doq extends dlz {
   public static final MapCodec<doq> b = b(doq::new);
   @Nullable
   private static dsf h;
   @Nullable
   private static dsf i;

   @Override
   public MapCodec<doq> a() {
      return b;
   }

   protected doq(drz.d $$0) {
      super(dlz.b.d, $$0);
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, @Nullable btn $$3, cun $$4) {
      a($$0, $$1);
   }

   public static void a(dbw $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dqr $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dbw $$0, iz $$1, dqr $$2) {
      if (!$$0.B) {
         dsa $$3 = $$2.n();
         boolean $$4 = $$3.a(dez.gG) || $$3.a(dez.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqp.a) {
            dsf.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cit $$6 = bsy.bp.a($$0);
               if ($$6 != null) {
                  dfr.a($$0, $$5);
                  iz $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == je.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == je.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (arf $$8 : $$0.a(arf.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dfr.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dbw $$0, iz $$1, cun $$2) {
      return $$2.a(cuq.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqp.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsf y() {
      if (h == null) {
         h = dsg.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awo.aF)).a('^', dse.a(dsj.a(dez.gG).or(dsj.a(dez.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsf z() {
      if (i == null) {
         i = dsg.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awo.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
