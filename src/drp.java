import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;

public class drp extends dru<dtw> {
   public drp(Codec<dtw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<dtw> $$0) {
      cuk $$1 = $$0.b();
      hx $$2 = $$0.e();
      dtw $$3 = $$0.f();
      auv $$4 = $$0.d();
      if (!drq.a($$1, $$2)) {
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
               hx $$13 = $$2.b($$10, 0, $$11);
               this.a($$1, $$4, $$13, $$10, $$11, $$6, $$12, $$5, $$7, $$3);
            }
         }

         return true;
      }
   }

   private void a(cuk $$0, auv $$1, hx $$2, int $$3, int $$4, float $$5, double $$6, int $$7, float $$8, dtw $$9) {
      Optional<dog> $$10 = dog.a($$0, $$2, $$9.b, drq::c, drq::d);
      if (!$$10.isEmpty()) {
         OptionalInt $$11 = $$10.get().b();
         OptionalInt $$12 = $$10.get().c();
         if (!$$11.isEmpty() || !$$12.isEmpty()) {
            boolean $$13 = $$1.i() < $$5;
            dog $$15;
            if ($$13 && $$12.isPresent() && this.b($$0, $$2.h($$12.getAsInt()))) {
               int $$14 = $$12.getAsInt();
               $$15 = $$10.get().a(OptionalInt.of($$14 - 1));
               $$0.a($$2.h($$14), cws.G.o(), 2);
            } else {
               $$15 = $$10.get();
            }

            OptionalInt $$17 = $$15.c();
            boolean $$18 = $$1.j() < $$6;
            int $$22;
            if ($$11.isPresent() && $$18 && !this.a((cts)$$0, $$2.h($$11.getAsInt()))) {
               int $$19 = $$9.g.a($$1);
               this.a($$0, $$2.h($$11.getAsInt()), $$19, ic.b);
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
            if ($$17.isPresent() && $$24 && !this.a((cts)$$0, $$2.h($$17.getAsInt()))) {
               int $$25 = $$9.g.a($$1);
               this.a($$0, $$2.h($$17.getAsInt()), $$25, ic.a);
               if ($$11.isPresent()) {
                  $$26 = Math.max(0, $$22 + auo.b($$1, -$$9.e, $$9.e));
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
               int $$33 = auo.b($$1, $$31, $$32 + 1);
               int $$34 = $$33 - 1;
               $$35 = $$30 - $$33;
               $$36 = $$34 - $$29;
            } else {
               $$35 = $$22;
               $$36 = $$26;
            }

            boolean $$39 = $$1.h() && $$35 > 0 && $$36 > 0 && $$15.d().isPresent() && $$35 + $$36 == $$15.d().getAsInt();
            if ($$11.isPresent()) {
               drq.a($$0, $$2.h($$11.getAsInt() - 1), ic.a, $$35, $$39);
            }

            if ($$17.isPresent()) {
               drq.a($$0, $$2.h($$17.getAsInt() + 1), ic.b, $$36, $$39);
            }
         }
      }
   }

   private boolean a(cts $$0, hx $$1) {
      return $$0.a_($$1).a(cws.H);
   }

   private int a(auv $$0, int $$1, int $$2, float $$3, int $$4, dtw $$5) {
      if ($$0.i() > $$3) {
         return 0;
      } else {
         int $$6 = Math.abs($$1) + Math.abs($$2);
         float $$7 = (float)auo.a((double)$$6, 0.0, (double)$$5.l, (double)$$4 / 2.0, 0.0);
         return (int)a($$0, 0.0F, (float)$$4, $$7, (float)$$5.f);
      }
   }

   private boolean b(cuk $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      if (!$$2.a(cws.G) && !$$2.a(cws.su) && !$$2.a(cws.st)) {
         if ($$0.a_($$1.c()).u().a(asm.a)) {
            return false;
         } else {
            for (ic $$3 : ic.c.a) {
               if (!this.a((ctq)$$0, $$1.a($$3))) {
                  return false;
               }
            }

            return this.a((ctq)$$0, $$1.d());
         }
      } else {
         return false;
      }
   }

   private boolean a(ctq $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return $$2.a(ash.bd) || $$2.u().a(asm.a);
   }

   private void a(cuk $$0, hx $$1, int $$2, ic $$3) {
      hx.a $$4 = $$1.j();

      for (int $$5 = 0; $$5 < $$2; $$5++) {
         if (!drq.c($$0, $$4)) {
            return;
         }

         $$4.c($$3);
      }
   }

   private double a(int $$0, int $$1, int $$2, int $$3, dtw $$4) {
      int $$5 = $$0 - Math.abs($$2);
      int $$6 = $$1 - Math.abs($$3);
      int $$7 = Math.min($$5, $$6);
      return (double)auo.b((float)$$7, 0.0F, (float)$$4.k, $$4.j, 1.0F);
   }

   private static float a(auv $$0, float $$1, float $$2, float $$3, float $$4) {
      return bja.a($$0, $$3, $$4, $$1, $$2);
   }
}
