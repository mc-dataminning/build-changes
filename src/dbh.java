import javax.annotation.Nullable;

public abstract class dbh {
   @Nullable
   protected abstract acp<dkb<?, ?>> a(apf var1, boolean var2);

   public boolean a(aif $$0, ddy $$1, gu $$2, dcb $$3, apf $$4) {
      acp<dkb<?, ?>> $$5 = this.a($$4, this.a($$0, $$2));
      if ($$5 == null) {
         return false;
      } else {
         he<dkb<?, ?>> $$6 = $$0.B_().d(jc.as).b($$5).orElse(null);
         if ($$6 == null) {
            return false;
         } else {
            dkb<?, ?> $$7 = $$6.a();
            dcb $$8 = $$0.b_($$2).g();
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

   private boolean a(cmn $$0, gu $$1) {
      for (gu $$2 : gu.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(amw.U)) {
            return true;
         }
      }

      return false;
   }
}
