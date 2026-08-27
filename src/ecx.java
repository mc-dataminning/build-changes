import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ecx extends eca<eer> {
   public ecx(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      ayt $$3 = $$0.d();
      if ($$2.a(dyu.a.a, $$1).v() <= $$1.v() + 2) {
         return false;
      } else if (!this.b($$2, $$1)) {
         return false;
      } else {
         iw $$4 = iw.b($$3.a(4));
         ir.a $$5 = new ir.a();
         $$2.a($$1.d(), dfe.lC.n(), 2);
         int $$6 = $$3.b(6, 12);
         List<ir> $$7 = new ArrayList<>();

         for (int $$8 = 0; $$8 < 2; $$8++) {
            $$5.g($$1);
            float $$9 = 1.0F;
            int $$10 = 0;
            $$4 = $$4.g();

            while ($$3.i() < $$9) {
               if (++$$10 > 2) {
                  break;
               }

               $$5.d($$4);
               if (!this.b($$2, $$5)) {
                  break;
               }

               $$9 *= 0.8F;
               Function<ir, dtc> $$11 = $$1x -> {
                  $$7.add($$1x.i());
                  return dfe.a.n();
               };
               Function<ir, dtc> $$12 = $$0x -> dfe.lC.n();
               this.a($$2, $$3, $$5, $$4.h(), $$12, $$11, $$6);
               iw $$13 = $$4.i();
               this.a($$2, $$3, $$5.a($$13), $$13, $$12, $$11, $$6);
            }

            if ($$3.a(2) == 0) {
               $$5.d($$4);
               if (this.b($$2, $$5)) {
                  Function<ir, dtc> $$14 = $$3x -> {
                     $$7.add($$3x.i());
                     if ($$3.a(10) == 0) {
                        $$2.a($$3x.c(), dfe.pd.n(), 3);
                     }

                     return dfe.pP.n();
                  };
                  this.a($$2, $$3, $$5, $$4.h(), $$0x -> dfe.k.n(), $$14, $$6);
                  iw $$15 = $$4.i();
                  this.a($$2, $$3, $$5.a($$15), $$15, $$0x -> dfe.k.n(), $$14, $$6);
               }
            }
         }

         for (ir $$16 : $$7) {
            $$2.y($$16).e($$16);
         }

         iw $$17 = $$4.i();
         this.a($$2, $$3, $$1.a($$17), $$17, $$0x -> dfe.lC.n(), $$0x -> dfe.a.n(), $$6);
         $$17 = $$17.g();
         this.a($$2, $$3, $$1.a($$17), $$17, $$0x -> dfe.lC.n(), $$0x -> dfe.a.n(), $$6);
         return false;
      }
   }

   private void a(dcv $$0, ayt $$1, ir $$2, iw $$3, Function<ir, dtc> $$4, Function<ir, dtc> $$5, int $$6) {
      ir.a $$7 = new ir.a($$2);
      int $$8 = $$6 + $$1.a(3);

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         if (!this.b($$0, $$7)) {
            $$7.d(iw.b);
            if (!this.b($$0, $$7)) {
               $$7.c(iw.a, 2);
               if (!this.b($$0, $$7)) {
                  break;
               }
            }
         }

         $$0.a($$7.d(), $$4.apply($$7.d()), 3);
         $$0.a($$7, $$5.apply($$7), 3);
         $$7.d($$3);
      }
   }

   private boolean b(dcv $$0, ir $$1) {
      return ($$0.u($$1) || $$0.a_($$1).a(dfe.pP)) && $$0.a_($$1.d()).a(dfe.k);
   }
}
