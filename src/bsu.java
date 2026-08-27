import javax.annotation.Nullable;

public interface bsu {
   bst a = ($$0, $$1, $$2) -> true;
   bst b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         in $$3 = $$1.c();
         return $$0.b_($$1).a(avw.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bst c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(avw.b) : false;
   bst d = new bst() {
      @Override
      public boolean isSpawnPositionOk(dag $$0, in $$1, @Nullable brn<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            in $$3 = $$1.c();
            in $$4 = $$1.d();
            dqh $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dag $$0, in $$1, brn<?> $$2) {
         dqh $$3 = $$0.a_($$1);
         return dao.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public in a(dag $$0, in $$1) {
         in $$2 = $$1.d();
         return $$0.a_($$2).a(emp.a) ? $$2 : $$1;
      }
   };
}
