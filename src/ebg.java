import com.mojang.serialization.Codec;

public abstract class ebg extends ecd<eej> {
   public ebg(Codec<eej> $$0) {
      super($$0);
   }

   protected void a(dcx $$0, ayw $$1, jd $$2, eej $$3, int $$4, jd.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ji.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(ayw $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dcx $$0, jd $$1, int $$2, jd.a $$3, eej $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.am()) {
         dtc $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(awe.ba)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dtc $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(awe.O)) {
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
   public boolean a(ecf<eej> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayw $$3 = $$0.d();
      eej $$4 = $$0.f();
      int $$5 = this.a($$3);
      jd.a $$6 = new jd.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dcx var1, ayw var2, jd var3, int var4, jd.a var5, eej var6);
}
