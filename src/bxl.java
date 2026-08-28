import javax.annotation.Nullable;

public interface bxl {
   bxk a = ($$0, $$1, $$2) -> true;
   bxk b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         jj $$3 = $$1.d();
         return $$0.b_($$1).a(axf.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bxk c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(axf.b) : false;
   bxk d = new bxk() {
      @Override
      public boolean isSpawnPositionOk(dhs $$0, jj $$1, @Nullable bwb<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            jj $$3 = $$1.d();
            jj $$4 = $$1.e();
            dym $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dhs $$0, jj $$1, bwb<?> $$2) {
         dym $$3 = $$0.a_($$1);
         return dia.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jj a(dhs $$0, jj $$1) {
         jj $$2 = $$1.e();
         return $$0.a_($$2).a(evi.a) ? $$2 : $$1;
      }
   };
}
