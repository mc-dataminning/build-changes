import javax.annotation.Nullable;

public interface bwa {
   bvz a = ($$0, $$1, $$2) -> true;
   bvz b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         ji $$3 = $$1.d();
         return $$0.b_($$1).a(awu.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bvz c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(awu.b) : false;
   bvz d = new bvz() {
      @Override
      public boolean isSpawnPositionOk(dgj $$0, ji $$1, @Nullable buq<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            ji $$3 = $$1.d();
            ji $$4 = $$1.e();
            dwv $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dgj $$0, ji $$1, buq<?> $$2) {
         dwv $$3 = $$0.a_($$1);
         return dgr.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public ji a(dgj $$0, ji $$1) {
         ji $$2 = $$1.e();
         return $$0.a_($$2).a(etm.a) ? $$2 : $$1;
      }
   };
}
