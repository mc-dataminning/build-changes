import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxo extends duq {
   public static final MapCodec<dxo> b = b(dxo::new);
   @Nullable
   private static ebl f;
   @Nullable
   private static ebl g;

   @Override
   public MapCodec<dxo> a() {
      return b;
   }

   protected dxo(ebf.d $$0) {
      super(duq.b.d, $$0);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
      a($$0, $$1);
   }

   public static void a(djz $$0, iw $$1) {
      if ($$0.c_($$1) instanceof dzu $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(djz $$0, iw $$1, dzu $$2) {
      if (!$$0.C) {
         ebg $$3 = $$2.m();
         boolean $$4 = $$3.a(dng.hh) || $$3.a(dng.hi);
         if ($$4 && $$1.v() >= $$0.K_() && $$0.an() != buq.a) {
            ebl.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cnr $$6 = bxe.bK.a($$0, bxd.k);
               if ($$6 != null) {
                  doa.a($$0, $$5);
                  iw $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jc.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aV = $$5.b().o() == jc.a.a ? 0.0F : 90.0F;
                  $$6.j();

                  for (arv $$8 : $$0.a(arv.class, $$6.cR().g(50.0))) {
                     aq.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  doa.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(djz $$0, iw $$1, daa $$2) {
      return $$2.a(dae.vw) && $$1.v() >= $$0.K_() + 2 && $$0.an() != buq.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static ebl q() {
      if (f == null) {
         f = ebm.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axg.aI)).a('^', ebk.a(ebp.a(dng.hh).or(ebp.a(dng.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static ebl r() {
      if (g == null) {
         g = ebm.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axg.aI)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
