import java.util.List;
import java.util.function.Predicate;

public class crn extends ctj {
   private static final Predicate<bru> a = brz.f.and(bru::bz);
   private final cnt.b b;
   private final boolean c;

   public crn(boolean $$0, cnt.b $$1, ctj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      eui $$4 = a($$0, $$1, dag.b.c);
      if ($$4.c() == eui.a.a) {
         return bpv.c($$3);
      } else {
         euk $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bru> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            euk $$8 = $$1.bx();

            for (bru $$9 : $$7) {
               euf $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bpv.c($$3);
               }
            }
         }

         if ($$4.c() == eui.a.b) {
            cnt $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bpv.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dvu.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avr.c.b(this));
               return bpv.a($$3, $$0.x_());
            }
         } else {
            return bpv.c($$3);
         }
      }
   }

   private cnt a(dax $$0, eui $$1, cto $$2, clw $$3) {
      euk $$4 = $$1.e();
      cnt $$5 = (cnt)(this.c ? new cnu($$0, $$4.c, $$4.d, $$4.e) : new cnt($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqm $$6) {
         bsa.<cnt>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
