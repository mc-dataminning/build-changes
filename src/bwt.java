import javax.annotation.Nullable;

public interface bwt {
   bws a = ($$0, $$1, $$2) -> true;
   bws b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         ji $$3 = $$1.d();
         return $$0.b_($$1).a(awv.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bws c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(awv.b) : false;
   bws d = new bws() {
      @Override
      public boolean isSpawnPositionOk(dhc $$0, ji $$1, @Nullable bvi<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            ji $$3 = $$1.d();
            ji $$4 = $$1.e();
            dxq $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dhc $$0, ji $$1, bvi<?> $$2) {
         dxq $$3 = $$0.a_($$1);
         return dhk.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public ji a(dhc $$0, ji $$1) {
         ji $$2 = $$1.e();
         return $$0.a_($$2).a(eul.a) ? $$2 : $$1;
      }
   };
}
