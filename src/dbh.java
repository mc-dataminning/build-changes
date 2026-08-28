import javax.annotation.Nullable;

public class dbh extends cys {
   public dbh(dno $$0, dag.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public ded b(ded $$0) {
      iw $$1 = $$0.a();
      dkj $$2 = $$0.q();
      ebq $$3 = $$2.a_($$1);
      dno $$4 = this.c();
      if (!$$3.a($$4)) {
         return dul.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jc $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jc.b ? $$0.g() : jc.b;
         }

         int $$7 = 0;
         iw.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               csi $$9 = $$0.o();
               int $$10 = $$2.ao();
               if ($$9 instanceof asc && $$8.v() > $$10) {
                  ((asc)$$9).b(xg.a("build.tooHigh", $$10).a(o.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.c())) {
               if ($$3.a($$0)) {
                  return ded.a($$0, $$8, $$5);
               }
               break;
            }

            $$8.c($$5);
            if ($$5.o().d()) {
               $$7++;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean b() {
      return false;
   }
}
