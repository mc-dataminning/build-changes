import javax.annotation.Nullable;

public abstract class deq extends der {
   @Override
   public boolean a(aks $$0, dhi $$1, gw $$2, dfl $$3, ase $$4) {
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
   protected abstract aex<dnl<?, ?>> a(ase var1);

   public boolean a(aks $$0, dhi $$1, gw $$2, dfl $$3, ase $$4, int $$5, int $$6) {
      aex<dnl<?, ?>> $$7 = this.a($$4);
      if ($$7 == null) {
         return false;
      } else {
         hg<dnl<?, ?>> $$8 = $$0.G_().d(je.as).b($$7).orElse(null);
         if ($$8 == null) {
            return false;
         } else {
            dnl<?, ?> $$9 = $$8.a();
            dfl $$10 = csy.a.n();
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

   public static boolean a(dfl $$0, cpd $$1, gw $$2, int $$3, int $$4) {
      csx $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }
}
