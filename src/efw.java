import com.mojang.serialization.Codec;

public abstract class efw extends egu<eja> {
   public efw(Codec<eja> $$0) {
      super($$0);
   }

   protected void a(dha $$0, azh $$1, ji $$2, eja $$3, int $$4, ji.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jn.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(dha $$0, ji.a $$1, dxq $$2) {
      dxq $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(awp.cs)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(azh $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dha $$0, ji $$1, int $$2, ji.a $$3, eja $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.G_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         dxq $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(awp.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dxq $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(awp.Q)) {
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
   public boolean a(egw<eja> $$0) {
      dhy $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      eja $$4 = $$0.f();
      int $$5 = this.a($$3);
      ji.a $$6 = new ji.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dha var1, azh var2, ji var3, int var4, ji.a var5, eja var6);
}
