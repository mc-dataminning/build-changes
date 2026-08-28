import javax.annotation.Nullable;

public class cdg extends ccq {
   public static final float i = 0.001F;
   protected final float j;

   public cdg(bvd $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cdg(bvd $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ezh h() {
      if (this.b.bn()) {
         ezh $$0 = cft.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ea().i() >= this.j ? cft.a(this.b, 10, 7) : super.h();
      }
   }
}
