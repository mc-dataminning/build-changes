import javax.annotation.Nullable;

public class cvn extends cuu {
   public cvn(cuu.a $$0, bpd... $$1) {
      super($$0, auv.bl, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + ($$0 - 1) * 8;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 20;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public float a(int $$0, @Nullable bpc<?> $$1) {
      return $$1 != null && $$1.a(auq.u) ? (float)$$0 * 2.5F : 0.0F;
   }
}
