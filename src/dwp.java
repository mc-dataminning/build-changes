import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwp extends dtr {
   public static final MapCodec<dwp> b = b(dwp::new);
   @Nullable
   private static eam f;
   @Nullable
   private static eam g;

   @Override
   public MapCodec<dwp> a() {
      return b;
   }

   protected dwp(eag.d $$0) {
      super(dtr.b.d, $$0);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, @Nullable bxe $$3, czd $$4) {
      a($$0, $$1);
   }

   public static void a(dja $$0, iu $$1) {
      if ($$0.c_($$1) instanceof dyv $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dja $$0, iu $$1, dyv $$2) {
      if (!$$0.C) {
         eah $$3 = $$2.m();
         boolean $$4 = $$3.a(dmh.hh) || $$3.a(dmh.hi);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != bua.a) {
            eam.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cmu $$6 = bwo.bJ.a($$0, bwn.k);
               if ($$6 != null) {
                  dnb.a($$0, $$5);
                  iu $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ja.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == ja.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (arr $$8 : $$0.a(arr.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dnb.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dja $$0, iu $$1, czd $$2) {
      return $$2.a(czh.vw) && $$1.v() >= $$0.G_() + 2 && $$0.an() != bua.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static eam q() {
      if (f == null) {
         f = ean.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('^', eal.a(eaq.a(dmh.hh).or(eaq.a(dmh.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static eam r() {
      if (g == null) {
         g = ean.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
