import javax.annotation.Nullable;

public interface bvv {
   bvu a = ($$0, $$1, $$2) -> true;
   bvu b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(axg.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bvu c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(axg.b) : false;
   bvu d = new bvu() {
      @Override
      public boolean isSpawnPositionOk(dfe $$0, jh $$1, @Nullable bul<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dvj $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dfe $$0, jh $$1, bul<?> $$2) {
         dvj $$3 = $$0.a_($$1);
         return dfm.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dfe $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(erz.a) ? $$2 : $$1;
      }
   };
}
