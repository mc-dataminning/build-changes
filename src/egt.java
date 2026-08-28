import com.mojang.serialization.Codec;

public abstract class egt extends ehr<ejx> {
   public egt(Codec<ejx> $$0) {
      super($$0);
   }

   protected void a(dhq $$0, azs $$1, jj $$2, ejx $$3, int $$4, jj.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jo.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(dhq $$0, jj.a $$1, dym $$2) {
      dym $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(awz.cs)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(azs $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dhq $$0, jj $$1, int $$2, jj.a $$3, ejx $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.G_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         dym $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(awz.bc)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dym $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(awz.Q)) {
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
   public boolean a(eht<ejx> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      azs $$3 = $$0.d();
      ejx $$4 = $$0.f();
      int $$5 = this.a($$3);
      jj.a $$6 = new jj.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dhq var1, azs var2, jj var3, int var4, jj.a var5, ejx var6);
}
