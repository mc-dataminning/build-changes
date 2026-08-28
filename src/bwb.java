import javax.annotation.Nullable;

public interface bwb {
   bwa a = ($$0, $$1, $$2) -> true;
   bwa b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         ji $$3 = $$1.d();
         return $$0.b_($$1).a(awv.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bwa c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(awv.b) : false;
   bwa d = new bwa() {
      @Override
      public boolean isSpawnPositionOk(dgl $$0, ji $$1, @Nullable bur<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            ji $$3 = $$1.d();
            ji $$4 = $$1.e();
            dwx $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dgl $$0, ji $$1, bur<?> $$2) {
         dwx $$3 = $$0.a_($$1);
         return dgt.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public ji a(dgl $$0, ji $$1) {
         ji $$2 = $$1.e();
         return $$0.a_($$2).a(eto.a) ? $$2 : $$1;
      }
   };
}
