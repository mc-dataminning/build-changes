import javax.annotation.Nullable;

public abstract class dee {
   @Nullable
   protected abstract aeo<dmy<?, ?>> a(art var1, boolean var2);

   public boolean a(aki $$0, dgv $$1, gv $$2, dey $$3, art $$4) {
      aeo<dmy<?, ?>> $$5 = this.a($$4, this.a($$0, $$2));
      if ($$5 == null) {
         return false;
      } else {
         hf<dmy<?, ?>> $$6 = $$0.B_().d(jd.as).b($$5).orElse(null);
         if ($$6 == null) {
            return false;
         } else {
            dmy<?, ?> $$7 = $$6.a();
            dey $$8 = $$0.b_($$2).g();
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

   private boolean a(cpl $$0, gv $$1) {
      for (gv $$2 : gv.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(apj.U)) {
            return true;
         }
      }

      return false;
   }
}
