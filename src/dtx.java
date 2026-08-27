import com.mojang.serialization.Codec;

public abstract class dtx extends duu<dxa> {
   public dtx(Codec<dxa> $$0) {
      super($$0);
   }

   protected void a(cwf $$0, awt $$1, ib $$2, dxa $$3, int $$4, ib.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ih.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(awt $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cwf $$0, ib $$1, int $$2, ib.a $$3, dxa $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.J_() + 1 && $$5 + $$2 + 1 < $$0.ak()) {
         dme $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(aue.aZ)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dme $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(aue.O)) {
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
   public boolean a(duw<dxa> $$0) {
      cwz $$1 = $$0.b();
      ib $$2 = $$0.e();
      awt $$3 = $$0.d();
      dxa $$4 = $$0.f();
      int $$5 = this.a($$3);
      ib.a $$6 = new ib.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(cwf var1, awt var2, ib var3, int var4, ib.a var5, dxa var6);
}
