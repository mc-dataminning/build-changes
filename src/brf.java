import javax.annotation.Nullable;

public class brf extends bqp {
   public static final float i = 0.001F;
   protected final float j;

   public brf(bjf $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public brf(bjf $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehf h() {
      if (this.b.ba()) {
         ehf $$0 = btq.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ee().i() >= this.j ? btq.a(this.b, 10, 7) : super.h();
      }
   }
}
