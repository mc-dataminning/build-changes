import javax.annotation.Nullable;

public abstract class ded extends dee {
   @Override
   public boolean a(aki $$0, dgv $$1, gv $$2, dey $$3, art $$4) {
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
   protected abstract aeo<dmy<?, ?>> a(art var1);

   public boolean a(aki $$0, dgv $$1, gv $$2, dey $$3, art $$4, int $$5, int $$6) {
      aeo<dmy<?, ?>> $$7 = this.a($$4);
      if ($$7 == null) {
         return false;
      } else {
         hf<dmy<?, ?>> $$8 = $$0.B_().d(jd.as).b($$7).orElse(null);
         if ($$8 == null) {
            return false;
         } else {
            dmy<?, ?> $$9 = $$8.a();
            dey $$10 = csl.a.n();
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

   public static boolean a(dey $$0, coq $$1, gv $$2, int $$3, int $$4) {
      csk $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }
}
