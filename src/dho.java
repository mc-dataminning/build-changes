import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dho extends die implements dpf {
   public static final dwa d = dvz.C;
   private static final fah a = die.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dho(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dho> a();

   protected void a(dvj $$0, dfc $$1, jh $$2) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean d(dvj $$0, deg $$1, jh $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$1.b_($$2.a($$3)).a(axg.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(axg.a) && $$1.e() == 8));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return a;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1 == jm.a && !this.a($$0, (dfe)$$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(d);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(d) ? erl.c.a(false) : super.b_($$0);
   }
}
