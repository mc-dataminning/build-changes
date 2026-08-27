import javax.annotation.Nullable;

public abstract class def {
   @Nullable
   protected abstract aeq<dmz<?, ?>> a(aru var1, boolean var2);

   public boolean a(akk $$0, dgw $$1, gu $$2, dez $$3, aru $$4) {
      aeq<dmz<?, ?>> $$5 = this.a($$4, this.a($$0, $$2));
      if ($$5 == null) {
         return false;
      } else {
         he<dmz<?, ?>> $$6 = $$0.B_().d(jc.as).b($$5).orElse(null);
         if ($$6 == null) {
            return false;
         } else {
            dmz<?, ?> $$7 = $$6.a();
            dez $$8 = $$0.b_($$2).g();
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

   private boolean a(cpm $$0, gu $$1) {
      for (gu $$2 : gu.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(apl.U)) {
            return true;
         }
      }

      return false;
   }
}
