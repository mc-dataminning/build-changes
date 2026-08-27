import com.mojang.serialization.Codec;

public class dqi extends drc<dtn> {
   public dqi(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      hv $$1 = $$0.e();
      ctt $$2 = $$0.b();
      auf $$3 = $$0.d();
      if ($$2.t($$1) && !$$2.t($$1.c())) {
         hv.a $$4 = $$1.j();
         hv.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.t($$4)) {
            if ($$2.r($$4)) {
               return true;
            }

            $$2.a($$4, cwb.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ia.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ia.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ia.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ia.f));
            $$4.c(ia.a);
         }

         $$4.c(ia.b);
         this.a($$2, $$3, $$5.a($$4, ia.c));
         this.a($$2, $$3, $$5.a($$4, ia.d));
         this.a($$2, $$3, $$5.a($$4, ia.e));
         this.a($$2, $$3, $$5.a($$4, ia.f));
         $$4.c(ia.a);
         hv.a $$10 = new hv.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = aty.a($$11) * aty.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.t($$5.a($$10, ia.a))) {
                     $$10.c(ia.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.t($$5.a($$10, ia.a))) {
                     $$2.a($$10, cwb.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(csz $$0, auf $$1, hv $$2) {
      if ($$1.h()) {
         $$0.a($$2, cwb.dY.o(), 2);
      }
   }

   private boolean b(csz $$0, auf $$1, hv $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, cwb.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
