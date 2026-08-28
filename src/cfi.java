import javax.annotation.Nullable;

public class cfi extends ces {
   public static final float i = 0.001F;
   protected final float j;

   public cfi(bxh $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cfi(bxh $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fdw h() {
      if (this.b.bj()) {
         fdw $$0 = chv.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dY().i() >= this.j ? chv.a(this.b, 10, 7) : super.h();
      }
   }
}
