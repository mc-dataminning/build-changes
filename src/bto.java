import javax.annotation.Nullable;

public class bto extends bsy {
   public static final float i = 0.001F;
   protected final float j;

   public bto(blp $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bto(blp $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eju h() {
      if (this.b.bc()) {
         eju $$0 = bvz.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eh().i() >= this.j ? bvz.a(this.b, 10, 7) : super.h();
      }
   }
}
