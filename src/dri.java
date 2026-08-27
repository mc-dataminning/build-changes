import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class dri extends drc<dth> {
   private static final ia[] a = ia.values();

   public dri(Codec<dth> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dth> $$0) {
      dth $$1 = $$0.f();
      auf $$2 = $$0.d();
      hv $$3 = $$0.e();
      ctt $$4 = $$0.b();
      int $$5 = $$1.l;
      int $$6 = $$1.n;
      List<Pair<hv, Integer>> $$7 = Lists.newLinkedList();
      int $$8 = $$1.j.a($$2);
      dox $$9 = new dox(new dnz($$4.B()));
      edc $$10 = edc.a($$9, -4, 1.0);
      List<hv> $$11 = Lists.newLinkedList();
      double $$12 = (double)$$8 / (double)$$1.i.b();
      dnx $$13 = $$1.d;
      dnv $$14 = $$1.c;
      dnw $$15 = $$1.e;
      double $$16 = 1.0 / Math.sqrt($$13.b);
      double $$17 = 1.0 / Math.sqrt($$13.c + $$12);
      double $$18 = 1.0 / Math.sqrt($$13.d + $$12);
      double $$19 = 1.0 / Math.sqrt($$13.e + $$12);
      double $$20 = 1.0 / Math.sqrt($$15.c + $$2.j() / 2.0 + ($$8 > 3 ? $$12 : 0.0));
      boolean $$21 = (double)$$2.i() < $$15.b;
      int $$22 = 0;

      for (int $$23 = 0; $$23 < $$8; $$23++) {
         int $$24 = $$1.i.a($$2);
         int $$25 = $$1.i.a($$2);
         int $$26 = $$1.i.a($$2);
         hv $$27 = $$3.b($$24, $$25, $$26);
         dip $$28 = $$4.a_($$27);
         if ($$28.i() || $$28.a(arr.bJ)) {
            if (++$$22 > $$1.p) {
               return false;
            }
         }

         $$7.add(Pair.of($$27, $$1.k.a($$2)));
      }

      if ($$21) {
         int $$29 = $$2.a(4);
         int $$30 = $$8 * 2 + 1;
         if ($$29 == 0) {
            $$11.add($$3.b($$30, 7, 0));
            $$11.add($$3.b($$30, 5, 0));
            $$11.add($$3.b($$30, 1, 0));
         } else if ($$29 == 1) {
            $$11.add($$3.b(0, 7, $$30));
            $$11.add($$3.b(0, 5, $$30));
            $$11.add($$3.b(0, 1, $$30));
         } else if ($$29 == 2) {
            $$11.add($$3.b($$30, 7, $$30));
            $$11.add($$3.b($$30, 5, $$30));
            $$11.add($$3.b($$30, 1, $$30));
         } else {
            $$11.add($$3.b(0, 7, 0));
            $$11.add($$3.b(0, 5, 0));
            $$11.add($$3.b(0, 1, 0));
         }
      }

      List<hv> $$31 = Lists.newArrayList();
      Predicate<dip> $$32 = a($$1.c.g);

      for (hv $$33 : hv.a($$3.b($$5, $$5, $$5), $$3.b($$6, $$6, $$6))) {
         double $$34 = $$10.a((double)$$33.u(), (double)$$33.v(), (double)$$33.w()) * $$1.o;
         double $$35 = 0.0;
         double $$36 = 0.0;

         for (Pair<hv, Integer> $$37 : $$7) {
            $$35 += aty.f($$33.j((iz)$$37.getFirst()) + (double)((Integer)$$37.getSecond()).intValue()) + $$34;
         }

         for (hv $$38 : $$11) {
            $$36 += aty.f($$33.j($$38) + (double)$$15.d) + $$34;
         }

         if (!($$35 < $$19)) {
            if ($$21 && $$36 >= $$20 && $$35 < $$16) {
               this.a($$4, $$33, cwb.a.o(), $$32);

               for (ia $$39 : a) {
                  hv $$40 = $$33.a($$39);
                  edz $$41 = $$4.b_($$40);
                  if (!$$41.c()) {
                     $$4.a($$40, $$41.a(), 0);
                  }
               }
            } else if ($$35 >= $$16) {
               this.a($$4, $$33, $$14.a.a($$2, $$33), $$32);
            } else if ($$35 >= $$17) {
               boolean $$42 = (double)$$2.i() < $$1.g;
               if ($$42) {
                  this.a($$4, $$33, $$14.c.a($$2, $$33), $$32);
               } else {
                  this.a($$4, $$33, $$14.b.a($$2, $$33), $$32);
               }

               if ((!$$1.h || $$42) && (double)$$2.i() < $$1.f) {
                  $$31.add($$33.i());
               }
            } else if ($$35 >= $$18) {
               this.a($$4, $$33, $$14.d.a($$2, $$33), $$32);
            } else if ($$35 >= $$19) {
               this.a($$4, $$33, $$14.e.a($$2, $$33), $$32);
            }
         }
      }

      List<dip> $$43 = $$14.f;

      for (hv $$44 : $$31) {
         dip $$45 = ac.a($$43, $$2);

         for (ia $$46 : a) {
            if ($$45.b(djf.P)) {
               $$45 = $$45.a(djf.P, $$46);
            }

            hv $$47 = $$44.a($$46);
            dip $$48 = $$4.a_($$47);
            if ($$45.b(djf.C)) {
               $$45 = $$45.a(djf.C, Boolean.valueOf($$48.u().b()));
            }

            if (cwh.g($$48)) {
               this.a($$4, $$47, $$45, $$32);
               break;
            }
         }
      }

      return true;
   }
}
