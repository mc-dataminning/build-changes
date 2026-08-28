import com.google.common.collect.ImmutableMap;

public class bzv<T extends bvk> extends bxb<T> {
   private final float c;

   public bzv(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bvk> boolean a(T $$0) {
      return $$0.bj() && $$0.b(awv.a) > $$0.dp() || $$0.bx();
   }

   protected boolean a(ard $$0, bvk $$1) {
      return a($$1);
   }

   protected boolean a(ard $$0, bvk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, bvk $$1, long $$2) {
      if ($$1.dY().i() < this.c) {
         $$1.O().a();
      }
   }
}
