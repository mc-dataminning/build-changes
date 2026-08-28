import javax.annotation.Nullable;

public interface btx {
   btw a = ($$0, $$1, $$2) -> true;
   btw b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         ja $$3 = $$1.c();
         return $$0.b_($$1).a(awc.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   btw c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awc.b) : false;
   btw d = new btw() {
      @Override
      public boolean isSpawnPositionOk(dcj $$0, ja $$1, @Nullable bsn<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            ja $$3 = $$1.c();
            ja $$4 = $$1.d();
            dsl $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcj $$0, ja $$1, bsn<?> $$2) {
         dsl $$3 = $$0.a_($$1);
         return dcr.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ja a(dcj $$0, ja $$1) {
         ja $$2 = $$1.d();
         return $$0.a_($$2).a(eoy.a) ? $$2 : $$1;
      }
   };
}
