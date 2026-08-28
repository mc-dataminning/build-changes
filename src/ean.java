import com.mojang.serialization.Codec;

public abstract class ean extends ebk<edq> {
   public ean(Codec<edq> $$0) {
      super($$0);
   }

   protected void a(dcg $$0, ayo $$1, ja $$2, edq $$3, int $$4, ja.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jf.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(ayo $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dcg $$0, ja $$1, int $$2, ja.a $$3, edq $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.I_() + 1 && $$5 + $$2 + 1 < $$0.am()) {
         dsk $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(avw.ba)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dsk $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
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
   public boolean a(ebm<edq> $$0) {
      ddb $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      edq $$4 = $$0.f();
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

   protected abstract void a(dcg var1, ayo var2, ja var3, int var4, ja.a var5, edq var6);
}
