import javax.annotation.Nullable;

public class btt extends btd {
   public static final float i = 0.001F;
   protected final float j;

   public btt(blu $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public btt(blu $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ejz h() {
      if (this.b.bc()) {
         ejz $$0 = bwe.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eh().i() >= this.j ? bwe.a(this.b, 10, 7) : super.h();
      }
   }
}
