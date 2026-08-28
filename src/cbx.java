import javax.annotation.Nullable;

public class cbx extends cbh {
   public static final float i = 0.001F;
   protected final float j;

   public cbx(btu $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cbx(btu $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eww h() {
      if (this.b.bi()) {
         eww $$0 = cek.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dT().i() >= this.j ? cek.a(this.b, 10, 7) : super.h();
      }
   }
}
