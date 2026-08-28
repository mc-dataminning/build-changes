import javax.annotation.Nullable;

public class cdp extends ccz {
   public static final float i = 0.001F;
   protected final float j;

   public cdp(bvm $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cdp(bvm $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ezr h() {
      if (this.b.bo()) {
         ezr $$0 = cgc.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.eb().i() >= this.j ? cgc.a(this.b, 10, 7) : super.h();
      }
   }
}
