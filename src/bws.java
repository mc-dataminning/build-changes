import javax.annotation.Nullable;

public interface bws {
   bwr a = ($$0, $$1, $$2) -> true;
   bwr b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(axq.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bwr c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(axq.b) : false;
   bwr d = new bwr() {
      @Override
      public boolean isSpawnPositionOk(dhc $$0, jh $$1, @Nullable bvi<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dxo $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dhc $$0, jh $$1, bvi<?> $$2) {
         dxo $$3 = $$0.a_($$1);
         return dhk.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dhc $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(euf.a) ? $$2 : $$1;
      }
   };
}
