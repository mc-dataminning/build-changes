import com.mojang.serialization.Codec;

public abstract class ecw extends edu<ega> {
   public ecw(Codec<ega> $$0) {
      super($$0);
   }

   protected void a(dek $$0, azn $$1, jf $$2, ega $$3, int $$4, jf.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jk.b, $$6);
         if (!$$0.a_($$5).s()) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(azn $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dek $$0, jf $$1, int $$2, jf.a $$3, ega $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.H_() + 1 && $$5 + $$2 + 1 <= $$0.an()) {
         dus $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(awv.bb)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dus $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(awv.P)) {
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
   public boolean a(edw<ega> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      azn $$3 = $$0.d();
      ega $$4 = $$0.f();
      int $$5 = this.a($$3);
      jf.a $$6 = new jf.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dek var1, azn var2, jf var3, int var4, jf.a var5, ega var6);
}
