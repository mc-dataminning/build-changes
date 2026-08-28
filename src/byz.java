import javax.annotation.Nullable;

public interface byz {
   byy a = ($$0, $$1, $$2) -> true;
   byy b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.E_().a($$1)) {
         iw $$3 = $$1.d();
         return $$0.b_($$1).a(axs.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   byy c = ($$0, $$1, $$2) -> $$2 != null && $$0.E_().a($$1) ? $$0.b_($$1).a(axs.b) : false;
   byy d = new byy() {
      @Override
      public boolean isSpawnPositionOk(dkm $$0, iw $$1, @Nullable bxn<?> $$2) {
         if ($$2 != null && $$0.E_().a($$1)) {
            iw $$3 = $$1.d();
            iw $$4 = $$1.e();
            ebq $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dkm $$0, iw $$1, bxn<?> $$2) {
         ebq $$3 = $$0.a_($$1);
         return dku.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public iw a(dkm $$0, iw $$1) {
         iw $$2 = $$1.e();
         return $$0.a_($$2).a(eyp.a) ? $$2 : $$1;
      }
   };
}
