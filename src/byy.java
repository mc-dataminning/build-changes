import javax.annotation.Nullable;

public class byy extends byi {
   public static final float i = 0.001F;
   protected final float j;

   public byy(bqw $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public byy(bqw $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected esa h() {
      if (this.b.bf()) {
         esa $$0 = cbl.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ei().i() >= this.j ? cbl.a(this.b, 10, 7) : super.h();
      }
   }
}
