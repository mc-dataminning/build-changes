import com.mojang.serialization.MapCodec;

public class dlg extends dkf {
   public static final MapCodec<dlg> i = b(dlg::new);
   private final fal[] j;

   @Override
   public MapCodec<dlg> a() {
      return i;
   }

   public dlg(dvn.d $$0) {
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
   protected fal d_(dvo $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fal c(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   public boolean a(dvo $$0, boolean $$1, jm $$2) {
      dij $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dlh && dlh.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dvo $$0) {
      return $$0.a(axd.T) && $$0.a(axd.l) == this.m().a(axd.l);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      return (bsh)(!$$1.y_() ? cwp.a($$3, $$1, $$2) : bsh.e);
   }

   @Override
   public dvo a(czw $$0) {
      dek $$1 = $$0.q();
      jh $$2 = $$0.a();
      ero $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      dvo $$8 = $$1.a_($$4);
      dvo $$9 = $$1.a_($$5);
      dvo $$10 = $$1.a_($$6);
      dvo $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d), jm.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.e), jm.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.c), jm.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.f), jm.f)))
         .b(e, Boolean.valueOf($$3.a() == erp.c));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return $$4.o().e() == jm.c.a
         ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g())))
         : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
