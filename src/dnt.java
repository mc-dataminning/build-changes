import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dlc {
   public static final MapCodec<dnt> b = b(dnt::new);
   @Nullable
   private static dri h;
   @Nullable
   private static dri i;

   @Override
   public MapCodec<dnt> a() {
      return b;
   }

   protected dnt(drc.d $$0) {
      super(dlc.b.d, $$0);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, @Nullable bsq $$3, ctq $$4) {
      a($$0, $$1);
   }

   public static void a(daz $$0, io $$1) {
      if ($$0.c_($$1) instanceof dpu $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(daz $$0, io $$1, dpu $$2) {
      if (!$$0.B) {
         drd $$3 = $$2.n();
         boolean $$4 = $$3.a(dec.gG) || $$3.a(dec.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bpt.a) {
            dri.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               chw $$6 = bsc.bp.a($$0);
               if ($$6 != null) {
                  deu.a($$0, $$5);
                  io $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == it.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == it.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aqo $$8 : $$0.a(aqo.class, $$6.cK().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  deu.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(daz $$0, io $$1, ctq $$2) {
      return $$2.a(ctt.um) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bpt.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dri s() {
      if (h == null) {
         h = drj.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avx.aF)).a('^', drh.a(drm.a(dec.gG).or(drm.a(dec.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dri y() {
      if (i == null) {
         i = drj.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avx.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
