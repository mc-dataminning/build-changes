import javax.annotation.Nullable;

public interface bxb {
   bxa a = ($$0, $$1, $$2) -> true;
   bxa b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(aya.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bxa c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(aya.b) : false;
   bxa d = new bxa() {
      @Override
      public boolean isSpawnPositionOk(dhl $$0, jh $$1, @Nullable bvr<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dxv $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dhl $$0, jh $$1, bvr<?> $$2) {
         dxv $$3 = $$0.a_($$1);
         return dht.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dhl $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(eum.a) ? $$2 : $$1;
      }
   };
}
