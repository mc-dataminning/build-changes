import com.mojang.serialization.Codec;

public class dua extends duu<dxf> {
   public dua(Codec<dxf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      ib $$1 = $$0.e();
      cwz $$2 = $$0.b();
      awt $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         ib.a $$4 = $$1.j();
         ib.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, czh.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ih.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ih.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ih.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ih.f));
            $$4.c(ih.a);
         }

         $$4.c(ih.b);
         this.a($$2, $$3, $$5.a($$4, ih.c));
         this.a($$2, $$3, $$5.a($$4, ih.d));
         this.a($$2, $$3, $$5.a($$4, ih.e));
         this.a($$2, $$3, $$5.a($$4, ih.f));
         $$4.c(ih.a);
         ib.a $$10 = new ib.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = awm.a($$11) * awm.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, ih.a))) {
                     $$10.c(ih.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, ih.a))) {
                     $$2.a($$10, czh.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(cwf $$0, awt $$1, ib $$2) {
      if ($$1.h()) {
         $$0.a($$2, czh.dY.o(), 2);
      }
   }

   private boolean b(cwf $$0, awt $$1, ib $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, czh.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
