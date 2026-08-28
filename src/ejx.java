import com.mojang.serialization.Codec;

public abstract class ejx extends ekw<end> {
   public ejx(Codec<end> $$0) {
      super($$0);
   }

   protected void a(dkk $$0, bai $$1, iw $$2, end $$3, int $$4, iw.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jc.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(dkk $$0, iw.a $$1, ebq $$2) {
      ebq $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(axn.cu)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(bai $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dkk $$0, iw $$1, int $$2, iw.a $$3, end $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.K_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         ebq $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(axn.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     ebq $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(axn.Q)) {
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
   public boolean a(eky<end> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      bai $$3 = $$0.d();
      end $$4 = $$0.f();
      int $$5 = this.a($$3);
      iw.a $$6 = new iw.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dkk var1, bai var2, iw var3, int var4, iw.a var5, end var6);
}
