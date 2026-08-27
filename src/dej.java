import javax.annotation.Nullable;

public abstract class dej extends dek {
   @Override
   public boolean a(akn $$0, dhb $$1, gw $$2, dfe $$3, arx $$4) {
      for (int $$5 = 0; $$5 >= -1; $$5--) {
         for (int $$6 = 0; $$6 >= -1; $$6--) {
            if (a($$3, $$0, $$2, $$5, $$6)) {
               return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   protected abstract aet<dne<?, ?>> a(arx var1);

   public boolean a(akn $$0, dhb $$1, gw $$2, dfe $$3, arx $$4, int $$5, int $$6) {
      aet<dne<?, ?>> $$7 = this.a($$4);
      if ($$7 == null) {
         return false;
      } else {
         hg<dne<?, ?>> $$8 = $$0.B_().d(je.as).b($$7).orElse(null);
         if ($$8 == null) {
            return false;
         } else {
            dne<?, ?> $$9 = $$8.a();
            dfe $$10 = csr.a.n();
            $$0.a($$2.b($$5, 0, $$6), $$10, 4);
            $$0.a($$2.b($$5 + 1, 0, $$6), $$10, 4);
            $$0.a($$2.b($$5, 0, $$6 + 1), $$10, 4);
            $$0.a($$2.b($$5 + 1, 0, $$6 + 1), $$10, 4);
            if ($$9.a($$0, $$1, $$4, $$2.b($$5, 0, $$6))) {
               return true;
            } else {
               $$0.a($$2.b($$5, 0, $$6), $$3, 4);
               $$0.a($$2.b($$5 + 1, 0, $$6), $$3, 4);
               $$0.a($$2.b($$5, 0, $$6 + 1), $$3, 4);
               $$0.a($$2.b($$5 + 1, 0, $$6 + 1), $$3, 4);
               return false;
            }
         }
      }
   }

   public static boolean a(dfe $$0, cow $$1, gw $$2, int $$3, int $$4) {
      csq $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }
}
