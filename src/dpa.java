import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpa extends dmj {
   public static final MapCodec<dpa> b = b(dpa::new);
   @Nullable
   private static dsp h;
   @Nullable
   private static dsp i;

   @Override
   public MapCodec<dpa> a() {
      return b;
   }

   protected dpa(dsj.d $$0) {
      super(dmj.b.d, $$0);
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, @Nullable btb $$3, cuc $$4) {
      a($$0, $$1);
   }

   public static void a(dcf $$0, ja $$1) {
      if ($$0.c_($$1) instanceof drc $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dcf $$0, ja $$1, drc $$2) {
      if (!$$0.B) {
         dsk $$3 = $$2.n();
         boolean $$4 = $$3.a(dfj.gG) || $$3.a(dfj.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqd.a) {
            dsp.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cih $$6 = bsm.bp.a($$0);
               if ($$6 != null) {
                  dgb.a($$0, $$5);
                  ja $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jf.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aY = $$5.b().o() == jf.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aqn $$8 : $$0.a(aqn.class, $$6.cL().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dgb.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dcf $$0, ja $$1, cuc $$2) {
      return $$2.a(cuf.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqd.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsp y() {
      if (h == null) {
         h = dsq.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avw.aF)).a('^', dso.a(dst.a(dfj.gG).or(dst.a(dfj.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsp z() {
      if (i == null) {
         i = dsq.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avw.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
