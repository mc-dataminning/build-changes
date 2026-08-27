import com.google.common.collect.ImmutableMap;

public class bot extends bma<bkl> {
   private final float c;

   public bot(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(alq $$0, bkl $$1) {
      return $$1.aX() && $$1.b(aqx.a) > $$1.de() || $$1.bl();
   }

   protected boolean a(alq $$0, bkl $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(alq $$0, bkl $$1, long $$2) {
      if ($$1.ef().i() < this.c) {
         $$1.K().a();
      }
   }
}
