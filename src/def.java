import javax.annotation.Nullable;

public abstract class def extends deg {
   @Override
   public boolean a(akk $$0, dgx $$1, gu $$2, dfa $$3, aru $$4) {
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
   protected abstract aeq<dna<?, ?>> a(aru var1);

   public boolean a(akk $$0, dgx $$1, gu $$2, dfa $$3, aru $$4, int $$5, int $$6) {
      aeq<dna<?, ?>> $$7 = this.a($$4);
      if ($$7 == null) {
         return false;
      } else {
         he<dna<?, ?>> $$8 = $$0.B_().d(jc.as).b($$7).orElse(null);
         if ($$8 == null) {
            return false;
         } else {
            dna<?, ?> $$9 = $$8.a();
            dfa $$10 = csn.a.n();
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

   public static boolean a(dfa $$0, cos $$1, gu $$2, int $$3, int $$4) {
      csm $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }
}
