import javax.annotation.Nullable;

public class ccp extends cbz {
   public static final float i = 0.001F;
   protected final float j;

   public ccp(bun $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public ccp(bun $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eye h() {
      if (this.b.bl()) {
         eye $$0 = cfc.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dV().i() >= this.j ? cfc.a(this.b, 10, 7) : super.h();
      }
   }
}
