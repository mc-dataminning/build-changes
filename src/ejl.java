import com.mojang.serialization.Codec;

public abstract class ejl extends ekk<emr> {
   public ejl(Codec<emr> $$0) {
      super($$0);
   }

   protected void a(djy $$0, azx $$1, iv $$2, emr $$3, int $$4, iv.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jb.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(djy $$0, iv.a $$1, ebe $$2) {
      ebe $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(axe.cu)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(azx $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(djy $$0, iv $$1, int $$2, iv.a $$3, emr $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.K_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         ebe $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(axe.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     ebe $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(axe.Q)) {
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
   public boolean a(ekm<emr> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      azx $$3 = $$0.d();
      emr $$4 = $$0.f();
      int $$5 = this.a($$3);
      iv.a $$6 = new iv.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(djy var1, azx var2, iv var3, int var4, iv.a var5, emr var6);
}
