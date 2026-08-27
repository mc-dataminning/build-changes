import com.mojang.serialization.Codec;

public abstract class dmo extends dnl<dpr> {
   public dmo(Codec<dpr> $$0) {
      super($$0);
   }

   protected void a(cpl $$0, art $$1, gv $$2, dpr $$3, int $$4, gv.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(hb.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(art $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cpl $$0, gv $$1, int $$2, gv.a $$3, dpr $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.C_() + 1 && $$5 + $$2 + 1 < $$0.aj()) {
         dey $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(apj.aZ)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dey $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(apj.O)) {
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
   public boolean a(dnn<dpr> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      art $$3 = $$0.d();
      dpr $$4 = $$0.f();
      int $$5 = this.a($$3);
      gv.a $$6 = new gv.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(cpl var1, art var2, gv var3, int var4, gv.a var5, dpr var6);
}
