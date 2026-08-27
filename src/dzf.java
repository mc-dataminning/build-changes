import com.mojang.serialization.Codec;

public class dzf extends dzz<eck> {
   public dzf(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      io $$1 = $$0.e();
      dbu $$2 = $$0.b();
      aym $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         io.a $$4 = $$1.j();
         io.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dec.dY.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, it.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, it.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, it.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, it.f));
            $$4.c(it.a);
         }

         $$4.c(it.b);
         this.a($$2, $$3, $$5.a($$4, it.c));
         this.a($$2, $$3, $$5.a($$4, it.d));
         this.a($$2, $$3, $$5.a($$4, it.e));
         this.a($$2, $$3, $$5.a($$4, it.f));
         $$4.c(it.a);
         io.a $$10 = new io.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = ayf.a($$11) * ayf.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, it.a))) {
                     $$10.c(it.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, it.a))) {
                     $$2.a($$10, dec.dY.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dba $$0, aym $$1, io $$2) {
      if ($$1.h()) {
         $$0.a($$2, dec.dY.n(), 2);
      }
   }

   private boolean b(dba $$0, aym $$1, io $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dec.dY.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
