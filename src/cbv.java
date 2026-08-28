import javax.annotation.Nullable;

public class cbv extends cbf {
   public static final float i = 0.001F;
   protected final float j;

   public cbv(btt $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cbv(btt $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected evm h() {
      if (this.b.bh()) {
         evm $$0 = cei.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.el().i() >= this.j ? cei.a(this.b, 10, 7) : super.h();
      }
   }
}
