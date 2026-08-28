import javax.annotation.Nullable;

public class cdl extends ccv {
   public static final float i = 0.001F;
   protected final float j;

   public cdl(bvi $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cdl(bvi $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ezn h() {
      if (this.b.bn()) {
         ezn $$0 = cfy.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ea().i() >= this.j ? cfy.a(this.b, 10, 7) : super.h();
      }
   }
}
