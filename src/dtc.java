import com.mojang.serialization.Codec;

public abstract class dtc extends dtz<dwf> {
   public dtc(Codec<dwf> $$0) {
      super($$0);
   }

   protected void a(cvs $$0, awp $$1, hz $$2, dwf $$3, int $$4, hz.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ie.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(awp $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cvs $$0, hz $$1, int $$2, hz.a $$3, dwf $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.J_() + 1 && $$5 + $$2 + 1 < $$0.ak()) {
         dlj $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(aua.aZ)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dlj $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(aua.O)) {
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
   public boolean a(dub<dwf> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      awp $$3 = $$0.d();
      dwf $$4 = $$0.f();
      int $$5 = this.a($$3);
      hz.a $$6 = new hz.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(cvs var1, awp var2, hz var3, int var4, hz.a var5, dwf var6);
}
