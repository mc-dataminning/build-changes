import javax.annotation.Nullable;

public class cgd extends cfn {
   public static final float i = 0.001F;
   protected final float j;

   public cgd(byc $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cgd(byc $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ffq h() {
      if (this.b.bi()) {
         ffq $$0 = ciq.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dY().i() >= this.j ? ciq.a(this.b, 10, 7) : super.h();
      }
   }
}
