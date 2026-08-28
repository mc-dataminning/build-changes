import javax.annotation.Nullable;

public interface bvq {
   bvp a = ($$0, $$1, $$2) -> true;
   bvp b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         jg $$3 = $$1.d();
         return $$0.b_($$1).a(axf.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bvp c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(axf.b) : false;
   bvp d = new bvp() {
      @Override
      public boolean isSpawnPositionOk(dey $$0, jg $$1, @Nullable bug<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            jg $$3 = $$1.d();
            jg $$4 = $$1.e();
            dvd $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dey $$0, jg $$1, bug<?> $$2) {
         dvd $$3 = $$0.a_($$1);
         return dfg.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jg a(dey $$0, jg $$1) {
         jg $$2 = $$1.e();
         return $$0.a_($$2).a(ert.a) ? $$2 : $$1;
      }
   };
}
