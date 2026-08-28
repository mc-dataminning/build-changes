import java.util.List;

public class cud extends cvt {
   private final cqh.b a;
   private final boolean b;

   public cud(boolean $$0, cqh.b $$1, cvt.a $$2) {
      super($$2);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      ezf $$4 = a($$0, $$1, ded.b.c);
      if ($$4.d() == ezf.a.a) {
         return bry.e;
      } else {
         ezh $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<btz> $$7 = $$0.a($$1, $$1.cS().b($$5.c(5.0)).g(1.0), bue.h);
         if (!$$7.isEmpty()) {
            ezh $$8 = $$1.bG();

            for (btz $$9 : $$7) {
               ezc $$10 = $$9.cS().g((double)$$9.bT());
               if ($$10.d($$8)) {
                  return bry.e;
               }
            }
         }

         if ($$4.d() == ezf.a.b) {
            cqh $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.a);
            $$11.v($$1.dN());
            if (!$$0.a($$11, $$11.cS())) {
               return bry.d;
            } else {
               if (!$$0.C) {
                  $$0.b($$11);
                  $$0.a($$1, eaa.t, $$4.g());
                  $$3.a(1, $$1);
               }

               $$1.b(awu.c.b(this));
               return bry.a;
            }
         } else {
            return bry.e;
         }
      }
   }

   private cqh a(dev $$0, ezf $$1, cvx $$2, coh $$3) {
      ezh $$4 = $$1.g();
      cqh $$5 = (cqh)(this.b ? new cqi($$0, $$4.d, $$4.e, $$4.f) : new cqh($$0, $$4.d, $$4.e, $$4.f));
      if ($$0 instanceof arm $$6) {
         bug.<cqh>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
