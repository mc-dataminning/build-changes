import com.mojang.serialization.Codec;

public class dyj extends dzd<ebo> {
   public dyj(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      in $$1 = $$0.e();
      day $$2 = $$0.b();
      ayg $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         in.a $$4 = $$1.j();
         in.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, ddg.dY.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, is.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, is.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, is.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, is.f));
            $$4.c(is.a);
         }

         $$4.c(is.b);
         this.a($$2, $$3, $$5.a($$4, is.c));
         this.a($$2, $$3, $$5.a($$4, is.d));
         this.a($$2, $$3, $$5.a($$4, is.e));
         this.a($$2, $$3, $$5.a($$4, is.f));
         $$4.c(is.a);
         in.a $$10 = new in.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = axz.a($$11) * axz.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, is.a))) {
                     $$10.c(is.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, is.a))) {
                     $$2.a($$10, ddg.dY.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dae $$0, ayg $$1, in $$2) {
      if ($$1.h()) {
         $$0.a($$2, ddg.dY.n(), 2);
      }
   }

   private boolean b(dae $$0, ayg $$1, in $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, ddg.dY.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
