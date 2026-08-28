import com.mojang.serialization.MapCodec;

public class dme extends dka {
   public static final MapCodec<dme> i = b(dme::new);

   @Override
   public MapCodec<? extends dme> a() {
      return i;
   }

   protected dme(dvi.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dvj a(czs $$0) {
      deg $$1 = $$0.q();
      jh $$2 = $$0.a();
      erk $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.g();
      jh $$6 = $$2.h();
      jh $$7 = $$2.i();
      dvj $$8 = $$1.a_($$4);
      dvj $$9 = $$1.a_($$5);
      dvj $$10 = $$1.a_($$6);
      dvj $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.e))))
         .b(e, Boolean.valueOf($$3.a() == erl.c));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fah c(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.a();
   }

   @Override
   protected boolean b(dvj $$0, dvj $$1, jm $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.b($$0, $$1, $$2);
   }

   public final boolean a(dvj $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dme || $$0.a(axa.M);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
