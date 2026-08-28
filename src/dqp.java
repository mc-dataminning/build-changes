import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqp extends dny {
   public static final MapCodec<dqp> b = b(dqp::new);
   @Nullable
   private static duf h;
   @Nullable
   private static duf i;

   @Override
   public MapCodec<dqp> a() {
      return b;
   }

   protected dqp(dtz.d $$0) {
      super(dny.b.d, $$0);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, @Nullable buf $$3, cvl $$4) {
      a($$0, $$1);
   }

   public static void a(dds $$0, je $$1) {
      if ($$0.c_($$1) instanceof dss $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dds $$0, je $$1, dss $$2) {
      if (!$$0.B) {
         dua $$3 = $$2.m();
         boolean $$4 = $$3.a(dgx.gG) || $$3.a(dgx.gH);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.am() != brh.a) {
            duf.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cjm $$6 = btq.bp.a($$0, btp.k);
               if ($$6 != null) {
                  dhp.a($$0, $$5);
                  je $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jj.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == jj.a.a ? 0.0F : 90.0F;
                  $$6.q();

                  for (arh $$8 : $$0.a(arh.class, $$6.cO().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dhp.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dds $$0, je $$1, cvl $$2) {
      return $$2.a(cvo.uo) && $$1.v() >= $$0.G_() + 2 && $$0.am() != brh.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static duf y() {
      if (h == null) {
         h = dug.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(aws.aG)).a('^', due.a(duj.a(dgx.gG).or(duj.a(dgx.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static duf z() {
      if (i == null) {
         i = dug.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(aws.aG)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
