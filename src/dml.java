import com.mojang.serialization.MapCodec;

public class dml extends dlj {
   public static final MapCodec<dml> i = b(dml::new);
   private final fbu[] j;

   @Override
   public MapCodec<dml> a() {
      return i;
   }

   public dml(dww.d $$0) {
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
   protected fbu d_(dwx $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fbu c(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   public boolean a(dwx $$0, boolean $$1, jn $$2) {
      djm $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dmm && dmm.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dwx $$0) {
      return $$0.a(awp.U) && $$0.a(awp.l) == this.m().a(awp.l);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      return (bsk)(!$$1.B_() ? cwz.a($$3, $$1, $$2) : bsk.e);
   }

   @Override
   public dwx a(dag $$0) {
      dfn $$1 = $$0.q();
      ji $$2 = $$0.a();
      esz $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      dwx $$8 = $$1.a_($$4);
      dwx $$9 = $$1.a_($$5);
      dwx $$10 = $$1.a_($$6);
      dwx $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jn.d), jn.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jn.e), jn.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jn.c), jn.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jn.f), jn.f)))
         .b(e, Boolean.valueOf($$3.a() == eta.c));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
