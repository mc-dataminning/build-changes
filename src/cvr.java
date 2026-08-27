public class cvr extends cup {
   private final eii[] i;

   public cvr(dfk.d $$0) {
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
   public eii f(dfl $$0, cpd $$1, gw $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public eii b(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   public boolean a(dfl $$0, boolean $$1, hc $$2) {
      csx $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cvs && cvs.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dfl $$0) {
      return $$0.a(apu.S) && $$0.a(apu.k) == this.n().a(apu.k);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         cjh $$6 = $$3.b($$4);
         return $$6.a(cjk.tQ) ? bha.a : bha.d;
      } else {
         return cjm.a($$3, $$1, $$2);
      }
   }

   @Override
   public dfl a(clp $$0) {
      cpd $$1 = $$0.q();
      gw $$2 = $$0.a();
      eao $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      dfl $$8 = $$1.a_($$4);
      dfl $$9 = $$1.a_($$5);
      dfl $$10 = $$1.a_($$6);
      dfl $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hc.d), hc.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hc.e), hc.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hc.c), hc.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hc.f), hc.f)))
         .a(e, Boolean.valueOf($$3.a() == eap.c));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1.o().e() == hc.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
