import com.mojang.serialization.Codec;

public class dtf extends dtz<dwk> {
   public dtf(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      hz $$1 = $$0.e();
      cwm $$2 = $$0.b();
      awp $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         hz.a $$4 = $$1.j();
         hz.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, cyu.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ie.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ie.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ie.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ie.f));
            $$4.c(ie.a);
         }

         $$4.c(ie.b);
         this.a($$2, $$3, $$5.a($$4, ie.c));
         this.a($$2, $$3, $$5.a($$4, ie.d));
         this.a($$2, $$3, $$5.a($$4, ie.e));
         this.a($$2, $$3, $$5.a($$4, ie.f));
         $$4.c(ie.a);
         hz.a $$10 = new hz.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = awi.a($$11) * awi.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, ie.a))) {
                     $$10.c(ie.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, ie.a))) {
                     $$2.a($$10, cyu.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(cvs $$0, awp $$1, hz $$2) {
      if ($$1.h()) {
         $$0.a($$2, cyu.dY.o(), 2);
      }
   }

   private boolean b(cvs $$0, awp $$1, hz $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, cyu.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
