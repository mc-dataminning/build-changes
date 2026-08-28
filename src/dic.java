import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dic extends dlz implements dih, dpf {
   public static final MapCodec<dic> a = b(dic::new);
   private static final dwa f = dvz.C;
   private static final int g = 6;
   protected static final fah b = die.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fah c = die.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fah d = die.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fah e = die.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      switch ((jm)$$0.c(aF)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(f) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvj $$4 = $$1.a_($$3);
      dvj $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axa.bz)) && ($$5.a(this) || $$5.a(dig.sD));
   }

   protected static boolean a(dfc $$0, jh $$1, erk $$2, jm $$3) {
      dvj $$4 = dig.sE.m().b(f, Boolean.valueOf($$2.a(erl.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (($$1 == jm.a || $$1 == jm.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dig.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dvj $$5 = $$0.a_($$4);
         return dib.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dig.sD);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dib.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(dig.sD);
   }
}
