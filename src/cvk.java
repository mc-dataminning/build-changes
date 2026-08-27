public class cvk extends cui {
   private final eib[] i;

   public cvk(dfd.d $$0) {
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
   public eib f(dfe $$0, cow $$1, gw $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public eib b(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   public boolean a(dfe $$0, boolean $$1, hc $$2) {
      csq $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cvl && cvl.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dfe $$0) {
      return $$0.a(apo.S) && $$0.a(apo.k) == this.n().a(apo.k);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         cja $$6 = $$3.b($$4);
         return $$6.a(cjd.tQ) ? bgt.a : bgt.d;
      } else {
         return cjf.a($$3, $$1, $$2);
      }
   }

   @Override
   public dfe a(cli $$0) {
      cow $$1 = $$0.q();
      gw $$2 = $$0.a();
      eah $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      dfe $$8 = $$1.a_($$4);
      dfe $$9 = $$1.a_($$5);
      dfe $$10 = $$1.a_($$6);
      dfe $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hc.d), hc.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hc.e), hc.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hc.c), hc.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hc.f), hc.f)))
         .a(e, Boolean.valueOf($$3.a() == eai.c));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1.o().e() == hc.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
