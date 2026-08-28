import javax.annotation.Nullable;

public class cfl extends cev {
   public static final float i = 0.001F;
   protected final float j;

   public cfl(bxk $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cfl(bxk $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fei h() {
      if (this.b.bj()) {
         fei $$0 = chy.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dY().i() >= this.j ? chy.a(this.b, 10, 7) : super.h();
      }
   }
}
