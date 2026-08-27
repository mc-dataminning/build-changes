import javax.annotation.Nullable;

public interface brn {
   brm a = ($$0, $$1, $$2) -> true;
   brm b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         id $$3 = $$1.c();
         return $$0.b_($$1).a(avj.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   brm c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(avj.b) : false;
   brm d = new brm() {
      @Override
      public boolean isSpawnPositionOk(czj $$0, id $$1, @Nullable bqg<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            id $$3 = $$1.c();
            id $$4 = $$1.d();
            dpi $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(czj $$0, id $$1, bqg<?> $$2) {
         dpi $$3 = $$0.a_($$1);
         return czr.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public id a(czj $$0, id $$1) {
         id $$2 = $$1.d();
         return $$0.a_($$2).a(elq.a) ? $$2 : $$1;
      }
   };
}
