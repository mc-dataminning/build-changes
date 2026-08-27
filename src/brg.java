import javax.annotation.Nullable;

public class brg extends bqq {
   public static final float i = 0.001F;
   protected final float j;

   public brg(bjh $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public brg(bjh $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehd h() {
      if (this.b.ba()) {
         ehd $$0 = btr.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ee().i() >= this.j ? btr.a(this.b, 10, 7) : super.h();
      }
   }
}
