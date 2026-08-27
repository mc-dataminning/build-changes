import javax.annotation.Nullable;

public class eww extends ewf {
   private final evu a;

   public eww(evu $$0, vb $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(evw $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p() + this.k() / 2;
      int $$5 = this.r() + this.i() / 2;
      vb $$6 = this.l();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fbn.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(faa $$0) {
   }

   @Override
   public void a(gia $$0) {
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Nullable
   @Override
   public evt a(fag $$0) {
      return null;
   }
}
