import com.mojang.serialization.Codec;

public abstract class dmt extends dnq<dpw> {
   public dmt(Codec<dpw> $$0) {
      super($$0);
   }

   protected void a(cqc $$0, ash $$1, gw $$2, dpw $$3, int $$4, gw.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ha.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(ash $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cqc $$0, gw $$1, int $$2, gw.a $$3, dpw $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.H_() + 1 && $$5 + $$2 + 1 < $$0.aj()) {
         dfd $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(apv.aZ)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dfd $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(apv.O)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean a(dns<dpw> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      ash $$3 = $$0.d();
      dpw $$4 = $$0.f();
      int $$5 = this.a($$3);
      gw.a $$6 = new gw.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(cqc var1, ash var2, gw var3, int var4, gw.a var5, dpw var6);
}
