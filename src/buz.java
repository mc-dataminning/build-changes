import javax.annotation.Nullable;

public interface buz {
   buy a = ($$0, $$1, $$2) -> true;
   buy b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         je $$3 = $$1.d();
         return $$0.b_($$1).a(awy.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   buy c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(awy.b) : false;
   buy d = new buy() {
      @Override
      public boolean isSpawnPositionOk(ddv $$0, je $$1, @Nullable btq<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            je $$3 = $$1.d();
            je $$4 = $$1.e();
            dua $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(ddv $$0, je $$1, btq<?> $$2) {
         dua $$3 = $$0.a_($$1);
         return ded.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public je a(ddv $$0, je $$1) {
         je $$2 = $$1.e();
         return $$0.a_($$2).a(eqq.a) ? $$2 : $$1;
      }
   };
}
