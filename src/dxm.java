import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxm extends duo {
   public static final MapCodec<dxm> b = b(dxm::new);
   @Nullable
   private static ebj f;
   @Nullable
   private static ebj g;

   @Override
   public MapCodec<dxm> a() {
      return b;
   }

   protected dxm(ebd.d $$0) {
      super(duo.b.d, $$0);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, @Nullable bxu $$3, czy $$4) {
      a($$0, $$1);
   }

   public static void a(djx $$0, iv $$1) {
      if ($$0.c_($$1) instanceof dzs $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(djx $$0, iv $$1, dzs $$2) {
      if (!$$0.C) {
         ebe $$3 = $$2.m();
         boolean $$4 = $$3.a(dne.hh) || $$3.a(dne.hi);
         if ($$4 && $$1.v() >= $$0.K_() && $$0.an() != buo.a) {
            ebj.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cnp $$6 = bxc.bK.a($$0, bxb.k);
               if ($$6 != null) {
                  dny.a($$0, $$5);
                  iv $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jb.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == jb.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (art $$8 : $$0.a(art.class, $$6.cR().g(50.0))) {
                     aq.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dny.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(djx $$0, iv $$1, czy $$2) {
      return $$2.a(dac.vw) && $$1.v() >= $$0.K_() + 2 && $$0.an() != buo.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static ebj q() {
      if (f == null) {
         f = ebk.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axe.aI)).a('^', ebi.a(ebn.a(dne.hh).or(ebn.a(dne.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static ebj r() {
      if (g == null) {
         g = ebk.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axe.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
