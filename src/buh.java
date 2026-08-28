import javax.annotation.Nullable;

public interface buh {
   bug a = ($$0, $$1, $$2) -> true;
   bug b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         jd $$3 = $$1.c();
         return $$0.b_($$1).a(awj.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bug c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awj.b) : false;
   bug d = new bug() {
      @Override
      public boolean isSpawnPositionOk(dcx $$0, jd $$1, @Nullable bsw<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            jd $$3 = $$1.c();
            jd $$4 = $$1.d();
            dta $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcx $$0, jd $$1, bsw<?> $$2) {
         dta $$3 = $$0.a_($$1);
         return ddf.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public jd a(dcx $$0, jd $$1) {
         jd $$2 = $$1.d();
         return $$0.a_($$2).a(epn.a) ? $$2 : $$1;
      }
   };
}
