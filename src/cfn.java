import javax.annotation.Nullable;

public class cfn extends cex {
   public static final float i = 0.001F;
   protected final float j;

   public cfn(bxm $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cfn(bxm $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected feq h() {
      if (this.b.bj()) {
         feq $$0 = cia.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dY().i() >= this.j ? cia.a(this.b, 10, 7) : super.h();
      }
   }
}
