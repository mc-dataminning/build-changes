import javax.annotation.Nullable;

public class buu extends bue {
   public static final float i = 0.001F;
   protected final float j;

   public buu(bmu $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public buu(bmu $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected elt h() {
      if (this.b.bc()) {
         elt $$0 = bxg.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eg().i() >= this.j ? bxg.a(this.b, 10, 7) : super.h();
      }
   }
}
