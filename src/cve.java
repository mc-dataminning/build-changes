public class cve extends cuc {
   private final ehy[] i;

   public cve(dex.d $$0) {
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
   public ehy f(dey $$0, coq $$1, gv $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public ehy b(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   public boolean a(dey $$0, boolean $$1, hb $$2) {
      csk $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cvf && cvf.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dey $$0) {
      return $$0.a(apj.S) && $$0.a(apj.k) == this.n().a(apj.k);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         ciw $$6 = $$3.b($$4);
         return $$6.a(ciz.tQ) ? bgo.a : bgo.d;
      } else {
         return cjb.a($$3, $$1, $$2);
      }
   }

   @Override
   public dey a(cle $$0) {
      coq $$1 = $$0.q();
      gv $$2 = $$0.a();
      eab $$3 = $$0.q().b_($$0.a());
      gv $$4 = $$2.e();
      gv $$5 = $$2.h();
      gv $$6 = $$2.f();
      gv $$7 = $$2.g();
      dey $$8 = $$1.a_($$4);
      dey $$9 = $$1.a_($$5);
      dey $$10 = $$1.a_($$6);
      dey $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hb.d), hb.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hb.e), hb.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hb.c), hb.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hb.f), hb.f)))
         .a(e, Boolean.valueOf($$3.a() == eac.c));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1.o().e() == hb.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
