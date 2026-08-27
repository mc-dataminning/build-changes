import javax.annotation.Nullable;

public class buo extends bty {
   public static final float i = 0.001F;
   protected final float j;

   public buo(bmo $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public buo(bmo $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected elm h() {
      if (this.b.bc()) {
         elm $$0 = bxa.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eg().i() >= this.j ? bxa.a(this.b, 10, 7) : super.h();
      }
   }
}
