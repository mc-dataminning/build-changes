import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgg extends ddq {
   public static final MapCodec<dgg> b = b(dgg::new);
   @Nullable
   private static djl h;
   @Nullable
   private static djl i;

   @Override
   public MapCodec<dgg> a() {
      return b;
   }

   protected dgg(djf.d $$0) {
      super(ddq.b.d, $$0);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgu $$5 = $$0.c_($$1);
      if ($$5 instanceof dif) {
         a($$0, $$1, (dif)$$5);
      }
   }

   public static void a(cto $$0, hx $$1, dif $$2) {
      if (!$$0.B) {
         djg $$3 = $$2.r();
         boolean $$4 = $$3.a(cwr.gG) || $$3.a(cwr.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.ak() != bjx.a) {
            djl.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cbh $$6 = bly.bm.a($$0);
               if ($$6 != null) {
                  cxj.a($$0, $$5);
                  hx $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ic.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ic.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (ane $$8 : $$0.a(ane.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cxj.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cto $$0, hx $$1, cmx $$2) {
      return $$2.a(cna.uf) && $$1.v() >= $$0.J_() + 2 && $$0.ak() != bjx.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static djl s() {
      if (h == null) {
         h = djm.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(asg.aE)).a('^', djk.a(djp.a(cwr.gG).or(djp.a(cwr.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static djl y() {
      if (i == null) {
         i = djm.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(asg.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
