import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends die {
   public static final MapCodec<dla> a = b(dla::new);
   public static final dwj b = dvz.aQ;
   protected static final fah c = die.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   protected dla(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dlc || $$3.b() instanceof dvb;
   }

   @Override
   public dvj a(czs $$0) {
      return !this.m().a((dfe)$$0.q(), $$0.a()) ? dig.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      int $$4 = $$0.c(b);
      if (!a((dfe)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((deg)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      if (!$$0.C && $$0.A.i() < $$4 - 0.5F && $$3 instanceof bva && ($$3 instanceof com || $$0.ac().b(dex.c)) && $$3.ds() * $$3.ds() * $$3.dt() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bue $$0, dvj $$1, dfb $$2, jh $$3) {
      dvj $$4 = a($$1, dig.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eag.c, $$3, eag.a.a($$0, $$4));
   }

   private static boolean a(deg $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axa.cz);
   }

   private static boolean a(dfe $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axg.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
