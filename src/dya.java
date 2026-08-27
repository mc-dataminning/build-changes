import com.mojang.serialization.Codec;

public class dya extends dyu<ebf> {
   public dya(Codec<ebf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebf> $$0) {
      im $$1 = $$0.e();
      dap $$2 = $$0.b();
      ayd $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         im.a $$4 = $$1.j();
         im.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dcx.dY.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ir.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ir.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ir.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ir.f));
            $$4.c(ir.a);
         }

         $$4.c(ir.b);
         this.a($$2, $$3, $$5.a($$4, ir.c));
         this.a($$2, $$3, $$5.a($$4, ir.d));
         this.a($$2, $$3, $$5.a($$4, ir.e));
         this.a($$2, $$3, $$5.a($$4, ir.f));
         $$4.c(ir.a);
         im.a $$10 = new im.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = axw.a($$11) * axw.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, ir.a))) {
                     $$10.c(ir.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, ir.a))) {
                     $$2.a($$10, dcx.dY.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(czv $$0, ayd $$1, im $$2) {
      if ($$1.h()) {
         $$0.a($$2, dcx.dY.n(), 2);
      }
   }

   private boolean b(czv $$0, ayd $$1, im $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dcx.dY.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
