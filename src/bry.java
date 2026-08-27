import javax.annotation.Nullable;

public interface bry {
   brx a = ($$0, $$1, $$2) -> true;
   brx b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         im $$3 = $$1.c();
         return $$0.b_($$1).a(avt.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   brx c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(avt.b) : false;
   brx d = new brx() {
      @Override
      public boolean isSpawnPositionOk(czx $$0, im $$1, @Nullable bqr<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            im $$3 = $$1.c();
            im $$4 = $$1.d();
            dpy $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(czx $$0, im $$1, bqr<?> $$2) {
         dpy $$3 = $$0.a_($$1);
         return daf.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public im a(czx $$0, im $$1) {
         im $$2 = $$1.d();
         return $$0.a_($$2).a(emg.a) ? $$2 : $$1;
      }
   };
}
