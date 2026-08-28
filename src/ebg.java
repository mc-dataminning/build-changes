import com.mojang.serialization.Codec;

public class ebg extends eca<eel> {
   public ebg(Codec<eel> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      jd $$1 = $$0.e();
      ddq $$2 = $$0.b();
      ayv $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         jd.a $$4 = $$1.j();
         jd.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dfy.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ji.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ji.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ji.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ji.f));
            $$4.c(ji.a);
         }

         $$4.c(ji.b);
         this.a($$2, $$3, $$5.a($$4, ji.c));
         this.a($$2, $$3, $$5.a($$4, ji.d));
         this.a($$2, $$3, $$5.a($$4, ji.e));
         this.a($$2, $$3, $$5.a($$4, ji.f));
         $$4.c(ji.a);
         jd.a $$10 = new jd.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = ayn.a($$11) * ayn.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, ji.a))) {
                     $$10.c(ji.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, ji.a))) {
                     $$2.a($$10, dfy.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dcv $$0, ayv $$1, jd $$2) {
      if ($$1.h()) {
         $$0.a($$2, dfy.dY.o(), 2);
      }
   }

   private boolean b(dcv $$0, ayv $$1, jd $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dfy.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
