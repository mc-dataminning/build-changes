import javax.annotation.Nullable;

public interface btl {
   btk a = ($$0, $$1, $$2) -> true;
   btk b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         io $$3 = $$1.c();
         return $$0.b_($$1).a(awc.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   btk c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awc.b) : false;
   btk d = new btk() {
      @Override
      public boolean isSpawnPositionOk(dbc $$0, io $$1, @Nullable bsc<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            io $$3 = $$1.c();
            io $$4 = $$1.d();
            drd $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dbc $$0, io $$1, bsc<?> $$2) {
         drd $$3 = $$0.a_($$1);
         return dbk.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public io a(dbc $$0, io $$1) {
         io $$2 = $$1.d();
         return $$0.a_($$2).a(enl.a) ? $$2 : $$1;
      }
   };
}
