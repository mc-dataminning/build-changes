import com.mojang.serialization.Codec;

public abstract class dzc extends dzz<ecf> {
   public dzc(Codec<ecf> $$0) {
      super($$0);
   }

   protected void a(dba $$0, aym $$1, io $$2, ecf $$3, int $$4, io.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(it.b, $$6);
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

   protected boolean a(dba $$0, io $$1, int $$2, io.a $$3, ecf $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.al()) {
         drd $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(avx.ba)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     drd $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(avx.O)) {
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
   public boolean a(eab<ecf> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      aym $$3 = $$0.d();
      ecf $$4 = $$0.f();
      int $$5 = this.a($$3);
      io.a $$6 = new io.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dba var1, aym var2, io var3, int var4, io.a var5, ecf var6);
}
