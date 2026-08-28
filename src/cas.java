import com.google.common.collect.ImmutableMap;

public class cas<T extends bwh> extends bxy<T> {
   private final float c;

   public cas(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bwh> boolean a(T $$0) {
      return $$0.bj() && $$0.b(aya.a) > $$0.dp() || $$0.bx();
   }

   protected boolean a(ash $$0, bwh $$1) {
      return a($$1);
   }

   protected boolean a(ash $$0, bwh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, bwh $$1, long $$2) {
      if ($$1.dY().i() < this.c) {
         $$1.J().a();
      }
   }
}
