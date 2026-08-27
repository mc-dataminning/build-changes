import javax.annotation.Nullable;

public class bzd extends byn {
   public static final float i = 0.001F;
   protected final float j;

   public bzd(brb $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bzd(brb $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected esj h() {
      if (this.b.bf()) {
         esj $$0 = cbq.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ei().i() >= this.j ? cbq.a(this.b, 10, 7) : super.h();
      }
   }
}
