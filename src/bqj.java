import javax.annotation.Nullable;

public interface bqj {
   bqi a = ($$0, $$1, $$2) -> true;
   bqi b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         ib $$3 = $$1.c();
         return $$0.b_($$1).a(aus.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bqi c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(aus.b) : false;
   bqi d = new bqi() {
      @Override
      public boolean isSpawnPositionOk(cxe $$0, ib $$1, @Nullable bpd<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            ib $$3 = $$1.c();
            ib $$4 = $$1.d();
            dnb $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(cxe $$0, ib $$1, bpd<?> $$2) {
         dnb $$3 = $$0.a_($$1);
         return cxm.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ib a(cxe $$0, ib $$1) {
         ib $$2 = $$1.d();
         return $$0.a_($$2).a($$0, $$2, eje.a) ? $$2 : $$1;
      }
   };
}
