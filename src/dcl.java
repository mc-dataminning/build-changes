import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends dac {
   public static final MapCodec<dcl> b = b(dcl::new);
   @Nullable
   private static dfi h;
   @Nullable
   private static dfi i;

   @Override
   public MapCodec<dcl> a() {
      return b;
   }

   protected dcl(dfc.d $$0) {
      super(dac.b.d, $$0);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcz $$5 = $$0.c_($$1);
      if ($$5 instanceof dej) {
         a($$0, $$1, (dej)$$5);
      }
   }

   public static void a(cqb $$0, gw $$1, dej $$2) {
      if (!$$0.B) {
         dfd $$3 = $$2.q();
         boolean $$4 = $$3.a(cte.gG) || $$3.a(cte.gH);
         if ($$4 && $$1.v() >= $$0.H_() && $$0.ai() != bhb.a) {
            dfi.b $$5 = x().a($$0, $$1);
            if ($$5 != null) {
               byh $$6 = bja.bk.a($$0);
               if ($$6 != null) {
                  ctw.a($$0, $$5);
                  gw $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ha.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ha.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aku $$8 : $$0.a(aku.class, $$6.cG().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ctw.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cqb $$0, gw $$1, cjl $$2) {
      return $$2.a(cjo.ts) && $$1.v() >= $$0.H_() + 2 && $$0.ai() != bhb.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dfi x() {
      if (h == null) {
         h = dfj.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apv.aE)).a('^', dfh.a(dfm.a(cte.gG).or(dfm.a(cte.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dfi y() {
      if (i == null) {
         i = dfj.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apv.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
