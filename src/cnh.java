public class cnh extends cmt {
   private static final jj a = new ji() {
      private final ji c = new ji();

      @Override
      public cmy a(jg $$0, cmy $$1) {
         ic $$2 = $$0.d().c(cyv.b);
         and $$3 = $$0.b();
         elt $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hx $$8 = $$0.c().a($$2);
         djh $$9 = $$3.a_($$8);
         dkl $$10 = $$9.b() instanceof cwf ? $$9.c(((cwf)$$9.b()).c()) : dkl.a;
         double $$11;
         if ($$9.a(ash.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(ash.N)) {
               return this.c.dispense($$0, $$1);
            }

            djh $$13 = $$3.a_($$8.d());
            dkl $$14 = $$13.b() instanceof cwf ? $$13.c(((cwf)$$13.b()).c()) : dkl.a;
            if ($$2 != ic.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cha $$18 = cha.a($$3, $$5, $$6 + $$11, $$7, ((cnh)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jg $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cha.a b;

   public cnh(cha.a $$0, cmt.a $$1) {
      super($$1);
      this.b = $$0;
      cyv.a(this, a);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if (!$$3.a(ash.N)) {
         return bkb.e;
      } else {
         cmy $$4 = $$0.n();
         if ($$1 instanceof and $$5) {
            dkl $$6 = $$3.b() instanceof cwf ? $$3.c(((cwf)$$3.b()).c()) : dkl.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cha $$8 = cha.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dnr.t, $$2, dnr.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bkb.a($$1.B);
      }
   }
}
