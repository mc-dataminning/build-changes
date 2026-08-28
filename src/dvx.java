import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvx extends dtc {
   public static final MapCodec<dvx> b = b(dvx::new);
   @Nullable
   private static dzt f;
   @Nullable
   private static dzt g;

   @Override
   public MapCodec<dvx> a() {
      return b;
   }

   protected dvx(dzn.d $$0) {
      super(dtc.b.d, $$0);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
      a($$0, $$1);
   }

   public static void a(dip $$0, iu $$1) {
      if ($$0.c_($$1) instanceof dyd $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dip $$0, iu $$1, dyd $$2) {
      if (!$$0.C) {
         dzo $$3 = $$2.m();
         boolean $$4 = $$3.a(dlw.hd) || $$3.a(dlw.he);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != btv.a) {
            dzt.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cmk $$6 = bwj.bJ.a($$0, bwi.k);
               if ($$6 != null) {
                  dmp.a($$0, $$5);
                  iu $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ja.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == ja.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (arp $$8 : $$0.a(arp.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dmp.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dip $$0, iu $$1, cys $$2) {
      return $$2.a(cyw.vp) && $$1.v() >= $$0.G_() + 2 && $$0.an() != btv.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dzt q() {
      if (f == null) {
         f = dzu.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axa.aI)).a('^', dzs.a(dzx.a(dlw.hd).or(dzx.a(dlw.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static dzt r() {
      if (g == null) {
         g = dzu.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axa.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
