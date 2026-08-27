import com.mojang.serialization.Codec;

public abstract class dmq extends dnn<dpt> {
   public dmq(Codec<dpt> $$0) {
      super($$0);
   }

   protected void a(cpn $$0, aru $$1, gu $$2, dpt $$3, int $$4, gu.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(ha.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }
   }

   protected int a(aru $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cpn $$0, gu $$1, int $$2, gu.a $$3, dpt $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.C_() + 1 && $$5 + $$2 + 1 < $$0.aj()) {
         dfa $$6 = $$0.a_($$1.d());
         if (!b($$6) && !$$6.a(apl.aZ)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     dfa $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.i() && !$$11.a(apl.O)) {
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
   public boolean a(dnp<dpt> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      aru $$3 = $$0.d();
      dpt $$4 = $$0.f();
      int $$5 = this.a($$3);
      gu.a $$6 = new gu.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(cpn var1, aru var2, gu var3, int var4, gu.a var5, dpt var6);
}
