import javax.annotation.Nullable;

public class cfh extends cfi {
   public cfh(bxh $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected fdw h() {
      fdw $$0 = this.b.h(0.0F);
      int $$1 = 8;
      fdw $$2 = chu.a(this.b, 8, 7, $$0.d, $$0.f, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : chq.a(this.b, 8, 4, -2, $$0.d, $$0.f, (float) (Math.PI / 2));
   }
}
