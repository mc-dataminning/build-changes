import com.google.common.collect.ImmutableMap;

public class byc extends bvi<btr> {
   private final float c;

   public byc(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(btr $$0) {
      return $$0.be() && $$0.b(awv.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(arf $$0, btr $$1) {
      return a($$1);
   }

   protected boolean a(arf $$0, btr $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, btr $$1, long $$2) {
      if ($$1.el().i() < this.c) {
         $$1.I().a();
      }
   }
}
