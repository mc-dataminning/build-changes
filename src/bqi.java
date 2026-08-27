import javax.annotation.Nullable;

public interface bqi {
   bqh a = ($$0, $$1, $$2) -> true;
   bqh b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         ib $$3 = $$1.c();
         return $$0.b_($$1).a(aus.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bqh c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(aus.b) : false;
   bqh d = new bqh() {
      @Override
      public boolean isSpawnPositionOk(cxc $$0, ib $$1, @Nullable bpc<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            ib $$3 = $$1.c();
            ib $$4 = $$1.d();
            dmz $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(cxc $$0, ib $$1, bpc<?> $$2) {
         dmz $$3 = $$0.a_($$1);
         return cxk.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public ib a(cxc $$0, ib $$1) {
         ib $$2 = $$1.d();
         return $$0.a_($$2).a($$0, $$2, ejd.a) ? $$2 : $$1;
      }
   };
}
