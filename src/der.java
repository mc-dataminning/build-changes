import javax.annotation.Nullable;

public abstract class der {
   @Nullable
   protected abstract aex<dnl<?, ?>> a(ase var1, boolean var2);

   public boolean a(aks $$0, dhi $$1, gw $$2, dfl $$3, ase $$4) {
      aex<dnl<?, ?>> $$5 = this.a($$4, this.a($$0, $$2));
      if ($$5 == null) {
         return false;
      } else {
         hg<dnl<?, ?>> $$6 = $$0.G_().d(je.as).b($$5).orElse(null);
         if ($$6 == null) {
            return false;
         } else {
            dnl<?, ?> $$7 = $$6.a();
            dfl $$8 = $$0.b_($$2).g();
            $$0.a($$2, $$8, 4);
            if ($$7.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$8) {
                  $$0.a($$2, $$3, $$8, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private boolean a(cpy $$0, gw $$1) {
      for (gw $$2 : gw.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(apu.U)) {
            return true;
         }
      }

      return false;
   }
}
