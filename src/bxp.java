import com.google.common.collect.ImmutableMap;

public class bxp extends buv<bte> {
   private final float c;

   public bxp(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bte $$0) {
      return $$0.bg() && $$0.b(awc.a) > $$0.dk() || $$0.bu();
   }

   protected boolean a(aqm $$0, bte $$1) {
      return a($$1);
   }

   protected boolean a(aqm $$0, bte $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, bte $$1, long $$2) {
      if ($$1.dU().i() < this.c) {
         $$1.I().a();
      }
   }
}
