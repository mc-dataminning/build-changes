import com.mojang.serialization.Codec;

public class efb extends efw<eih> {
   public efb(Codec<eih> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eih> $$0) {
      ji $$1 = $$0.e();
      dhe $$2 = $$0.b();
      azg $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.d())) {
         ji.a $$4 = $$1.k();
         ji.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, djm.el.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jn.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jn.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jn.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jn.f));
            $$4.c(jn.a);
         }

         $$4.c(jn.b);
         this.a($$2, $$3, $$5.a($$4, jn.c));
         this.a($$2, $$3, $$5.a($$4, jn.d));
         this.a($$2, $$3, $$5.a($$4, jn.e));
         this.a($$2, $$3, $$5.a($$4, jn.f));
         $$4.c(jn.a);
         ji.a $$10 = new ji.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = ayy.a($$11) * ayy.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jn.a))) {
                     $$10.c(jn.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jn.a))) {
                     $$2.a($$10, djm.el.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dgh $$0, azg $$1, ji $$2) {
      if ($$1.h()) {
         $$0.a($$2, djm.el.m(), 2);
      }
   }

   private boolean b(dgh $$0, azg $$1, ji $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, djm.el.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
