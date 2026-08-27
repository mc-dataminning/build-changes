import com.google.common.collect.ImmutableMap;

public class btj extends bqp<boz> {
   private final float c;

   public btj(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(boz $$0) {
      return $$0.aZ() && $$0.b(auj.a) > $$0.dc() || $$0.bn();
   }

   protected boolean a(apa $$0, boz $$1) {
      return a($$1);
   }

   protected boolean a(apa $$0, boz $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apa $$0, boz $$1, long $$2) {
      if ($$1.ef().i() < this.c) {
         $$1.M().a();
      }
   }
}
