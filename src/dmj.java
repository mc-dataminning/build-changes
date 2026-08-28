import com.mojang.serialization.MapCodec;

public class dmj extends dlh {
   public static final MapCodec<dmj> i = b(dmj::new);
   private final fbs[] j;

   @Override
   public MapCodec<dmj> a() {
      return i;
   }

   public dmj(dwu.d $$0) {
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
   protected fbs d_(dwv $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   public boolean a(dwv $$0, boolean $$1, jn $$2) {
      djk $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dmk && dmk.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dwv $$0) {
      return $$0.a(awo.U) && $$0.a(awo.l) == this.m().a(awo.l);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      return (bsi)(!$$1.B_() ? cwx.a($$3, $$1, $$2) : bsi.e);
   }

   @Override
   public dwv a(dae $$0) {
      dfl $$1 = $$0.q();
      ji $$2 = $$0.a();
      esx $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      dwv $$8 = $$1.a_($$4);
      dwv $$9 = $$1.a_($$5);
      dwv $$10 = $$1.a_($$6);
      dwv $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jn.d), jn.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jn.e), jn.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jn.c), jn.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jn.f), jn.f)))
         .b(e, Boolean.valueOf($$3.a() == esy.c));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
