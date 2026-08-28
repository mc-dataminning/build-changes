import com.mojang.serialization.Codec;

public class egw extends ehr<ekc> {
   public egw(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      jj $$1 = $$0.e();
      dio $$2 = $$0.b();
      azs $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.d())) {
         jj.a $$4 = $$1.k();
         jj.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dkw.el.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jo.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jo.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jo.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jo.f));
            $$4.c(jo.a);
         }

         $$4.c(jo.b);
         this.a($$2, $$3, $$5.a($$4, jo.c));
         this.a($$2, $$3, $$5.a($$4, jo.d));
         this.a($$2, $$3, $$5.a($$4, jo.e));
         this.a($$2, $$3, $$5.a($$4, jo.f));
         $$4.c(jo.a);
         jj.a $$10 = new jj.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azk.a($$11) * azk.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jo.a))) {
                     $$10.c(jo.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jo.a))) {
                     $$2.a($$10, dkw.el.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dhq $$0, azs $$1, jj $$2) {
      if ($$1.h()) {
         $$0.a($$2, dkw.el.m(), 2);
      }
   }

   private boolean b(dhq $$0, azs $$1, jj $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dkw.el.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
