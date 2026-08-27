import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class edb extends eca<eer> {
   public edb(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      ayt $$3 = $$0.d();
      if (!this.b($$2, $$1)) {
         return false;
      } else {
         for (iw $$4 : iw.c.a) {
            if (!this.b($$2, $$1.a($$4))) {
               return false;
            }
         }

         double $$5 = $$2.E().l().i().a().g().a(new dyn.e($$1.u(), $$1.v(), $$1.w()));
         iw $$6 = iw.b((int)(($$5 + 1.0) * 5.0));
         ir.a $$7 = new ir.a();
         if ($$3.a(8) == 0) {
            $$2.a($$1.d(), dfe.pP.n().a(dts.C, Boolean.valueOf(true)), 2);
            $$2.a($$1, dfe.pP.n(), 2);
            $$2.a($$1.c(), dfe.pd.n(), 2);
         } else {
            $$2.a($$1.d(), dfe.al.n(), 2);
         }

         $$2.a($$1.c(2), dfe.n.n(), 2);
         ejl $$8 = new ejl($$1.d()).c(4, 1, 4);

         for (int $$9 = 0; $$9 < 2; $$9++) {
            $$7.g($$1);
            float $$10 = 1.0F;
            int $$11 = 0;
            $$6 = $$6.g();

            while ($$3.i() < $$10) {
               if (++$$11 > 6) {
                  break;
               }

               $$7.d($$6);
               if (!this.b($$2, $$7)) {
                  break;
               }

               $$10 *= 0.8F;
               Function<ir, dtc> $$12 = $$1x -> dfe.ho.n().a(dgy.f, Integer.valueOf($$3.a(7)));
               Function<ir, dtc> $$13 = $$1x -> {
                  dtc $$2x = dfe.do.n();
                  return $$8.b($$1x) ? $$2x.a(dic.b, Integer.valueOf(7)) : $$2x;
               };
               this.a($$2, $$3, $$7, $$6.h(), $$13, $$12);
               iw $$14 = $$6.i();
               this.a($$2, $$3, $$7.a($$14), $$14, $$13, $$12);
            }

            if ($$3.a(10) == 0) {
               $$7.d($$6);
               if (!this.b($$2, $$7)) {
                  break;
               }

               List<ir> $$15 = new ArrayList<>();
               Function<ir, dtc> $$16 = $$1x -> {
                  $$15.add($$1x.i());
                  return dfe.pP.n();
               };
               this.a($$2, $$3, $$7, $$6.h(), $$0x -> dfe.k.n(), $$16);
               iw $$17 = $$6.i();
               this.a($$2, $$3, $$7.a($$17), $$17, $$0x -> dfe.k.n(), $$16);

               for (ir $$18 : $$15) {
                  $$2.y($$18).e($$18);
               }
            }
         }

         iw $$19 = $$6.i();
         this.a($$2, $$3, $$1.a($$19), $$19, $$0x -> dfe.lC.n(), $$0x -> dfe.a.n());
         $$19 = $$19.g();
         this.a($$2, $$3, $$1.a($$19), $$19, $$0x -> dfe.lC.n(), $$0x -> dfe.a.n());
         return false;
      }
   }

   private void a(dcv $$0, ayt $$1, ir $$2, iw $$3, Function<ir, dtc> $$4, Function<ir, dtc> $$5) {
      ir.a $$6 = new ir.a($$2);
      int $$7 = $$1.b(3, 15);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         if (!this.b($$0, $$6)) {
            $$6.d(iw.b);
            if (!this.b($$0, $$6)) {
               $$6.c(iw.a, 2);
               if (!this.b($$0, $$6)) {
                  break;
               }
            }
         }

         $$0.a($$6.d(), $$4.apply($$6.d()), 3);
         $$0.a($$6, $$5.apply($$6), 3);
         $$6.d($$3);
      }
   }

   private boolean b(dcv $$0, ir $$1) {
      return $$0.u($$1) && $$0.a_($$1.d()).a(dfe.k);
   }
}
