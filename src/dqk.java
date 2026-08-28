import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqk extends dkm implements dmu {
   public static final MapCodec<dqk> c = b(dqk::new);
   public static final dwh<dwf> d = dkm.b;
   protected static final float e = 6.0F;
   protected static final fah f = die.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dqk> a() {
      return c;
   }

   public dqk(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return f;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dig.kJ);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(dig.bw);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = super.a($$0);
      if ($$1 != null) {
         erk $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axg.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      if ($$0.c(d) == dwf.a) {
         dvj $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dwf.b;
      } else {
         erk $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axg.a) && $$4.e() == 8;
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return erl.c.a(false);
   }

   @Override
   public boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return false;
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      return false;
   }
}
