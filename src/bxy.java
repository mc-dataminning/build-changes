import javax.annotation.Nullable;

public interface bxy {
   bxx a = ($$0, $$1, $$2) -> true;
   bxx b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         iu $$3 = $$1.d();
         return $$0.b_($$1).a(axh.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bxx c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(axh.b) : false;
   bxx d = new bxx() {
      @Override
      public boolean isSpawnPositionOk(djd $$0, iu $$1, @Nullable bwo<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            iu $$3 = $$1.d();
            iu $$4 = $$1.e();
            eah $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(djd $$0, iu $$1, bwo<?> $$2) {
         eah $$3 = $$0.a_($$1);
         return djl.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public iu a(djd $$0, iu $$1) {
         iu $$2 = $$1.e();
         return $$0.a_($$2).a(exd.a) ? $$2 : $$1;
      }
   };
}
