import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmj extends die implements dpf {
   public static final MapCodec<dmj> a = b(dmj::new);
   public static final dwd b = dlz.aF;
   public static final dwa c = dvz.C;
   protected static final float d = 3.0F;
   protected static final fah e = die.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fah f = die.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fah g = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fah h = die.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   protected dmj(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      switch ((jm)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(deg $$0, jh $$1, jm $$2) {
      dvj $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dig.a.m();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      if (!$$0.c()) {
         dvj $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dvj $$2 = this.m();
      dfe $$3 = $$0.q();
      jh $$4 = $$0.a();
      erk $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == erl.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }
}
