import javax.annotation.Nullable;

public interface buj {
   bui a = ($$0, $$1, $$2) -> true;
   bui b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         iz $$3 = $$1.c();
         return $$0.b_($$1).a(awu.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bui c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awu.b) : false;
   bui d = new bui() {
      @Override
      public boolean isSpawnPositionOk(dca $$0, iz $$1, @Nullable bsz<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            iz $$3 = $$1.c();
            iz $$4 = $$1.d();
            dsb $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dca $$0, iz $$1, bsz<?> $$2) {
         dsb $$3 = $$0.a_($$1);
         return dci.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public iz a(dca $$0, iz $$1) {
         iz $$2 = $$1.d();
         return $$0.a_($$2).a(eoj.a) ? $$2 : $$1;
      }
   };
}
