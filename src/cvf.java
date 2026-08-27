public class cvf extends cud {
   private final ehw[] i;

   public cvf(dey.d $$0) {
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
   public ehw f(dez $$0, cor $$1, gu $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public ehw b(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   public boolean a(dez $$0, boolean $$1, ha $$2) {
      csl $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cvg && cvg.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dez $$0) {
      return $$0.a(apl.S) && $$0.a(apl.k) == this.n().a(apl.k);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         cix $$6 = $$3.b($$4);
         return $$6.a(cja.tQ) ? bgq.a : bgq.d;
      } else {
         return cjc.a($$3, $$1, $$2);
      }
   }

   @Override
   public dez a(clf $$0) {
      cor $$1 = $$0.q();
      gu $$2 = $$0.a();
      eac $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.h();
      gu $$6 = $$2.f();
      gu $$7 = $$2.g();
      dez $$8 = $$1.a_($$4);
      dez $$9 = $$1.a_($$5);
      dez $$10 = $$1.a_($$6);
      dez $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d), ha.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.e), ha.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.c), ha.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.f), ha.f)))
         .a(e, Boolean.valueOf($$3.a() == ead.c));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1.o().e() == ha.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
