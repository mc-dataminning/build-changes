import javax.annotation.Nullable;

public interface bww {
   bwv a = ($$0, $$1, $$2) -> true;
   bwv b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(aya.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bwv c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(aya.b) : false;
   bwv d = new bwv() {
      @Override
      public boolean isSpawnPositionOk(dhd $$0, jh $$1, @Nullable bvm<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dxn $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dhd $$0, jh $$1, bvm<?> $$2) {
         dxn $$3 = $$0.a_($$1);
         return dhl.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dhd $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(eue.a) ? $$2 : $$1;
      }
   };
}
