public class cvp extends cun {
   private final eig[] i;

   public cvp(dfi.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.i = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public eig b(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   public boolean a(dfj $$0, boolean $$1, ha $$2) {
      csv $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cvq && cvq.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dfj $$0) {
      return $$0.a(aps.S) && $$0.a(aps.k) == this.n().a(aps.k);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         cjf $$6 = $$3.b($$4);
         return $$6.a(cji.tQ) ? bgy.a : bgy.d;
      } else {
         return cjk.a($$3, $$1, $$2);
      }
   }

   @Override
   public dfj a(cln $$0) {
      cpb $$1 = $$0.q();
      gw $$2 = $$0.a();
      eam $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      dfj $$8 = $$1.a_($$4);
      dfj $$9 = $$1.a_($$5);
      dfj $$10 = $$1.a_($$6);
      dfj $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d), ha.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.e), ha.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.c), ha.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.f), ha.f)))
         .a(e, Boolean.valueOf($$3.a() == ean.c));
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1.o().e() == ha.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
