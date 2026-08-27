import javax.annotation.Nullable;

public abstract class dek {
   @Nullable
   protected abstract aet<dne<?, ?>> a(arx var1, boolean var2);

   public boolean a(akn $$0, dhb $$1, gw $$2, dfe $$3, arx $$4) {
      aet<dne<?, ?>> $$5 = this.a($$4, this.a($$0, $$2));
      if ($$5 == null) {
         return false;
      } else {
         hg<dne<?, ?>> $$6 = $$0.B_().d(je.as).b($$5).orElse(null);
         if ($$6 == null) {
            return false;
         } else {
            dne<?, ?> $$7 = $$6.a();
            dfe $$8 = $$0.b_($$2).g();
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

   private boolean a(cpr $$0, gw $$1) {
      for (gw $$2 : gw.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(apo.U)) {
            return true;
         }
      }

      return false;
   }
}
