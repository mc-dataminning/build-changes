import com.mojang.serialization.Codec;

public class dxk extends dye<eap> {
   public dxk(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      id $$1 = $$0.e();
      dab $$2 = $$0.b();
      axt $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         id.a $$4 = $$1.j();
         id.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dcj.dY.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ij.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ij.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ij.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ij.f));
            $$4.c(ij.a);
         }

         $$4.c(ij.b);
         this.a($$2, $$3, $$5.a($$4, ij.c));
         this.a($$2, $$3, $$5.a($$4, ij.d));
         this.a($$2, $$3, $$5.a($$4, ij.e));
         this.a($$2, $$3, $$5.a($$4, ij.f));
         $$4.c(ij.a);
         id.a $$10 = new id.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = axm.a($$11) * axm.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, ij.a))) {
                     $$10.c(ij.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, ij.a))) {
                     $$2.a($$10, dcj.dY.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(czh $$0, axt $$1, id $$2) {
      if ($$1.h()) {
         $$0.a($$2, dcj.dY.n(), 2);
      }
   }

   private boolean b(czh $$0, axt $$1, id $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dcj.dY.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
