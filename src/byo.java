import javax.annotation.Nullable;

public interface byo {
   byn a = ($$0, $$1, $$2) -> true;
   byn b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.E_().a($$1)) {
         iv $$3 = $$1.d();
         return $$0.b_($$1).a(axj.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   byn c = ($$0, $$1, $$2) -> $$2 != null && $$0.E_().a($$1) ? $$0.b_($$1).a(axj.b) : false;
   byn d = new byn() {
      @Override
      public boolean isSpawnPositionOk(dka $$0, iv $$1, @Nullable bxc<?> $$2) {
         if ($$2 != null && $$0.E_().a($$1)) {
            iv $$3 = $$1.d();
            iv $$4 = $$1.e();
            ebe $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dka $$0, iv $$1, bxc<?> $$2) {
         ebe $$3 = $$0.a_($$1);
         return dki.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public iv a(dka $$0, iv $$1) {
         iv $$2 = $$1.e();
         return $$0.a_($$2).a(eyd.a) ? $$2 : $$1;
      }
   };
}
