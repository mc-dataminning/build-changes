import javax.annotation.Nullable;

public interface bxt {
   bxs a = ($$0, $$1, $$2) -> true;
   bxs b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.A_().a($$1)) {
         iu $$3 = $$1.d();
         return $$0.b_($$1).a(axf.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   bxs c = ($$0, $$1, $$2) -> $$2 != null && $$0.A_().a($$1) ? $$0.b_($$1).a(axf.b) : false;
   bxs d = new bxs() {
      @Override
      public boolean isSpawnPositionOk(dis $$0, iu $$1, @Nullable bwj<?> $$2) {
         if ($$2 != null && $$0.A_().a($$1)) {
            iu $$3 = $$1.d();
            iu $$4 = $$1.e();
            dzo $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dis $$0, iu $$1, bwj<?> $$2) {
         dzo $$3 = $$0.a_($$1);
         return dja.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public iu a(dis $$0, iu $$1) {
         iu $$2 = $$1.e();
         return $$0.a_($$2).a(ewk.a) ? $$2 : $$1;
      }
   };
}
