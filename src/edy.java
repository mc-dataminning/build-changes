import com.mojang.serialization.Codec;

public abstract class edy extends eew<ehc> {
   public edy(Codec<ehc> $$0) {
      super($$0);
   }

   protected void a(dfn $$0, azu $$1, jh $$2, ehc $$3, int $$4, jh.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jm.b, $$6);
         if (!$$0.a_($$5).s()) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(azu $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dfn $$0, jh $$1, int $$2, jh.a $$3, ehc $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.K_() + 1 && $$5 + $$2 + 1 <= $$0.al()) {
         dvv $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(axc.bb)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dvv $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(axc.P)) {
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
   public boolean a(eey<ehc> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      azu $$3 = $$0.d();
      ehc $$4 = $$0.f();
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

   protected abstract void a(dfn var1, azu var2, jh var3, int var4, jh.a var5, ehc var6);
}
