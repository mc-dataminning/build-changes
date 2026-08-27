import javax.annotation.Nullable;

public class boi extends bns {
   public static final float i = 0.001F;
   protected final float j;

   public boi(bgi $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public boi(bgi $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eei h() {
      if (this.b.aY()) {
         eei $$0 = bqt.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ec().i() >= this.j ? bqt.a(this.b, 10, 7) : super.h();
      }
   }
}
