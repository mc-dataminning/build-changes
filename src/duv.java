import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duv extends dsc {
   public static final MapCodec<duv> b = b(duv::new);
   @Nullable
   private static dyr f;
   @Nullable
   private static dyr g;

   @Override
   public MapCodec<duv> a() {
      return b;
   }

   protected duv(dyl.d $$0) {
      super(dsc.b.d, $$0);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, @Nullable bwr $$3, cxy $$4) {
      a($$0, $$1);
   }

   public static void a(dhp $$0, jj $$1) {
      if ($$0.c_($$1) instanceof dxb $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dhp $$0, jj $$1, dxb $$2) {
      if (!$$0.C) {
         dym $$3 = $$2.m();
         boolean $$4 = $$3.a(dkw.hd) || $$3.a(dkw.he);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != btn.a) {
            dyr.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cma $$6 = bwb.bI.a($$0, bwa.k);
               if ($$6 != null) {
                  dlp.a($$0, $$5);
                  jj $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jo.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == jo.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (aro $$8 : $$0.a(aro.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dlp.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dhp $$0, jj $$1, cxy $$2) {
      return $$2.a(cyc.vp) && $$1.v() >= $$0.G_() + 2 && $$0.an() != btn.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dyr q() {
      if (f == null) {
         f = dys.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awz.aI)).a('^', dyq.a(dyv.a(dkw.hd).or(dyv.a(dkw.he)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static dyr r() {
      if (g == null) {
         g = dys.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awz.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
