import javax.annotation.Nullable;

public class cby extends cbi {
   public static final float i = 0.001F;
   protected final float j;

   public cby(btw $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cby(btw $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected evp h() {
      if (this.b.bh()) {
         evp $$0 = cel.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.el().i() >= this.j ? cel.a(this.b, 10, 7) : super.h();
      }
   }
}
