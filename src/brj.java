import javax.annotation.Nullable;

public class brj extends bqt {
   public static final float i = 0.001F;
   protected final float j;

   public brj(bjk $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public brj(bjk $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehi h() {
      if (this.b.ba()) {
         ehi $$0 = btu.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ee().i() >= this.j ? btu.a(this.b, 10, 7) : super.h();
      }
   }
}
