import javax.annotation.Nullable;

public interface bvz {
   bvy a = ($$0, $$1, $$2) -> true;
   bvy b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         jh $$3 = $$1.d();
         return $$0.b_($$1).a(axj.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bvy c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(axj.b) : false;
   bvy d = new bvy() {
      @Override
      public boolean isSpawnPositionOk(dfi $$0, jh $$1, @Nullable bup<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            jh $$3 = $$1.d();
            jh $$4 = $$1.e();
            dvo $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dfi $$0, jh $$1, bup<?> $$2) {
         dvo $$3 = $$0.a_($$1);
         return dfq.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jh a(dfi $$0, jh $$1) {
         jh $$2 = $$1.e();
         return $$0.a_($$2).a(esd.a) ? $$2 : $$1;
      }
   };
}
