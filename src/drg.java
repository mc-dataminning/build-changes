import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drg extends dop {
   public static final MapCodec<drg> b = b(drg::new);
   @Nullable
   private static dux h;
   @Nullable
   private static dux i;

   @Override
   public MapCodec<drg> a() {
      return b;
   }

   protected drg(dur.d $$0) {
      super(dop.b.d, $$0);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, @Nullable bun $$3, cvs $$4) {
      a($$0, $$1);
   }

   public static void a(dej $$0, jf $$1) {
      if ($$0.c_($$1) instanceof dtj $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dej $$0, jf $$1, dtj $$2) {
      if (!$$0.B) {
         dus $$3 = $$2.m();
         boolean $$4 = $$3.a(dho.gG) || $$3.a(dho.gH);
         if ($$4 && $$1.v() >= $$0.H_() && $$0.am() != brp.a) {
            dux.b $$5 = y().a($$0, $$1);
            if ($$5 != null) {
               cju $$6 = bty.bp.a($$0, btx.k);
               if ($$6 != null) {
                  dig.a($$0, $$5);
                  jf $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jk.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aT = $$5.b().o() == jk.a.a ? 0.0F : 90.0F;
                  $$6.q();

                  for (ark $$8 : $$0.a(ark.class, $$6.cO().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dig.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dej $$0, jf $$1, cvs $$2) {
      return $$2.a(cvw.uo) && $$1.v() >= $$0.H_() + 2 && $$0.am() != brp.a && !$$0.B ? z().a($$0, $$1) != null : false;
   }

   private static dux y() {
      if (h == null) {
         h = duy.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awv.aG)).a('^', duw.a(dvb.a(dho.gG).or(dvb.a(dho.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dux z() {
      if (i == null) {
         i = duy.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awv.aG)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
