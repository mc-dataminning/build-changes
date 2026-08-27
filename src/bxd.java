import com.google.common.collect.ImmutableMap;

public class bxd extends buj<bss> {
   private final float c;

   public bxd(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bss $$0) {
      return $$0.be() && $$0.b(awc.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(aqn $$0, bss $$1) {
      return a($$1);
   }

   protected boolean a(aqn $$0, bss $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqn $$0, bss $$1, long $$2) {
      if ($$1.el().i() < this.c) {
         $$1.I().a();
      }
   }
}
