import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;

public class dzu extends dzz<ecb> {
   public dzu(Codec<ecb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecb> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      ecb $$3 = $$0.f();
      aym $$4 = $$0.d();
      if (!dzv.a($$1, $$2)) {
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
               io $$13 = $$2.b($$10, 0, $$11);
               this.a($$1, $$4, $$13, $$10, $$11, $$6, $$12, $$5, $$7, $$3);
            }
         }

         return true;
      }
   }

   private void a(dbu $$0, aym $$1, io $$2, int $$3, int $$4, float $$5, double $$6, int $$7, float $$8, ecb $$9) {
      Optional<dwl> $$10 = dwl.a($$0, $$2, $$9.b, dzv::c, dzv::d);
      if (!$$10.isEmpty()) {
         OptionalInt $$11 = $$10.get().b();
         OptionalInt $$12 = $$10.get().c();
         if (!$$11.isEmpty() || !$$12.isEmpty()) {
            boolean $$13 = $$1.i() < $$5;
            dwl $$15;
            if ($$13 && $$12.isPresent() && this.b($$0, $$2.h($$12.getAsInt()))) {
               int $$14 = $$12.getAsInt();
               $$15 = $$10.get().a(OptionalInt.of($$14 - 1));
               $$0.a($$2.h($$14), dec.G.n(), 2);
            } else {
               $$15 = $$10.get();
            }

            OptionalInt $$17 = $$15.c();
            boolean $$18 = $$1.j() < $$6;
            int $$22;
            if ($$11.isPresent() && $$18 && !this.a((dbc)$$0, $$2.h($$11.getAsInt()))) {
               int $$19 = $$9.g.a($$1);
               this.a($$0, $$2.h($$11.getAsInt()), $$19, it.b);
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
            if ($$17.isPresent() && $$24 && !this.a((dbc)$$0, $$2.h($$17.getAsInt()))) {
               int $$25 = $$9.g.a($$1);
               this.a($$0, $$2.h($$17.getAsInt()), $$25, it.a);
               if ($$11.isPresent()) {
                  $$26 = Math.max(0, $$22 + ayf.b($$1, -$$9.e, $$9.e));
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
               int $$33 = ayf.b($$1, $$31, $$32 + 1);
               int $$34 = $$33 - 1;
               $$35 = $$30 - $$33;
               $$36 = $$34 - $$29;
            } else {
               $$35 = $$22;
               $$36 = $$26;
            }

            boolean $$39 = $$1.h() && $$35 > 0 && $$36 > 0 && $$15.d().isPresent() && $$35 + $$36 == $$15.d().getAsInt();
            if ($$11.isPresent()) {
               dzv.a($$0, $$2.h($$11.getAsInt() - 1), it.a, $$35, $$39);
            }

            if ($$17.isPresent()) {
               dzv.a($$0, $$2.h($$17.getAsInt() + 1), it.b, $$36, $$39);
            }
         }
      }
   }

   private boolean a(dbc $$0, io $$1) {
      return $$0.a_($$1).a(dec.H);
   }

   private int a(aym $$0, int $$1, int $$2, float $$3, int $$4, ecb $$5) {
      if ($$0.i() > $$3) {
         return 0;
      } else {
         int $$6 = Math.abs($$1) + Math.abs($$2);
         float $$7 = (float)ayf.a((double)$$6, 0.0, (double)$$5.l, (double)$$4 / 2.0, 0.0);
         return (int)a($$0, 0.0F, (float)$$4, $$7, (float)$$5.f);
      }
   }

   private boolean b(dbu $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      if (!$$2.a(dec.G) && !$$2.a(dec.su) && !$$2.a(dec.st)) {
         if ($$0.a_($$1.c()).u().a(awc.a)) {
            return false;
         } else {
            for (it $$3 : it.c.a) {
               if (!this.a((dba)$$0, $$1.a($$3))) {
                  return false;
               }
            }

            return this.a((dba)$$0, $$1.d());
         }
      } else {
         return false;
      }
   }

   private boolean a(dba $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      return $$2.a(avx.be) || $$2.u().a(awc.a);
   }

   private void a(dbu $$0, io $$1, int $$2, it $$3) {
      io.a $$4 = $$1.j();

      for (int $$5 = 0; $$5 < $$2; $$5++) {
         if (!dzv.c($$0, $$4)) {
            return;
         }

         $$4.c($$3);
      }
   }

   private double a(int $$0, int $$1, int $$2, int $$3, ecb $$4) {
      int $$5 = $$0 - Math.abs($$2);
      int $$6 = $$1 - Math.abs($$3);
      int $$7 = Math.min($$5, $$6);
      return (double)ayf.b((float)$$7, 0.0F, (float)$$4.k, $$4.j, 1.0F);
   }

   private static float a(aym $$0, float $$1, float $$2, float $$3, float $$4) {
      return bov.a($$0, $$3, $$4, $$1, $$2);
   }
}
