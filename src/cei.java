import javax.annotation.Nullable;

public class cei extends cds {
   public static final float i = 0.001F;
   protected final float j;

   public cei(bwf $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cei(bwf $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fbr h() {
      if (this.b.bm()) {
         fbr $$0 = cgv.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dZ().i() >= this.j ? cgv.a(this.b, 10, 7) : super.h();
      }
   }
}
