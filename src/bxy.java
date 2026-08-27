import javax.annotation.Nullable;

public class bxy extends bxi {
   public static final float i = 0.001F;
   protected final float j;

   public bxy(bpw $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bxy(bpw $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected epr h() {
      if (this.b.bf()) {
         epr $$0 = cal.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ei().i() >= this.j ? cal.a(this.b, 10, 7) : super.h();
      }
   }
}
