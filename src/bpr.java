import javax.annotation.Nullable;

public interface bpr {
   bpq a = ($$0, $$1, $$2) -> true;
   bpq b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.D_().a($$1)) {
         ib $$3 = $$1.c();
         return $$0.b_($$1).a(auj.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bpq c = ($$0, $$1, $$2) -> $$2 != null && $$0.D_().a($$1) ? $$0.b_($$1).a(auj.b) : false;
   bpq d = new bpq() {
      @Override
      public boolean isSpawnPositionOk(cwh $$0, ib $$1, @Nullable bol<?> $$2) {
         if ($$2 != null && $$0.D_().a($$1)) {
            ib $$3 = $$1.c();
            ib $$4 = $$1.d();
            dme $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(cwh $$0, ib $$1, bol<?> $$2) {
         dme $$3 = $$0.a_($$1);
         return cwp.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ib a(cwh $$0, ib $$1) {
         ib $$2 = $$1.d();
         return $$0.a_($$2).a($$0, $$2, eih.a) ? $$2 : $$1;
      }
   };
}
