import com.mojang.serialization.MapCodec;

public class dmm extends dlk {
   public static final MapCodec<dmm> i = b(dmm::new);
   private final fbv[] j;

   @Override
   public MapCodec<dmm> a() {
      return i;
   }

   public dmm(dwx.d $$0) {
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
   protected fbv d_(dwy $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fbv c(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   public boolean a(dwy $$0, boolean $$1, jn $$2) {
      djn $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dmn && dmn.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dwy $$0) {
      return $$0.a(awp.U) && $$0.a(awp.l) == this.m().a(awp.l);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      return (bsl)(!$$1.B_() ? cxa.a($$3, $$1, $$2) : bsl.e);
   }

   @Override
   public dwy a(dah $$0) {
      dfo $$1 = $$0.q();
      ji $$2 = $$0.a();
      eta $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      dwy $$8 = $$1.a_($$4);
      dwy $$9 = $$1.a_($$5);
      dwy $$10 = $$1.a_($$6);
      dwy $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jn.d), jn.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jn.e), jn.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jn.c), jn.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jn.f), jn.f)))
         .b(e, Boolean.valueOf($$3.a() == etb.c));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
