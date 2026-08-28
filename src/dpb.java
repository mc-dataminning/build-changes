import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpb extends dmk {
   public static final MapCodec<dpb> b = b(dpb::new);
   @Nullable
   private static dsq h;
   @Nullable
   private static dsq i;

   @Override
   public MapCodec<dpb> a() {
      return b;
   }

   protected dpb(dsk.d $$0) {
      super(dmk.b.d, $$0);
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, @Nullable btc $$3, cud $$4) {
      a($$0, $$1);
   }

   public static void a(dcg $$0, ja $$1) {
      if ($$0.c_($$1) instanceof drd $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dcg $$0, ja $$1, drd $$2) {
      if (!$$0.B) {
         dsl $$3 = $$2.n();
         boolean $$4 = $$3.a(dfk.gG) || $$3.a(dfk.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.al() != bqe.a) {
            dsq.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cii $$6 = bsn.bp.a($$0);
               if ($$6 != null) {
                  dgc.a($$0, $$5);
                  ja $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jf.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aZ = $$5.b().o() == jf.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aqn $$8 : $$0.a(aqn.class, $$6.cM().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dgc.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dcg $$0, ja $$1, cud $$2) {
      return $$2.a(cug.um) && $$1.v() >= $$0.I_() + 2 && $$0.al() != bqe.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dsq y() {
      if (h == null) {
         h = dsr.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avw.aF)).a('^', dsp.a(dsu.a(dfk.gG).or(dsu.a(dfk.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dsq z() {
      if (i == null) {
         i = dsr.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avw.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
