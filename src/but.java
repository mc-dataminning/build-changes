import javax.annotation.Nullable;

public class but extends bud {
   public static final float i = 0.001F;
   protected final float j;

   public but(bmt $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public but(bmt $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected els h() {
      if (this.b.bc()) {
         els $$0 = bxf.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eg().i() >= this.j ? bxf.a(this.b, 10, 7) : super.h();
      }
   }
}
