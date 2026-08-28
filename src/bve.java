import javax.annotation.Nullable;

public interface bve {
   bvd a = ($$0, $$1, $$2) -> true;
   bvd b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         je $$3 = $$1.d();
         return $$0.b_($$1).a(awz.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bvd c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(awz.b) : false;
   bvd d = new bvd() {
      @Override
      public boolean isSpawnPositionOk(dej $$0, je $$1, @Nullable btv<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            je $$3 = $$1.d();
            je $$4 = $$1.e();
            duo $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dej $$0, je $$1, btv<?> $$2) {
         duo $$3 = $$0.a_($$1);
         return der.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public je a(dej $$0, je $$1) {
         je $$2 = $$1.e();
         return $$0.a_($$2).a(ere.a) ? $$2 : $$1;
      }
   };
}
