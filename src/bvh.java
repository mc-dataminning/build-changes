import javax.annotation.Nullable;

public interface bvh {
   bvg a = ($$0, $$1, $$2) -> true;
   bvg b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.B_().a($$1)) {
         jf $$3 = $$1.d();
         return $$0.b_($$1).a(axb.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bvg c = ($$0, $$1, $$2) -> $$2 != null && $$0.B_().a($$1) ? $$0.b_($$1).a(axb.b) : false;
   bvg d = new bvg() {
      @Override
      public boolean isSpawnPositionOk(dem $$0, jf $$1, @Nullable bty<?> $$2) {
         if ($$2 != null && $$0.B_().a($$1)) {
            jf $$3 = $$1.d();
            jf $$4 = $$1.e();
            dus $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dem $$0, jf $$1, bty<?> $$2) {
         dus $$3 = $$0.a_($$1);
         return deu.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jf a(dem $$0, jf $$1) {
         jf $$2 = $$1.e();
         return $$0.a_($$2).a(eri.a) ? $$2 : $$1;
      }
   };
}
