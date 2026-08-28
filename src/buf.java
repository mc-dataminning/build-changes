import javax.annotation.Nullable;

public interface buf {
   bue a = ($$0, $$1, $$2) -> true;
   bue b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         iz $$3 = $$1.c();
         return $$0.b_($$1).a(awr.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bue c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awr.b) : false;
   bue d = new bue() {
      @Override
      public boolean isSpawnPositionOk(dbw $$0, iz $$1, @Nullable bsv<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            iz $$3 = $$1.c();
            iz $$4 = $$1.d();
            drx $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dbw $$0, iz $$1, bsv<?> $$2) {
         drx $$3 = $$0.a_($$1);
         return dce.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public iz a(dbw $$0, iz $$1) {
         iz $$2 = $$1.d();
         return $$0.a_($$2).a(eof.a) ? $$2 : $$1;
      }
   };
}
