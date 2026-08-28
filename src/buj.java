import javax.annotation.Nullable;

public interface buj {
   bui a = ($$0, $$1, $$2) -> true;
   bui b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.C_().a($$1)) {
         jd $$3 = $$1.d();
         return $$0.b_($$1).a(awk.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bui c = ($$0, $$1, $$2) -> $$2 != null && $$0.C_().a($$1) ? $$0.b_($$1).a(awk.b) : false;
   bui d = new bui() {
      @Override
      public boolean isSpawnPositionOk(dcz $$0, jd $$1, @Nullable bsx<?> $$2) {
         if ($$2 != null && $$0.C_().a($$1)) {
            jd $$3 = $$1.d();
            jd $$4 = $$1.e();
            dtc $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dcz $$0, jd $$1, bsx<?> $$2) {
         dtc $$3 = $$0.a_($$1);
         return ddh.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public jd a(dcz $$0, jd $$1) {
         jd $$2 = $$1.e();
         return $$0.a_($$2).a(ept.a) ? $$2 : $$1;
      }
   };
}
