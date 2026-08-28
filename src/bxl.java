import com.google.common.collect.ImmutableMap;

public class bxl extends bur<bta> {
   private final float c;

   public bxl(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bta $$0) {
      return $$0.be() && $$0.b(awa.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(aqk $$0, bta $$1) {
      return a($$1);
   }

   protected boolean a(aqk $$0, bta $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqk $$0, bta $$1, long $$2) {
      if ($$1.dS().i() < this.c) {
         $$1.I().a();
      }
   }
}
