import javax.annotation.Nullable;

public class cfr extends cfs {
   public cfr(bxr $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ffc h() {
      ffc $$0 = this.b.h(0.0F);
      int $$1 = 8;
      ffc $$2 = cie.a(this.b, 8, 7, $$0.d, $$0.f, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : cia.a(this.b, 8, 4, -2, $$0.d, $$0.f, (float) (Math.PI / 2));
   }
}
