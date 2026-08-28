import com.google.common.collect.ImmutableMap;

public class bzs<T extends bvh> extends bwy<T> {
   private final float c;

   public bzs(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bvh> boolean a(T $$0) {
      return $$0.bj() && $$0.b(awu.a) > $$0.dq() || $$0.bx();
   }

   protected boolean a(arc $$0, bvh $$1) {
      return a($$1);
   }

   protected boolean a(arc $$0, bvh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arc $$0, bvh $$1, long $$2) {
      if ($$1.dZ().i() < this.c) {
         $$1.J().a();
      }
   }
}
