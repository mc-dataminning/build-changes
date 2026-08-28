import javax.annotation.Nullable;

public class cgo extends cfy {
   public static final float i = 0.001F;
   protected final float j;

   public cgo(byn $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cgo(byn $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fgc h() {
      if (this.b.bi()) {
         fgc $$0 = cjb.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dY().i() >= this.j ? cjb.a(this.b, 10, 7) : super.h();
      }
   }
}
