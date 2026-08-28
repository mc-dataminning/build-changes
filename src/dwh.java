import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwh extends dtk {
   public static final MapCodec<dwh> b = b(dwh::new);
   @Nullable
   private static eae f;
   @Nullable
   private static eae g;

   @Override
   public MapCodec<dwh> a() {
      return b;
   }

   protected dwh(dzy.d $$0) {
      super(dtk.b.d, $$0);
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, @Nullable bxc $$3, cyy $$4) {
      a($$0, $$1);
   }

   public static void a(div $$0, iu $$1) {
      if ($$0.c_($$1) instanceof dyn $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(div $$0, iu $$1, dyn $$2) {
      if (!$$0.C) {
         dzz $$3 = $$2.m();
         boolean $$4 = $$3.a(dmc.he) || $$3.a(dmc.hf);
         if ($$4 && $$1.v() >= $$0.G_() && $$0.an() != bty.a) {
            eae.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cmq $$6 = bwm.bJ.a($$0, bwl.k);
               if ($$6 != null) {
                  dmv.a($$0, $$5);
                  iu $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ja.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == ja.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (arr $$8 : $$0.a(arr.class, $$6.cR().g(50.0))) {
                     ap.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dmv.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(div $$0, iu $$1, cyy $$2) {
      return $$2.a(czc.vr) && $$1.v() >= $$0.G_() + 2 && $$0.an() != bty.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static eae q() {
      if (f == null) {
         f = eaf.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('^', ead.a(eai.a(dmc.he).or(eai.a(dmc.hf)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static eae r() {
      if (g == null) {
         g = eaf.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
