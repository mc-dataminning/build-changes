import javax.annotation.Nullable;

public class cbj extends cat {
   public static final float i = 0.001F;
   protected final float j;

   public cbj(bth $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cbj(bth $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected evz h() {
      if (this.b.bh()) {
         evz $$0 = cdw.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dS().i() >= this.j ? cdw.a(this.b, 10, 7) : super.h();
      }
   }
}
