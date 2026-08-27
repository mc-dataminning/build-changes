import javax.annotation.Nullable;

public class bzo extends byy {
   public static final float i = 0.001F;
   protected final float j;

   public bzo(brm $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bzo(brm $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected etf h() {
      if (this.b.bf()) {
         etf $$0 = ccb.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ej().i() >= this.j ? ccb.a(this.b, 10, 7) : super.h();
      }
   }
}
