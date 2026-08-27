import com.mojang.serialization.Codec;

public class dpg extends dqa<dsl> {
   public dpg(Codec<dsl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsl> $$0) {
      hx $$1 = $$0.e();
      csz $$2 = $$0.b();
      atw $$3 = $$0.d();
      if ($$2.t($$1) && !$$2.t($$1.c())) {
         hx.a $$4 = $$1.j();
         hx.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.t($$4)) {
            if ($$2.r($$4)) {
               return true;
            }

            $$2.a($$4, cvh.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ib.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ib.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ib.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ib.f));
            $$4.c(ib.a);
         }

         $$4.c(ib.b);
         this.a($$2, $$3, $$5.a($$4, ib.c));
         this.a($$2, $$3, $$5.a($$4, ib.d));
         this.a($$2, $$3, $$5.a($$4, ib.e));
         this.a($$2, $$3, $$5.a($$4, ib.f));
         $$4.c(ib.a);
         hx.a $$10 = new hx.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = atq.a($$11) * atq.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.t($$5.a($$10, ib.a))) {
                     $$10.c(ib.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.t($$5.a($$10, ib.a))) {
                     $$2.a($$10, cvh.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(csg $$0, atw $$1, hx $$2) {
      if ($$1.h()) {
         $$0.a($$2, cvh.dY.o(), 2);
      }
   }

   private boolean b(csg $$0, atw $$1, hx $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, cvh.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
