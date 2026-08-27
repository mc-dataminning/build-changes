import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;

public class dnl extends dnq<dps> {
   public dnl(Codec<dps> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dps> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      dps $$3 = $$0.f();
      ash $$4 = $$0.d();
      if (!dnm.a($$1, $$2)) {
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
               gw $$13 = $$2.b($$10, 0, $$11);
               this.a($$1, $$4, $$13, $$10, $$11, $$6, $$12, $$5, $$7, $$3);
            }
         }

         return true;
      }
   }

   private void a(cqv $$0, ash $$1, gw $$2, int $$3, int $$4, float $$5, double $$6, int $$7, float $$8, dps $$9) {
      Optional<dkc> $$10 = dkc.a($$0, $$2, $$9.b, dnm::c, dnm::d);
      if (!$$10.isEmpty()) {
         OptionalInt $$11 = $$10.get().b();
         OptionalInt $$12 = $$10.get().c();
         if (!$$11.isEmpty() || !$$12.isEmpty()) {
            boolean $$13 = $$1.i() < $$5;
            dkc $$15;
            if ($$13 && $$12.isPresent() && this.b($$0, $$2.h($$12.getAsInt()))) {
               int $$14 = $$12.getAsInt();
               $$15 = $$10.get().a(OptionalInt.of($$14 - 1));
               $$0.a($$2.h($$14), cte.G.o(), 2);
            } else {
               $$15 = $$10.get();
            }

            OptionalInt $$17 = $$15.c();
            boolean $$18 = $$1.j() < $$6;
            int $$22;
            if ($$11.isPresent() && $$18 && !this.a((cqe)$$0, $$2.h($$11.getAsInt()))) {
               int $$19 = $$9.g.a($$1);
               this.a($$0, $$2.h($$11.getAsInt()), $$19, ha.b);
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
            if ($$17.isPresent() && $$24 && !this.a((cqe)$$0, $$2.h($$17.getAsInt()))) {
               int $$25 = $$9.g.a($$1);
               this.a($$0, $$2.h($$17.getAsInt()), $$25, ha.a);
               if ($$11.isPresent()) {
                  $$26 = Math.max(0, $$22 + asb.b($$1, -$$9.e, $$9.e));
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
               int $$33 = asb.b($$1, $$31, $$32 + 1);
               int $$34 = $$33 - 1;
               $$35 = $$30 - $$33;
               $$36 = $$34 - $$29;
            } else {
               $$35 = $$22;
               $$36 = $$26;
            }

            boolean $$39 = $$1.h() && $$35 > 0 && $$36 > 0 && $$15.d().isPresent() && $$35 + $$36 == $$15.d().getAsInt();
            if ($$11.isPresent()) {
               dnm.a($$0, $$2.h($$11.getAsInt() - 1), ha.a, $$35, $$39);
            }

            if ($$17.isPresent()) {
               dnm.a($$0, $$2.h($$17.getAsInt() + 1), ha.b, $$36, $$39);
            }
         }
      }
   }

   private boolean a(cqe $$0, gw $$1) {
      return $$0.a_($$1).a(cte.H);
   }

   private int a(ash $$0, int $$1, int $$2, float $$3, int $$4, dps $$5) {
      if ($$0.i() > $$3) {
         return 0;
      } else {
         int $$6 = Math.abs($$1) + Math.abs($$2);
         float $$7 = (float)asb.a((double)$$6, 0.0, (double)$$5.l, (double)$$4 / 2.0, 0.0);
         return (int)a($$0, 0.0F, (float)$$4, $$7, (float)$$5.f);
      }
   }

   private boolean b(cqv $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      if (!$$2.a(cte.G) && !$$2.a(cte.rt) && !$$2.a(cte.rs)) {
         if ($$0.a_($$1.c()).u().a(aqa.a)) {
            return false;
         } else {
            for (ha $$3 : ha.c.a) {
               if (!this.a((cqc)$$0, $$1.a($$3))) {
                  return false;
               }
            }

            return this.a((cqc)$$0, $$1.d());
         }
      } else {
         return false;
      }
   }

   private boolean a(cqc $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      return $$2.a(apv.bd) || $$2.u().a(aqa.a);
   }

   private void a(cqv $$0, gw $$1, int $$2, ha $$3) {
      gw.a $$4 = $$1.j();

      for (int $$5 = 0; $$5 < $$2; $$5++) {
         if (!dnm.c($$0, $$4)) {
            return;
         }

         $$4.c($$3);
      }
   }

   private double a(int $$0, int $$1, int $$2, int $$3, dps $$4) {
      int $$5 = $$0 - Math.abs($$2);
      int $$6 = $$1 - Math.abs($$3);
      int $$7 = Math.min($$5, $$6);
      return (double)asb.b((float)$$7, 0.0F, (float)$$4.k, $$4.j, 1.0F);
   }

   private static float a(ash $$0, float $$1, float $$2, float $$3, float $$4) {
      return bgd.a($$0, $$3, $$4, $$1, $$2);
   }
}
