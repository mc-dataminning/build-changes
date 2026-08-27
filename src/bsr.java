import javax.annotation.Nullable;

public class bsr extends bsb {
   public static final float i = 0.001F;
   protected final float j;

   public bsr(bks $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bsr(bks $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eif h() {
      if (this.b.ba()) {
         eif $$0 = bvc.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ef().i() >= this.j ? bvc.a(this.b, 10, 7) : super.h();
      }
   }
}
