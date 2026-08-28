import com.mojang.serialization.MapCodec;

public class dlb extends dka {
   public static final MapCodec<dlb> i = b(dlb::new);
   private final fah[] j;

   @Override
   public MapCodec<dlb> a() {
      return i;
   }

   public dlb(dvi.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected fah d_(dvj $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fah c(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   public boolean a(dvj $$0, boolean $$1, jm $$2) {
      die $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dlc && dlc.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dvj $$0) {
      return $$0.a(axa.T) && $$0.a(axa.l) == this.m().a(axa.l);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      return (bsd)(!$$1.y_() ? cwl.a($$3, $$1, $$2) : bsd.e);
   }

   @Override
   public dvj a(czs $$0) {
      deg $$1 = $$0.q();
      jh $$2 = $$0.a();
      erk $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      dvj $$8 = $$1.a_($$4);
      dvj $$9 = $$1.a_($$5);
      dvj $$10 = $$1.a_($$6);
      dvj $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d), jm.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.e), jm.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.c), jm.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.f), jm.f)))
         .b(e, Boolean.valueOf($$3.a() == erl.c));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1.o().e() == jm.c.a ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
