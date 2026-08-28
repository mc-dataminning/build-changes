import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends die implements dpf {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dwa b = dvz.j;
   public static final dwa c = dvz.C;
   protected static final fah d = fae.a(die.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), die.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fah e = fae.a(die.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), die.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dvj $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dfe)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == erl.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return die.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dvj $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return o($$0).g() == $$1 && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
