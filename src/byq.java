import javax.annotation.Nullable;

public interface byq {
   byp a = ($$0, $$1, $$2) -> true;
   byp b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.E_().a($$1)) {
         iw $$3 = $$1.d();
         return $$0.b_($$1).a(axl.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   byp c = ($$0, $$1, $$2) -> $$2 != null && $$0.E_().a($$1) ? $$0.b_($$1).a(axl.b) : false;
   byp d = new byp() {
      @Override
      public boolean isSpawnPositionOk(dkc $$0, iw $$1, @Nullable bxe<?> $$2) {
         if ($$2 != null && $$0.E_().a($$1)) {
            iw $$3 = $$1.d();
            iw $$4 = $$1.e();
            ebg $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dkc $$0, iw $$1, bxe<?> $$2) {
         ebg $$3 = $$0.a_($$1);
         return dkk.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public iw a(dkc $$0, iw $$1) {
         iw $$2 = $$1.e();
         return $$0.a_($$2).a(eyf.a) ? $$2 : $$1;
      }
   };
}
