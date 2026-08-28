import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxb extends dud {
   public static final MapCodec<dxb> b = b(dxb::new);
   @Nullable
   private static eay f;
   @Nullable
   private static eay g;

   @Override
   public MapCodec<dxb> a() {
      return b;
   }

   protected dxb(eas.d $$0) {
      super(dud.b.d, $$0);
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, @Nullable bxj $$3, czn $$4) {
      a($$0, $$1);
   }

   public static void a(djm $$0, iv $$1) {
      if ($$0.c_($$1) instanceof dzh $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(djm $$0, iv $$1, dzh $$2) {
      if (!$$0.C) {
         eat $$3 = $$2.m();
         boolean $$4 = $$3.a(dmt.hh) || $$3.a(dmt.hi);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != bud.a) {
            eay.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cne $$6 = bwr.bJ.a($$0, bwq.k);
               if ($$6 != null) {
                  dnn.a($$0, $$5);
                  iv $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jb.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == jb.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (arr $$8 : $$0.a(arr.class, $$6.cQ().g(50.0))) {
                     aq.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dnn.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(djm $$0, iv $$1, czn $$2) {
      return $$2.a(czr.vw) && $$1.v() >= $$0.G_() + 2 && $$0.an() != bud.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static eay q() {
      if (f == null) {
         f = eaz.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('^', eax.a(ebc.a(dmt.hh).or(ebc.a(dmt.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static eay r() {
      if (g == null) {
         g = eaz.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
