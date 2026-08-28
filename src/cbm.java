import javax.annotation.Nullable;

public class cbm extends caw {
   public static final float i = 0.001F;
   protected final float j;

   public cbm(btk $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cbm(btk $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ewf h() {
      if (this.b.bi()) {
         ewf $$0 = cdz.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dT().i() >= this.j ? cdz.a(this.b, 10, 7) : super.h();
      }
   }
}
