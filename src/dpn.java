import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpn extends die {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final int b = 8;
   public static final dwj c = dvz.aF;
   protected static final fah[] d = new fah[]{
      fae.a(),
      die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   protected dpn(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fah c(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected float c(dvj $$0, deg $$1, jh $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.e());
      if ($$3.a(axa.cq)) {
         return false;
      } else {
         return $$3.a(axa.cr) ? true : die.a($$3.g($$1, $$2.e()), jm.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.a(dfk.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jm.b : true;
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }
}
