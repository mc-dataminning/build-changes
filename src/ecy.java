import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class ecy extends eca<eer> {
   public ecy(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      dbh $$3 = new dbh($$1);
      $$1 = $$3.a(7, 0, 7);
      $$1 = $$1.h($$2.a(dyu.a.f, $$1).v()).d();
      if ($$1.v() >= 8 && $$2.t($$1).a(ddg.f)) {
         iw[] $$4 = new iw[]{iw.c, iw.f, iw.d, iw.e};
         boolean[] $$5 = new boolean[]{false, false, false, false};
         int $$6 = 0;

         for (int $$7 = 0; $$7 < 4; $$7++) {
            if (this.a($$2, $$3, $$1, $$4[$$7])) {
               $$6++;
               $$5[$$7] = !this.a($$2, $$1, $$4[$$7]);
            }
         }

         if ($$6 == 0) {
            return false;
         } else {
            int $$8 = $$6 == 4 ? 1 : 0;
            int $$9 = $$2.a(dyu.a.f, $$1).v();

            for (int $$10 = -1 - $$8; $$10 <= 2 + $$8; $$10++) {
               for (int $$11 = -1 - $$8; $$11 <= 2 + $$8; $$11++) {
                  ir $$12 = $$1.b($$10, 0, $$11);
                  ir $$13 = $$2.a(dyu.a.f, $$12).d();
                  if (!this.b($$2, $$13)) {
                     return false;
                  }
               }
            }

            for (int $$14 = -1 - $$8; $$14 <= 2 + $$8; $$14++) {
               for (int $$15 = -1 - $$8; $$15 <= 2 + $$8; $$15++) {
                  ir $$16 = $$1.b($$14, 0, $$15);
                  this.b($$2, $$16.h($$9 - 1), null, false);
               }
            }

            for (int $$17 = 0; $$17 < 4; $$17++) {
               if ($$5[$$17]) {
                  this.a($$2, $$1, $$4[$$17], $$8 == 1);
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private boolean b(dcv $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.a(dfe.k) || $$2.a(dfe.lC) || $$2.a(dfe.pG) || $$2.a(dfe.pd) || $$2.a(dfe.pP);
   }

   private boolean a(dcv $$0, dbh $$1, ir $$2, iw $$3) {
      ir $$4 = $$2.a($$3, 16);
      if (!$$0.t($$4).a(ddg.f)) {
         return false;
      } else {
         int $$5 = $$0.a(dyu.a.f, $$2).v();
         int $$6 = $$0.a(dyu.a.f, $$4).v();
         if (Math.abs($$5 - $$6) > 10) {
            return false;
         } else {
            long $$7 = $$0.C();
            dbh $$8 = $$1;
            $$2.a(iw.c);
            if ($$3 == iw.c || $$3 == iw.f) {
               $$8 = new dbh($$1.e + $$3.j(), $$1.f + $$3.l());
            }

            $$7 += (long)$$8.hashCode();
            Random $$9 = new Random($$7);
            if ($$3 == iw.c || $$3 == iw.d) {
               $$9.nextFloat();
            }

            boolean $$10 = $$9.nextFloat() < 0.7F;
            if (!$$10) {
               return false;
            } else {
               for (int $$11 = -1; $$11 <= 2; $$11++) {
                  for (int $$12 = -2; $$12 < 18; $$12++) {
                     ir $$13 = this.a($$0, $$2, $$3, $$11, $$12);
                     if (!this.b($$0, $$13)) {
                        return false;
                     }
                  }
               }

               return true;
            }
         }
      }
   }

   private boolean a(dcv $$0, ir $$1, iw $$2) {
      ir $$3 = $$1.a($$2, 16);
      int $$4 = $$0.a(dyu.a.f, $$1).v();
      int $$5 = $$0.a(dyu.a.f, $$3).v();
      ir $$6 = $$1.a($$2, 4);
      $$6 = $$0.a(dyu.a.f, $$6).d();
      return !$$0.a_($$6).a(dfe.lC) && !$$0.a_($$6).a(dfe.pG) ? $$5 < $$4 : true;
   }

   private void a(dcv $$0, ir $$1, iw $$2, boolean $$3) {
      if (this.b($$0, $$1, $$2)) {
         for (int $$4 = -1; $$4 <= 2; $$4++) {
            iw $$5 = null;
            if ($$4 == -1 || $$4 == 2) {
               $$5 = this.a($$2, $$4 < 0);
            }

            boolean $$6 = false;

            for (int $$7 = 2; $$7 < 14; $$7++) {
               if ($$6 && (double)$$0.F_().i() < 0.3) {
                  $$6 = false;
               }

               ir $$8 = this.a($$0, $$1, $$2, $$4, $$7);
               $$6 = this.b($$0, $$8, (!$$3 || $$7 != 2) && $$7 != 13 ? $$5 : null, $$6);
            }
         }
      } else {
         int $$9 = $$1.v();
         int $$10 = $$0.a(dyu.a.f, $$1.a($$2, 16)).v() - 1;

         for (int $$11 = -1; $$11 <= 2; $$11++) {
            iw $$12 = null;
            if ($$11 == -1 || $$11 == 2) {
               $$12 = this.a($$2, $$11 < 0);
            }

            boolean $$13 = false;

            for (int $$14 = 2; $$14 < 14; $$14++) {
               if ($$13 && (double)$$0.F_().i() < 0.3) {
                  $$13 = false;
               }

               int $$15 = Math.round(aym.i(((float)$$14 - 2.0F) / 12.0F, (float)$$9, (float)$$10));
               ir $$16 = this.a($$0, $$1, $$2, $$11, $$14).h($$15);
               $$13 = this.b($$0, $$16, (!$$3 || $$14 != 2) && $$14 != 13 ? $$12 : null, $$13);
            }
         }
      }
   }

   @Nullable
   private iw a(iw $$0, boolean $$1) {
      if ($$0.o() == iw.c.o()) {
         return $$1 ? iw.e : iw.f;
      } else if ($$0.o() == iw.f.o()) {
         return $$1 ? iw.c : iw.d;
      } else {
         return null;
      }
   }

   private ir a(dcv $$0, ir $$1, iw $$2, int $$3, int $$4) {
      jv $$5 = $$2.q();
      ir $$6 = $$1.b(($$5.u() > 0 ? 1 : 0) + $$5.u() * $$4 + Math.abs($$5.w()) * $$3, 0, ($$5.w() > 0 ? 1 : 0) + $$5.w() * $$4 + Math.abs($$5.u()) * $$3);
      return $$0.a(dyu.a.f, $$6).d();
   }

   private boolean b(dcv $$0, ir $$1, iw $$2) {
      int $$3 = $$1.v();

      for (int $$4 = -1; $$4 <= 2; $$4++) {
         int $$5 = $$3;

         for (int $$6 = 2; $$6 < 14; $$6++) {
            int $$7 = this.a($$0, $$1, $$2, $$4, $$6).v();
            if (Math.abs($$5 - $$7) > 1) {
               return false;
            }

            $$5 = $$7;
         }
      }

      return true;
   }

   private boolean b(dcv $$0, ir $$1, @Nullable iw $$2, boolean $$3) {
      int $$4 = $$0.a(dyu.a.f, $$1).v() - 1;
      int $$5 = Math.min($$4, $$1.v() + 10);

      for (int $$6 = $$1.v() + 1; $$6 <= $$5; $$6++) {
         $$0.a($$1.h($$6), dfe.a.n(), 3);
      }

      boolean $$7 = $$0.a_($$1.d()).i();
      $$0.a($$1, ($$7 ? dfe.pG : dfe.lC).n(), 3);
      if ($$2 != null) {
         ir $$8 = $$1.c();
         ir $$9 = $$8.a($$2);
         if ($$7 && $$0.a_($$9).i()) {
            $$0.a($$8, dfe.pP.n(), 3);
            $$0.y($$8).e($$8);
            return true;
         }

         if ($$0.a_($$9).i() && this.b($$0, $$1.a($$2)) && ($$3 || $$0.F_().i() < 0.6F)) {
            $$0.a($$9, dfe.pP.n(), 3);
            $$0.y($$9).e($$9);
            if ($$0.F_().i() < 0.1F) {
               $$0.a($$9.c(), dfe.pd.n(), 3);
            }

            return true;
         }
      }

      return false;
   }
}
