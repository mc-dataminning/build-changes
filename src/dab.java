public class dab extends czj {
   private final bwr<? extends ctz> a;

   public dab(bwr<? extends ctz> $$0, czj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      if (!$$3.a(axc.P)) {
         return bug.d;
      } else {
         czn $$4 = $$0.n();
         ebx $$5 = $$3.b() instanceof dmg ? $$3.c(((dmg)$$3.b()).c()) : ebx.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ffc $$7 = new ffc((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         ctz $$8 = ctz.a($$1, $$7.d, $$7.e, $$7.f, this.a, bwq.o, $$4, $$0.o());
         if ($$8 == null) {
            return bug.d;
         } else {
            if (ctz.b($$1)) {
               for (bwi $$10 : $$1.a_(null, $$8.cQ())) {
                  if ($$10 instanceof ctz) {
                     return bug.d;
                  }
               }
            }

            if ($$1 instanceof arq $$11) {
               $$11.b($$8);
               $$11.a(eft.t, $$2, eft.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bug.a;
         }
      }
   }
}
