import javax.annotation.Nullable;

public interface btt {
   bts a = ($$0, $$1, $$2) -> true;
   bts b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         ja $$3 = $$1.c();
         return $$0.b_($$1).a(awa.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bts c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awa.b) : false;
   bts d = new bts() {
      @Override
      public boolean isSpawnPositionOk(dcg $$0, ja $$1, @Nullable bsj<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            ja $$3 = $$1.c();
            ja $$4 = $$1.d();
            dsh $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcg $$0, ja $$1, bsj<?> $$2) {
         dsh $$3 = $$0.a_($$1);
         return dco.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ja a(dcg $$0, ja $$1) {
         ja $$2 = $$1.d();
         return $$0.a_($$2).a(eoq.a) ? $$2 : $$1;
      }
   };
}
