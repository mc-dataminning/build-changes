import com.mojang.serialization.Codec;

public abstract class doy extends dpv<dsb> {
   public doy(Codec<dsb> $$0) {
      super($$0);
   }

   protected void a(csb $$0, ats $$1, ht $$2, dsb $$3, int $$4, ht.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(hx.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(ats $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(csb $$0, ht $$1, int $$2, ht.a $$3, dsb $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.ak()) {
         dhi $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(arg.aZ)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dhi $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(arg.O)) {
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
   public boolean a(dpx<dsb> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      ats $$3 = $$0.d();
      dsb $$4 = $$0.f();
      int $$5 = this.a($$3);
      ht.a $$6 = new ht.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(csb var1, ats var2, ht var3, int var4, ht.a var5, dsb var6);
}
