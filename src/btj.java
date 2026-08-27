import javax.annotation.Nullable;

public interface btj {
   bti a = ($$0, $$1, $$2) -> true;
   bti b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         io $$3 = $$1.c();
         return $$0.b_($$1).a(awb.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bti c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awb.b) : false;
   bti d = new bti() {
      @Override
      public boolean isSpawnPositionOk(dba $$0, io $$1, @Nullable bsa<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            io $$3 = $$1.c();
            io $$4 = $$1.d();
            drb $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dba $$0, io $$1, bsa<?> $$2) {
         drb $$3 = $$0.a_($$1);
         return dbi.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public io a(dba $$0, io $$1) {
         io $$2 = $$1.d();
         return $$0.a_($$2).a(enj.a) ? $$2 : $$1;
      }
   };
}
