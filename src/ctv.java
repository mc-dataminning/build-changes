import java.util.List;

public class ctv extends cvn {
   private final cpx.b a;
   private final boolean b;

   public ctv(boolean $$0, cpx.b $$1, cvn.a $$2) {
      super($$2);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      eyu $$4 = a($$0, $$1, ddr.b.c);
      if ($$4.d() == eyu.a.a) {
         return brs.e;
      } else {
         eyw $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<btr> $$7 = $$0.a($$1, $$1.cO().b($$5.c(5.0)).g(1.0), btw.h);
         if (!$$7.isEmpty()) {
            eyw $$8 = $$1.bC();

            for (btr $$9 : $$7) {
               eyr $$10 = $$9.cO().g((double)$$9.bP());
               if ($$10.d($$8)) {
                  return brs.e;
               }
            }
         }

         if ($$4.d() == eyu.a.b) {
            cpx $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.a);
            $$11.v($$1.dI());
            if (!$$0.a($$11, $$11.cO())) {
               return brs.d;
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dzp.t, $$4.g());
                  $$3.a(1, $$1);
               }

               $$1.b(awq.c.b(this));
               return brs.a;
            }
         } else {
            return brs.e;
         }
      }
   }

   private cpx a(dej $$0, eyu $$1, cvs $$2, cnx $$3) {
      eyw $$4 = $$1.g();
      cpx $$5 = (cpx)(this.b ? new cpy($$0, $$4.d, $$4.e, $$4.f) : new cpx($$0, $$4.d, $$4.e, $$4.f));
      if ($$0 instanceof arj $$6) {
         bty.<cpx>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
