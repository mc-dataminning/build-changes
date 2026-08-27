import java.util.List;
import java.util.function.Predicate;

public class cmt extends cou {
   private static final Predicate<bno> a = bnt.f.and(bno::bt);
   private final cjc.b b;
   private final boolean c;

   public cmt(boolean $$0, cjc.b $$1, cou.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      enq $$4 = a($$0, $$1, cuw.b.c);
      if ($$4.c() == enq.a.a) {
         return blv.c($$3);
      } else {
         ens $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bno> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ens $$8 = $$1.br();

            for (bno $$9 : $$7) {
               enn $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return blv.c($$3);
               }
            }
         }

         if ($$4.c() == enq.a.b) {
            cjc $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return blv.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dpp.t, $$4.e());
                  if (!$$1.fU().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(atu.c.b(this));
               return blv.a($$3, $$0.y_());
            }
         } else {
            return blv.c($$3);
         }
      }
   }

   private cjc a(cvn $$0, enq $$1, coz $$2, chh $$3) {
      ens $$4 = $$1.e();
      cjc $$5 = (cjc)(this.c ? new cjd($$0, $$4.c, $$4.d, $$4.e) : new cjc($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aov $$6) {
         bnu.<cjc>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
