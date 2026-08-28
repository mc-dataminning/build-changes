import com.google.common.collect.ImmutableMap;

public class bxx extends bvd<btm> {
   private final float c;

   public bxx(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(btm $$0) {
      return $$0.be() && $$0.b(awr.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(arb $$0, btm $$1) {
      return a($$1);
   }

   protected boolean a(arb $$0, btm $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arb $$0, btm $$1, long $$2) {
      if ($$1.el().i() < this.c) {
         $$1.I().a();
      }
   }
}
