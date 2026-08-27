import javax.annotation.Nullable;

public class evt extends evc {
   private final eur a;

   public evt(eur $$0, uv $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(eut $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p() + this.k() / 2;
      int $$5 = this.r() + this.i() / 2;
      uv $$6 = this.l();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fak.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(eyx $$0) {
   }

   @Override
   public void a(ggl $$0) {
   }

   @Override
   public boolean aM_() {
      return false;
   }

   @Nullable
   @Override
   public euq a(ezd $$0) {
      return null;
   }
}
