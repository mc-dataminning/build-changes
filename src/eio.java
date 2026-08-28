import com.mojang.serialization.Codec;

public abstract class eio extends ejm<els> {
   public eio(Codec<els> $$0) {
      super($$0);
   }

   protected void a(djb $$0, azv $$1, iu $$2, els $$3, int $$4, iu.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ja.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(djb $$0, iu.a $$1, eah $$2) {
      eah $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(axc.ct)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(azv $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(djb $$0, iu $$1, int $$2, iu.a $$3, els $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.G_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         eah $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(axc.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     eah $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(axc.Q)) {
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
   public boolean a(ejo<els> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      azv $$3 = $$0.d();
      els $$4 = $$0.f();
      int $$5 = this.a($$3);
      iu.a $$6 = new iu.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(djb var1, azv var2, iu var3, int var4, iu.a var5, els var6);
}
