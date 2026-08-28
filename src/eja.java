import com.mojang.serialization.Codec;

public abstract class eja extends ejy<eme> {
   public eja(Codec<eme> $$0) {
      super($$0);
   }

   protected void a(djn $$0, azv $$1, iv $$2, eme $$3, int $$4, iv.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jb.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(djn $$0, iv.a $$1, eat $$2) {
      eat $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(axc.cu)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(azv $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(djn $$0, iv $$1, int $$2, iv.a $$3, eme $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.G_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         eat $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(axc.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     eat $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(axc.Q)) {
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
   public boolean a(eka<eme> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      azv $$3 = $$0.d();
      eme $$4 = $$0.f();
      int $$5 = this.a($$3);
      iv.a $$6 = new iv.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(djn var1, azv var2, iv var3, int var4, iv.a var5, eme var6);
}
