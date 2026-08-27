import javax.annotation.Nullable;

public interface bti {
   bth a = ($$0, $$1, $$2) -> true;
   bth b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.D_().a($$1)) {
         ir $$3 = $$1.c();
         return $$0.b_($$1).a(awj.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bth c = ($$0, $$1, $$2) -> $$2 != null && $$0.D_().a($$1) ? $$0.b_($$1).a(awj.b) : false;
   bth d = new bth() {
      @Override
      public boolean isSpawnPositionOk(dcd $$0, ir $$1, @Nullable bsb<?> $$2) {
         if ($$2 != null && $$0.D_().a($$1)) {
            ir $$3 = $$1.c();
            ir $$4 = $$1.d();
            dtc $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcd $$0, ir $$1, bsb<?> $$2) {
         dtc $$3 = $$0.a_($$1);
         return dcl.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ir a(dcd $$0, ir $$1) {
         ir $$2 = $$1.d();
         return $$0.a_($$2).a(ept.a) ? $$2 : $$1;
      }
   };
}
