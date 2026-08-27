public class cua extends ctl {
   private static final ki a = new kh() {
      private final kh c = new kh();

      @Override
      public ctq a(kf $$0, ctq $$1) {
         it $$2 = $$0.d().c(dgf.b);
         aqn $$3 = $$0.b();
         eum $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         io $$8 = $$0.c().a($$2);
         drd $$9 = $$3.a_($$8);
         dsh $$10 = $$9.b() instanceof ddp ? $$9.c(((ddp)$$9.b()).c()) : dsh.a;
         double $$11;
         if ($$9.a(avx.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avx.N)) {
               return this.c.dispense($$0, $$1);
            }

            drd $$13 = $$3.a_($$8.d());
            dsh $$14 = $$13.b() instanceof ddp ? $$13.c(((ddp)$$13.b()).c()) : dsh.a;
            if ($$2 != it.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cnt $$18 = cnt.a($$3, $$5, $$6 + $$11, $$7, ((cua)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kf $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cnt.a b;

   public cua(cnt.a $$0, ctl.a $$1) {
      super($$1);
      this.b = $$0;
      dgf.a(this, a);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if (!$$3.a(avx.N)) {
         return bpw.e;
      } else {
         ctq $$4 = $$0.n();
         if ($$1 instanceof aqn $$5) {
            dsh $$6 = $$3.b() instanceof ddp ? $$3.c(((ddp)$$3.b()).c()) : dsh.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cnt $$8 = cnt.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dvw.t, $$2, dvw.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bpw.a($$1.B);
      }
   }
}
