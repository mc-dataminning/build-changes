import javax.annotation.Nullable;

public class ccx extends cch {
   public static final float i = 0.001F;
   protected final float j;

   public ccx(buv $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public ccx(buv $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eyw h() {
      if (this.b.bl()) {
         eyw $$0 = cfk.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dV().i() >= this.j ? cfk.a(this.b, 10, 7) : super.h();
      }
   }
}
