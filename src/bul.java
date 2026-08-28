import javax.annotation.Nullable;

public interface bul {
   buk a = ($$0, $$1, $$2) -> true;
   buk b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         iz $$3 = $$1.c();
         return $$0.b_($$1).a(awv.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   buk c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awv.b) : false;
   buk d = new buk() {
      @Override
      public boolean isSpawnPositionOk(dcc $$0, iz $$1, @Nullable btb<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            iz $$3 = $$1.c();
            iz $$4 = $$1.d();
            dsd $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcc $$0, iz $$1, btb<?> $$2) {
         dsd $$3 = $$0.a_($$1);
         return dck.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public iz a(dcc $$0, iz $$1) {
         iz $$2 = $$1.d();
         return $$0.a_($$2).a(eol.a) ? $$2 : $$1;
      }
   };
}
