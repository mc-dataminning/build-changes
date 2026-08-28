import com.mojang.serialization.Codec;

public abstract class eah extends ebe<edk> {
   public eah(Codec<edk> $$0) {
      super($$0);
   }

   protected void a(dce $$0, aym $$1, ja $$2, edk $$3, int $$4, ja.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jf.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(aym $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dce $$0, ja $$1, int $$2, ja.a $$3, edk $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.am()) {
         dsh $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(avu.ba)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dsh $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(avu.O)) {
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
   public boolean a(ebg<edk> $$0) {
      dcz $$1 = $$0.b();
      ja $$2 = $$0.e();
      aym $$3 = $$0.d();
      edk $$4 = $$0.f();
      int $$5 = this.a($$3);
      ja.a $$6 = new ja.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dce var1, aym var2, ja var3, int var4, ja.a var5, edk var6);
}
