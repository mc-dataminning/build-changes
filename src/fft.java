import javax.annotation.Nullable;

public class fft extends ffc {
   private final fep a;

   public fft(fep $$0, wu $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fer $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C() + this.x() / 2;
      int $$5 = this.D() + this.v() / 2;
      wu $$6 = this.y();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = fko.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(fja $$0) {
   }

   @Override
   public void a(grq $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public feo a(fjg $$0) {
      return null;
   }
}
