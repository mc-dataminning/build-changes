import javax.annotation.Nullable;

public class cbn extends cax {
   public static final float i = 0.001F;
   protected final float j;

   public cbn(btl $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cbn(btl $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ewh h() {
      if (this.b.bj()) {
         ewh $$0 = cea.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dU().i() >= this.j ? cea.a(this.b, 10, 7) : super.h();
      }
   }
}
