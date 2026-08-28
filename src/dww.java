import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dww extends dty {
   public static final MapCodec<dww> b = b(dww::new);
   @Nullable
   private static eat f;
   @Nullable
   private static eat g;

   @Override
   public MapCodec<dww> a() {
      return b;
   }

   protected dww(ean.d $$0) {
      super(dty.b.d, $$0);
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, @Nullable bxj $$3, czk $$4) {
      a($$0, $$1);
   }

   public static void a(djh $$0, iv $$1) {
      if ($$0.c_($$1) instanceof dzc $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(djh $$0, iv $$1, dzc $$2) {
      if (!$$0.C) {
         eao $$3 = $$2.m();
         boolean $$4 = $$3.a(dmo.hh) || $$3.a(dmo.hi);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != bud.a) {
            eat.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cnb $$6 = bwr.bJ.a($$0, bwq.k);
               if ($$6 != null) {
                  dni.a($$0, $$5);
                  iv $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jb.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == jb.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (arr $$8 : $$0.a(arr.class, $$6.cQ().g(50.0))) {
                     aq.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dni.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(djh $$0, iv $$1, czk $$2) {
      return $$2.a(czo.vw) && $$1.v() >= $$0.G_() + 2 && $$0.an() != bud.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static eat q() {
      if (f == null) {
         f = eau.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('^', eas.a(eax.a(dmo.hh).or(eax.a(dmo.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static eat r() {
      if (g == null) {
         g = eau.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
