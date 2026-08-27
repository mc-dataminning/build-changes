import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfp extends dda {
   public static final MapCodec<dfp> b = b(dfp::new);
   @Nullable
   private static diu h;
   @Nullable
   private static diu i;

   @Override
   public MapCodec<dfp> a() {
      return b;
   }

   protected dfp(dio.d $$0) {
      super(dda.b.d, $$0);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgd $$5 = $$0.c_($$1);
      if ($$5 instanceof dho) {
         a($$0, $$1, (dho)$$5);
      }
   }

   public static void a(csy $$0, hv $$1, dho $$2) {
      if (!$$0.B) {
         dip $$3 = $$2.r();
         boolean $$4 = $$3.a(cwb.gG) || $$3.a(cwb.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.aj() != bji.a) {
            diu.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cas $$6 = blj.bm.a($$0);
               if ($$6 != null) {
                  cwt.a($$0, $$5);
                  hv $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ia.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ia.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (amq $$8 : $$0.a(amq.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cwt.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(csy $$0, hv $$1, cmh $$2) {
      return $$2.a(cmk.uf) && $$1.v() >= $$0.J_() + 2 && $$0.aj() != bji.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static diu s() {
      if (h == null) {
         h = div.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(arr.aE)).a('^', dit.a(diy.a(cwb.gG).or(diy.a(cwb.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static diu y() {
      if (i == null) {
         i = div.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(arr.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
