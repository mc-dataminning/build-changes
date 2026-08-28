import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;

public class ejg extends ejm<elo> {
   public ejg(Codec<elo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elo> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      elo $$3 = $$0.f();
      azv $$4 = $$0.d();
      if (!ejh.a($$1, $$2)) {
         return false;
      } else {
         int $$5 = $$3.c.a($$4);
         float $$6 = $$3.i.a($$4);
         float $$7 = $$3.h.a($$4);
         int $$8 = $$3.d.a($$4);
         int $$9 = $$3.d.a($$4);

         for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
            for (int $$11 = -$$9; $$11 <= $$9; $$11++) {
               double $$12 = this.a($$8, $$9, $$10, $$11, $$3);
               iu $$13 = $$2.b($$10, 0, $$11);
               this.a($$1, $$4, $$13, $$10, $$11, $$6, $$12, $$5, $$7, $$3);
            }
         }

         return true;
      }
   }

   private void a(djz $$0, azv $$1, iu $$2, int $$3, int $$4, float $$5, double $$6, int $$7, float $$8, elo $$9) {
      Optional<efw> $$10 = efw.a($$0, $$2, $$9.b, ejh::c, ejh::d);
      if (!$$10.isEmpty()) {
         OptionalInt $$11 = $$10.get().b();
         OptionalInt $$12 = $$10.get().c();
         if (!$$11.isEmpty() || !$$12.isEmpty()) {
            boolean $$13 = $$1.i() < $$5;
            efw $$15;
            if ($$13 && $$12.isPresent() && this.b($$0, $$2.h($$12.getAsInt()))) {
               int $$14 = $$12.getAsInt();
               $$15 = $$10.get().a(OptionalInt.of($$14 - 1));
               $$0.a($$2.h($$14), dmh.J.m(), 2);
            } else {
               $$15 = $$10.get();
            }

            OptionalInt $$17 = $$15.c();
            boolean $$18 = $$1.j() < $$6;
            int $$22;
            if ($$11.isPresent() && $$18 && !this.a((djd)$$0, $$2.h($$11.getAsInt()))) {
               int $$19 = $$9.g.a($$1);
               this.a($$0, $$2.h($$11.getAsInt()), $$19, ja.b);
               int $$20;
               if ($$17.isPresent()) {
                  $$20 = Math.min($$7, $$11.getAsInt() - $$17.getAsInt());
               } else {
                  $$20 = $$7;
               }

               $$22 = this.a($$1, $$3, $$4, $$8, $$20, $$9);
            } else {
               $$22 = 0;
            }

            boolean $$24 = $$1.j() < $$6;
            int $$26;
            if ($$17.isPresent() && $$24 && !this.a((djd)$$0, $$2.h($$17.getAsInt()))) {
               int $$25 = $$9.g.a($$1);
               this.a($$0, $$2.h($$17.getAsInt()), $$25, ja.a);
               if ($$11.isPresent()) {
                  $$26 = Math.max(0, $$22 + azm.b($$1, -$$9.e, $$9.e));
               } else {
                  $$26 = this.a($$1, $$3, $$4, $$8, $$7, $$9);
               }
            } else {
               $$26 = 0;
            }

            int $$36;
            int $$35;
            if ($$11.isPresent() && $$17.isPresent() && $$11.getAsInt() - $$22 <= $$17.getAsInt() + $$26) {
               int $$29 = $$17.getAsInt();
               int $$30 = $$11.getAsInt();
               int $$31 = Math.max($$30 - $$22, $$29 + 1);
               int $$32 = Math.min($$29 + $$26, $$30 - 1);
               int $$33 = azm.b($$1, $$31, $$32 + 1);
               int $$34 = $$33 - 1;
               $$35 = $$30 - $$33;
               $$36 = $$34 - $$29;
            } else {
               $$35 = $$22;
               $$36 = $$26;
            }

            boolean $$39 = $$1.h() && $$35 > 0 && $$36 > 0 && $$15.d().isPresent() && $$35 + $$36 == $$15.d().getAsInt();
            if ($$11.isPresent()) {
               ejh.a($$0, $$2.h($$11.getAsInt() - 1), ja.a, $$35, $$39);
            }

            if ($$17.isPresent()) {
               ejh.a($$0, $$2.h($$17.getAsInt() + 1), ja.b, $$36, $$39);
            }
         }
      }
   }

   private boolean a(djd $$0, iu $$1) {
      return $$0.a_($$1).a(dmh.K);
   }

   private int a(azv $$0, int $$1, int $$2, float $$3, int $$4, elo $$5) {
      if ($$0.i() > $$3) {
         return 0;
      } else {
         int $$6 = Math.abs($$1) + Math.abs($$2);
         float $$7 = (float)azm.a((double)$$6, 0.0, (double)$$5.l, (double)$$4 / 2.0, 0.0);
         return (int)a($$0, 0.0F, (float)$$4, $$7, (float)$$5.f);
      }
   }

   private boolean b(djz $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      if (!$$2.a(dmh.J) && !$$2.a(dmh.tc) && !$$2.a(dmh.tb)) {
         if ($$0.a_($$1.d()).y().a(axh.a)) {
            return false;
         } else {
            for (ja $$3 : ja.c.a) {
               if (!this.a((djb)$$0, $$1.a($$3))) {
                  return false;
               }
            }

            return this.a((djb)$$0, $$1.e());
         }
      } else {
         return false;
      }
   }

   private boolean a(djb $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      return $$2.a(axc.bh) || $$2.y().a(axh.a);
   }

   private void a(djz $$0, iu $$1, int $$2, ja $$3) {
      iu.a $$4 = $$1.k();

      for (int $$5 = 0; $$5 < $$2; $$5++) {
         if (!ejh.c($$0, $$4)) {
            return;
         }

         $$4.c($$3);
      }
   }

   private double a(int $$0, int $$1, int $$2, int $$3, elo $$4) {
      int $$5 = $$0 - Math.abs($$2);
      int $$6 = $$1 - Math.abs($$3);
      int $$7 = Math.min($$5, $$6);
      return (double)azm.b((float)$$7, 0.0F, (float)$$4.k, $$4.j, 1.0F);
   }

   private static float a(azv $$0, float $$1, float $$2, float $$3, float $$4) {
      return btc.a($$0, $$3, $$4, $$1, $$2);
   }
}
