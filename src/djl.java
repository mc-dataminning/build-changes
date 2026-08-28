import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dlz implements dih {
   public static final MapCodec<djl> a = b(djl::new);
   public static final int b = 2;
   public static final dwj c = dvz.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fah[] m = new fah[]{
      die.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), die.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), die.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fah[] n = new fah[]{
      die.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), die.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), die.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fah[] o = new fah[]{
      die.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), die.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), die.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fah[] G = new fah[]{
      die.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), die.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), die.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   public djl(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(axa.A);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      int $$4 = $$0.c(c);
      switch ((jm)$$0.c(aF)) {
         case d:
            return G[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = this.m();
      dfe $$2 = $$0.q();
      jh $$3 = $$0.a();

      for (jm $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(aF, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == $$0.c(aF) && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
