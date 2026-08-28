import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends die implements dpf {
   public static final MapCodec<dlu> a = b(dlu::new);
   private static final dwa c = dvz.C;
   protected static final fah b = die.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   protected dlu(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = super.a($$0);
      if ($$1 != null) {
         erk $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == erl.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.d();
      dvj $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jm.a);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.b && !this.a($$0, $$3, $$4)) {
         return dig.a.m();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
