import com.google.common.collect.ImmutableMap;

public class byb extends bvh<btq> {
   private final float c;

   public byb(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(btq $$0) {
      return $$0.be() && $$0.b(awu.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(are $$0, btq $$1) {
      return a($$1);
   }

   protected boolean a(are $$0, btq $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(are $$0, btq $$1, long $$2) {
      if ($$1.el().i() < this.c) {
         $$1.I().a();
      }
   }
}
