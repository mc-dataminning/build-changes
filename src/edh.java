import com.mojang.serialization.Codec;

public abstract class edh extends eef<egl> {
   public edh(Codec<egl> $$0) {
      super($$0);
   }

   protected void a(dew $$0, azr $$1, jg $$2, egl $$3, int $$4, jg.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jl.b, $$6);
         if (!$$0.a_($$5).s()) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(azr $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dew $$0, jg $$1, int $$2, jg.a $$3, egl $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 <= $$0.an()) {
         dvd $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(awz.bb)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dvd $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(awz.P)) {
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
   public boolean a(eeh<egl> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      azr $$3 = $$0.d();
      egl $$4 = $$0.f();
      int $$5 = this.a($$3);
      jg.a $$6 = new jg.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dew var1, azr var2, jg var3, int var4, jg.a var5, egl var6);
}
