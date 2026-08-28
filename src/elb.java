import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class elb extends ekk<emw> {
   private static final Logger a = LogUtils.getLogger();
   private static final bxc<?>[] b = new bxc[]{bxc.bg, bxc.bP, bxc.bP, bxc.bp};
   private static final ebe c = dne.nI.m();

   public elb(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      Predicate<ebe> $$1 = ekk.a(axe.bS);
      iv $$2 = $$0.e();
      azx $$3 = $$0.d();
      dkw $$4 = $$0.b();
      int $$5 = 3;
      int $$6 = $$3.a(2) + 2;
      int $$7 = -$$6 - 1;
      int $$8 = $$6 + 1;
      int $$9 = -1;
      int $$10 = 4;
      int $$11 = $$3.a(2) + 2;
      int $$12 = -$$11 - 1;
      int $$13 = $$11 + 1;
      int $$14 = 0;

      for (int $$15 = $$7; $$15 <= $$8; $$15++) {
         for (int $$16 = -1; $$16 <= 4; $$16++) {
            for (int $$17 = $$12; $$17 <= $$13; $$17++) {
               iv $$18 = $$2.b($$15, $$16, $$17);
               boolean $$19 = $$4.a_($$18).e();
               if ($$16 == -1 && !$$19) {
                  return false;
               }

               if ($$16 == 4 && !$$19) {
                  return false;
               }

               if (($$15 == $$7 || $$15 == $$8 || $$17 == $$12 || $$17 == $$13) && $$16 == 0 && $$4.v($$18) && $$4.v($$18.d())) {
                  $$14++;
               }
            }
         }
      }

      if ($$14 >= 1 && $$14 <= 5) {
         for (int $$20 = $$7; $$20 <= $$8; $$20++) {
            for (int $$21 = 3; $$21 >= -1; $$21--) {
               for (int $$22 = $$12; $$22 <= $$13; $$22++) {
                  iv $$23 = $$2.b($$20, $$21, $$22);
                  ebe $$24 = $$4.a_($$23);
                  if ($$20 == $$7 || $$21 == -1 || $$22 == $$12 || $$20 == $$8 || $$21 == 4 || $$22 == $$13) {
                     if ($$23.v() >= $$4.K_() && !$$4.a_($$23.e()).e()) {
                        $$4.a($$23, c, 2);
                     } else if ($$24.e() && !$$24.a(dne.cG)) {
                        if ($$21 == -1 && $$3.a(4) != 0) {
                           this.a($$4, $$23, dne.cx.m(), $$1);
                        } else {
                           this.a($$4, $$23, dne.m.m(), $$1);
                        }
                     }
                  } else if (!$$24.a(dne.cG) && !$$24.a(dne.cD)) {
                     this.a($$4, $$23, c, $$1);
                  }
               }
            }
         }

         for (int $$25 = 0; $$25 < 2; $$25++) {
            for (int $$26 = 0; $$26 < 3; $$26++) {
               int $$27 = $$2.u() + $$3.a($$6 * 2 + 1) - $$6;
               int $$28 = $$2.v();
               int $$29 = $$2.w() + $$3.a($$11 * 2 + 1) - $$11;
               iv $$30 = new iv($$27, $$28, $$29);
               if ($$4.v($$30)) {
                  int $$31 = 0;

                  for (jb $$32 : jb.c.a) {
                     if ($$4.a_($$30.a($$32)).e()) {
                        $$31++;
                     }
                  }

                  if ($$31 == 1) {
                     this.a($$4, $$30, esf.a($$4, $$30, dne.cG.m()), $$1);
                     bux.a($$4, $$3, $$30, fad.c);
                     break;
                  }
               }
            }
         }

         this.a($$4, $$2, dne.cD.m(), $$1);
         if ($$4.c_($$2) instanceof dzu $$34) {
            $$34.a(this.a($$3), $$3);
         } else {
            a.error("Failed to fetch mob spawner entity at ({}, {}, {})", new Object[]{$$2.u(), $$2.v(), $$2.w()});
         }

         return true;
      } else {
         return false;
      }
   }

   private bxc<?> a(azx $$0) {
      return ag.a(b, $$0);
   }
}
