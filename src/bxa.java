import javax.annotation.Nullable;

public interface bxa {
   bwz a = ($$0, $$1, $$2) -> true;
   bwz b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(aya.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bwz c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(aya.b) : false;
   bwz d = new bwz() {
      @Override
      public boolean isSpawnPositionOk(dhk $$0, jh $$1, @Nullable bvq<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dxu $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dhk $$0, jh $$1, bvq<?> $$2) {
         dxu $$3 = $$0.a_($$1);
         return dhs.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dhk $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(eul.a) ? $$2 : $$1;
      }
   };
}
