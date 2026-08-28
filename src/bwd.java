import javax.annotation.Nullable;

public interface bwd {
   bwc a = ($$0, $$1, $$2) -> true;
   bwc b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         ji $$3 = $$1.d();
         return $$0.b_($$1).a(awv.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bwc c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(awv.b) : false;
   bwc d = new bwc() {
      @Override
      public boolean isSpawnPositionOk(dgm $$0, ji $$1, @Nullable but<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            ji $$3 = $$1.d();
            ji $$4 = $$1.e();
            dwy $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dgm $$0, ji $$1, but<?> $$2) {
         dwy $$3 = $$0.a_($$1);
         return dgu.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public ji a(dgm $$0, ji $$1) {
         ji $$2 = $$1.e();
         return $$0.a_($$2).a(etp.a) ? $$2 : $$1;
      }
   };
}
