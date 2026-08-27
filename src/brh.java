import javax.annotation.Nullable;

public class brh extends bqr {
   public static final float i = 0.001F;
   protected final float j;

   public brh(bjh $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public brh(bjh $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehe h() {
      if (this.b.ba()) {
         ehe $$0 = bts.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ee().i() >= this.j ? bts.a(this.b, 10, 7) : super.h();
      }
   }
}
