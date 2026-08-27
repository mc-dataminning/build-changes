import javax.annotation.Nullable;

public class cak extends bzu {
   public static final float i = 0.001F;
   protected final float j;

   public cak(bsi $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cak(bsi $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected etp h() {
      if (this.b.bf()) {
         etp $$0 = ccx.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ej().i() >= this.j ? ccx.a(this.b, 10, 7) : super.h();
      }
   }
}
