import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxy extends dva {
   public static final MapCodec<dxy> b = b(dxy::new);
   @Nullable
   private static ebv f;
   @Nullable
   private static ebv g;

   @Override
   public MapCodec<dxy> a() {
      return b;
   }

   protected dxy(ebp.d $$0) {
      super(dva.b.d, $$0);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
      a($$0, $$1);
   }

   public static void a(dkj $$0, iw $$1) {
      if ($$0.c_($$1) instanceof eae $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dkj $$0, iw $$1, eae $$2) {
      if (!$$0.C) {
         ebq $$3 = $$2.m();
         boolean $$4 = $$3.a(dnq.hh) || $$3.a(dnq.hi);
         if ($$4 && $$1.v() >= $$0.K_() && $$0.an() != buz.a) {
            ebv.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               coa $$6 = bxn.bK.a($$0, bxm.k);
               if ($$6 != null) {
                  dok.a($$0, $$5);
                  iw $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jc.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == jc.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (asc $$8 : $$0.a(asc.class, $$6.cR().g(50.0))) {
                     aq.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dok.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dkj $$0, iw $$1, dak $$2) {
      return $$2.a(dao.vw) && $$1.v() >= $$0.K_() + 2 && $$0.an() != buz.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static ebv q() {
      if (f == null) {
         f = ebw.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axn.aI)).a('^', ebu.a(ebz.a(dnq.hh).or(ebz.a(dnq.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static ebv r() {
      if (g == null) {
         g = ebw.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axn.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
