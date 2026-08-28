import javax.annotation.Nullable;

public class cdq extends cda {
   public static final float i = 0.001F;
   protected final float j;

   public cdq(bvn $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cdq(bvn $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fay h() {
      if (this.b.bm()) {
         fay $$0 = cgd.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dZ().i() >= this.j ? cgd.a(this.b, 10, 7) : super.h();
      }
   }
}
