import javax.annotation.Nullable;

public interface bwc {
   bwb a = ($$0, $$1, $$2) -> true;
   bwb b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.E_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(axi.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bwb c = ($$0, $$1, $$2) -> $$2 != null && $$0.E_().a($$1) ? $$0.b_($$1).a(axi.b) : false;
   bwb d = new bwb() {
      @Override
      public boolean isSpawnPositionOk(dfp $$0, jh $$1, @Nullable bus<?> $$2) {
         if ($$2 != null && $$0.E_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dvv $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dfp $$0, jh $$1, bus<?> $$2) {
         dvv $$3 = $$0.a_($$1);
         return dfx.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dfp $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(esk.a) ? $$2 : $$1;
      }
   };
}
