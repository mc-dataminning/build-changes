import javax.annotation.Nullable;

public interface byd {
   byc a = ($$0, $$1, $$2) -> true;
   byc b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         iv $$3 = $$1.d();
         return $$0.b_($$1).a(axh.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   byc c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(axh.b) : false;
   byc d = new byc() {
      @Override
      public boolean isSpawnPositionOk(djp $$0, iv $$1, @Nullable bwr<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            iv $$3 = $$1.d();
            iv $$4 = $$1.e();
            eat $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(djp $$0, iv $$1, bwr<?> $$2) {
         eat $$3 = $$0.a_($$1);
         return djx.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public iv a(djp $$0, iv $$1) {
         iv $$2 = $$1.e();
         return $$0.a_($$2).a(exp.a) ? $$2 : $$1;
      }
   };
}
