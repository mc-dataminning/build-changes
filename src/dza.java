import com.mojang.serialization.Codec;

public abstract class dza extends dzx<ecd> {
   public dza(Codec<ecd> $$0) {
      super($$0);
   }

   protected void a(day $$0, ayk $$1, io $$2, ecd $$3, int $$4, io.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(it.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(ayk $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(day $$0, io $$1, int $$2, io.a $$3, ecd $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.al()) {
         drb $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(avw.ba)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     drb $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(avw.O)) {
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
   public boolean a(dzz<ecd> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      ayk $$3 = $$0.d();
      ecd $$4 = $$0.f();
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

   protected abstract void a(day var1, ayk var2, io var3, int var4, io.a var5, ecd var6);
}
