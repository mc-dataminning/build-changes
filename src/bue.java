import javax.annotation.Nullable;

public class bue extends bto {
   public static final float i = 0.001F;
   protected final float j;

   public bue(bme $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bue(bme $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected elb h() {
      if (this.b.bc()) {
         elb $$0 = bwq.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eg().i() >= this.j ? bwq.a(this.b, 10, 7) : super.h();
      }
   }
}
