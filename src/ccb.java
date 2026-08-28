import javax.annotation.Nullable;

public class ccb extends cbl {
   public static final float i = 0.001F;
   protected final float j;

   public ccb(btz $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public ccb(btz $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected evs h() {
      if (this.b.bh()) {
         evs $$0 = ceo.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.el().i() >= this.j ? ceo.a(this.b, 10, 7) : super.h();
      }
   }
}
