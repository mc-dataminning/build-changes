public class cks extends cke {
   private static final je a = new jd() {
      private final jd c = new jd();

      @Override
      public ckj a(jb $$0, ckj $$1) {
         hx $$2 = $$0.d().c(cwd.b);
         alq $$3 = $$0.b();
         eif $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ht $$8 = $$0.c().a($$2);
         dgb $$9 = $$3.a_($$8);
         dhf $$10 = $$9.b() instanceof ctp ? $$9.c(((ctp)$$9.b()).c()) : dhf.a;
         double $$11;
         if ($$9.a(aqs.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(aqs.N)) {
               return this.c.dispense($$0, $$1);
            }

            dgb $$13 = $$3.a_($$8.d());
            dhf $$14 = $$13.b() instanceof ctp ? $$13.c(((ctp)$$13.b()).c()) : dhf.a;
            if ($$2 != hx.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         ceo $$18 = ceo.a($$3, $$5, $$6 + $$11, $$7, ((cks)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jb $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final ceo.a b;

   public cks(ceo.a $$0, cke.a $$1) {
      super($$1);
      this.b = $$0;
      cwd.a(this, a);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if (!$$3.a(aqs.N)) {
         return bib.e;
      } else {
         ckj $$4 = $$0.n();
         if ($$1 instanceof alq $$5) {
            dhf $$6 = $$3.b() instanceof ctp ? $$3.c(((ctp)$$3.b()).c()) : dhf.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            ceo $$8 = ceo.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dkl.t, $$2, dkl.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bib.a($$1.B);
      }
   }
}
