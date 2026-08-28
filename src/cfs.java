import javax.annotation.Nullable;

public class cfs extends cfc {
   public static final float i = 0.001F;
   protected final float j;

   public cfs(bxr $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cfs(bxr $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fex h() {
      if (this.b.bh()) {
         fex $$0 = cif.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dX().i() >= this.j ? cif.a(this.b, 10, 7) : super.h();
      }
   }
}
