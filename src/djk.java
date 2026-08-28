import com.mojang.serialization.MapCodec;

public class djk extends dnr {
   public static final MapCodec<djk> a = b(djk::new);

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dvi.d $$0) {
      super(0.3125F, $$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dvj a(czs $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dvj a(deg $$0, jh $$1, dvj $$2) {
      dvj $$3 = $$0.a_($$1.e());
      dvj $$4 = $$0.a_($$1.d());
      dvj $$5 = $$0.a_($$1.f());
      dvj $$6 = $$0.a_($$1.i());
      dvj $$7 = $$0.a_($$1.g());
      dvj $$8 = $$0.a_($$1.h());
      die $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dig.kv) || $$3.a(dig.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dig.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dig.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dig.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dig.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dig.kv)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dig.kv) || $$1 == jm.a && $$2.a(dig.fz);
         return $$0.b(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$2.a($$5);
         dvj $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dvj $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dig.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dig.fz);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
