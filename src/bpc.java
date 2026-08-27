import javax.annotation.Nullable;

public interface bpc {
   bpb a = ($$0, $$1, $$2) -> true;
   bpb b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.D_().a($$1)) {
         hz $$3 = $$1.c();
         return $$0.b_($$1).a(auf.a) && !$$0.a_($$3).g($$0, $$3);
      } else {
         return false;
      }
   };
   bpb c = ($$0, $$1, $$2) -> $$2 != null && $$0.D_().a($$1) ? $$0.b_($$1).a(auf.b) : false;
   bpb d = new bpb() {
      @Override
      public boolean isSpawnPositionOk(cvu $$0, hz $$1, @Nullable bnw<?> $$2) {
         if ($$2 != null && $$0.D_().a($$1)) {
            hz $$3 = $$1.c();
            hz $$4 = $$1.d();
            dlj $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(cvu $$0, hz $$1, bnw<?> $$2) {
         dlj $$3 = $$0.a_($$1);
         return cwc.a($$0, $$1, $$3, $$3.u(), $$2);
      }

      @Override
      public hz a(cvu $$0, hz $$1) {
         hz $$2 = $$1.d();
         return $$0.a_($$2).a($$0, $$2, ehm.a) ? $$2 : $$1;
      }
   };
}
