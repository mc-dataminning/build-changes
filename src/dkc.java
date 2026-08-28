import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkc extends dhq {
   public static final MapCodec<dkc> a = b(dkc::new);
   public static final dwj b = dvz.aT;
   public static final dwa c = dvz.p;
   protected static final fah d = die.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d;
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dvj $$0, dfb $$1, jh $$2) {
      int $$3 = $$1.a(dfk.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azk.b($$4));
      }

      $$3 = azk.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$3.gw()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dvj $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eag.c, $$2, eag.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsd.a;
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return !$$0.C && $$0.D_().g() ? a($$2, dso.q, dkc::a) : null;
   }

   private static void a(dfb $$0, jh $$1, dvj $$2, dtb $$3) {
      if ($$0.aa() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }
}
