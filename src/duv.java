import com.mojang.serialization.Codec;

public abstract class duv extends dvs<dxy> {
   public duv(Codec<dxy> $$0) {
      super($$0);
   }

   protected void a(cxc $$0, axd $$1, ib $$2, dxy $$3, int $$4, ib.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ih.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(axd $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cxc $$0, ib $$1, int $$2, ib.a $$3, dxy $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.ak()) {
         dnb $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(aun.ba)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dnb $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(aun.O)) {
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
   public boolean a(dvu<dxy> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      axd $$3 = $$0.d();
      dxy $$4 = $$0.f();
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

   protected abstract void a(cxc var1, axd var2, ib var3, int var4, ib.a var5, dxy var6);
}
