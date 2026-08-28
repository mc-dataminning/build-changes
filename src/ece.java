import com.mojang.serialization.Codec;

public abstract class ece extends edc<efi> {
   public ece(Codec<efi> $$0) {
      super($$0);
   }

   protected void a(ddt $$0, azk $$1, je $$2, efi $$3, int $$4, je.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jj.b, $$6);
         if (!$$0.a_($$5).s()) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(azk $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(ddt $$0, je $$1, int $$2, je.a $$3, efi $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.G_() + 1 && $$5 + $$2 + 1 < $$0.an()) {
         dua $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(aws.bb)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dua $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(aws.P)) {
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
   public boolean a(ede<efi> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      azk $$3 = $$0.d();
      efi $$4 = $$0.f();
      int $$5 = this.a($$3);
      je.a $$6 = new je.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(ddt var1, azk var2, je var3, int var4, je.a var5, efi var6);
}
