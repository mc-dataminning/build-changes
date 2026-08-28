import javax.annotation.Nullable;

public interface buk {
   buj a = ($$0, $$1, $$2) -> true;
   buj b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         iz $$3 = $$1.c();
         return $$0.b_($$1).a(awv.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   buj c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awv.b) : false;
   buj d = new buj() {
      @Override
      public boolean isSpawnPositionOk(dcb $$0, iz $$1, @Nullable bta<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            iz $$3 = $$1.c();
            iz $$4 = $$1.d();
            dsc $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcb $$0, iz $$1, bta<?> $$2) {
         dsc $$3 = $$0.a_($$1);
         return dcj.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public iz a(dcb $$0, iz $$1) {
         iz $$2 = $$1.d();
         return $$0.a_($$2).a(eok.a) ? $$2 : $$1;
      }
   };
}
