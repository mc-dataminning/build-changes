import java.util.List;

public class cui extends cvx {
   private final cqm.b a;
   private final boolean b;

   public cui(boolean $$0, cqm.b $$1, cvx.a $$2) {
      super($$2);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      ezl $$4 = a($$0, $$1, dej.b.c);
      if ($$4.d() == ezl.a.a) {
         return bsd.e;
      } else {
         ezn $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bue> $$7 = $$0.a($$1, $$1.cS().b($$5.c(5.0)).g(1.0), buj.h);
         if (!$$7.isEmpty()) {
            ezn $$8 = $$1.bG();

            for (bue $$9 : $$7) {
               ezi $$10 = $$9.cS().g((double)$$9.bT());
               if ($$10.d($$8)) {
                  return bsd.e;
               }
            }
         }

         if ($$4.d() == ezl.a.b) {
            cqm $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.a);
            $$11.v($$1.dN());
            if (!$$0.a($$11, $$11.cS())) {
               return bsd.d;
            } else {
               if (!$$0.C) {
                  $$0.b($$11);
                  $$0.a($$1, eag.t, $$4.g());
                  $$3.a(1, $$1);
               }

               $$1.b(awv.c.b(this));
               return bsd.a;
            }
         } else {
            return bsd.e;
         }
      }
   }

   private cqm a(dfb $$0, ezl $$1, cwb $$2, com $$3) {
      ezn $$4 = $$1.g();
      cqm $$5 = (cqm)(this.b ? new cqn($$0, $$4.d, $$4.e, $$4.f) : new cqm($$0, $$4.d, $$4.e, $$4.f));
      if ($$0 instanceof arn $$6) {
         bul.<cqm>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
