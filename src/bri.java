import javax.annotation.Nullable;

public interface bri {
   brh a = ($$0, $$1, $$2) -> true;
   brh b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         ib $$3 = $$1.c();
         return $$0.b_($$1).a(avh.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   brh c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(avh.b) : false;
   brh d = new brh() {
      @Override
      public boolean isSpawnPositionOk(cza $$0, ib $$1, @Nullable bqb<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            ib $$3 = $$1.c();
            ib $$4 = $$1.d();
            doz $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(cza $$0, ib $$1, bqb<?> $$2) {
         doz $$3 = $$0.a_($$1);
         return czi.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ib a(cza $$0, ib $$1) {
         ib $$2 = $$1.d();
         return $$0.a_($$2).a(elh.a) ? $$2 : $$1;
      }
   };
}
