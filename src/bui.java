import javax.annotation.Nullable;

public interface bui {
   buh a = ($$0, $$1, $$2) -> true;
   buh b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         iz $$3 = $$1.c();
         return $$0.b_($$1).a(awu.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   buh c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awu.b) : false;
   buh d = new buh() {
      @Override
      public boolean isSpawnPositionOk(dbz $$0, iz $$1, @Nullable bsy<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            iz $$3 = $$1.c();
            iz $$4 = $$1.d();
            dsa $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dbz $$0, iz $$1, bsy<?> $$2) {
         dsa $$3 = $$0.a_($$1);
         return dch.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public iz a(dbz $$0, iz $$1) {
         iz $$2 = $$1.d();
         return $$0.a_($$2).a(eoi.a) ? $$2 : $$1;
      }
   };
}
