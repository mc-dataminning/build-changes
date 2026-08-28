import javax.annotation.Nullable;

public class cbz extends cbj {
   public static final float i = 0.001F;
   protected final float j;

   public cbz(btw $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cbz(btw $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected exa h() {
      if (this.b.bi()) {
         exa $$0 = cem.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dS().i() >= this.j ? cem.a(this.b, 10, 7) : super.h();
      }
   }
}
