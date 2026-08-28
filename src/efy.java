import com.mojang.serialization.Codec;

public abstract class efy extends egw<ejc> {
   public efy(Codec<ejc> $$0) {
      super($$0);
   }

   protected void a(dhj $$0, bam $$1, jh $$2, ejc $$3, int $$4, jh.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jm.b, $$6);
         if (!$$0.a_($$5).s()) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(bam $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dhj $$0, jh $$1, int $$2, jh.a $$3, ejc $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.L_() + 1 && $$5 + $$2 + 1 <= $$0.am()) {
         dxv $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(axu.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dxv $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(axu.Q)) {
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
   public boolean a(egy<ejc> $$0) {
      dig $$1 = $$0.b();
      jh $$2 = $$0.e();
      bam $$3 = $$0.d();
      ejc $$4 = $$0.f();
      int $$5 = this.a($$3);
      jh.a $$6 = new jh.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dhj var1, bam var2, jh var3, int var4, jh.a var5, ejc var6);
}
