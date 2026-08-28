import java.util.List;

public class cum extends cwb {
   private final cqq.b a;
   private final boolean b;

   public cum(boolean $$0, cqq.b $$1, cwb.a $$2) {
      super($$2);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      ezp $$4 = a($$0, $$1, den.b.c);
      if ($$4.d() == ezp.a.a) {
         return bsh.e;
      } else {
         ezr $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bui> $$7 = $$0.a($$1, $$1.cT().b($$5.c(5.0)).g(1.0), bun.h);
         if (!$$7.isEmpty()) {
            ezr $$8 = $$1.bH();

            for (bui $$9 : $$7) {
               ezm $$10 = $$9.cT().g((double)$$9.bU());
               if ($$10.d($$8)) {
                  return bsh.e;
               }
            }
         }

         if ($$4.d() == ezp.a.b) {
            cqq $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.a);
            $$11.v($$1.dO());
            if (!$$0.a($$11, $$11.cT())) {
               return bsh.d;
            } else {
               if (!$$0.C) {
                  $$0.b($$11);
                  $$0.a($$1, eak.t, $$4.g());
                  $$3.a(1, $$1);
               }

               $$1.b(awy.c.b(this));
               return bsh.a;
            }
         } else {
            return bsh.e;
         }
      }
   }

   private cqq a(dff $$0, ezp $$1, cwf $$2, cor $$3) {
      ezr $$4 = $$1.g();
      cqq $$5 = (cqq)(this.b ? new cqr($$0, $$4.d, $$4.e, $$4.f) : new cqq($$0, $$4.d, $$4.e, $$4.f));
      if ($$0 instanceof arq $$6) {
         bup.<cqq>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
