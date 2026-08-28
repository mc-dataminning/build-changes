import javax.annotation.Nullable;

public class evd implements eve {
   private final dhi b;

   public evd(dhi $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jm $$0, dxv $$1, jh $$2, jh $$3, int $$4, int $$5) {
      eve.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(jh $$0, dkm $$1, @Nullable evf $$2) {
      dxv $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dxv $$0, jh $$1, dkm $$2, @Nullable evf $$3, boolean $$4) {
      eve.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
