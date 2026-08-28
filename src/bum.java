import javax.annotation.Nullable;

public interface bum {
   bul a = ($$0, $$1, $$2) -> true;
   bul b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         iz $$3 = $$1.c();
         return $$0.b_($$1).a(awv.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bul c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awv.b) : false;
   bul d = new bul() {
      @Override
      public boolean isSpawnPositionOk(dcd $$0, iz $$1, @Nullable btc<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            iz $$3 = $$1.c();
            iz $$4 = $$1.d();
            dse $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcd $$0, iz $$1, btc<?> $$2) {
         dse $$3 = $$0.a_($$1);
         return dcl.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public iz a(dcd $$0, iz $$1) {
         iz $$2 = $$1.d();
         return $$0.a_($$2).a(eom.a) ? $$2 : $$1;
      }
   };
}
