import com.google.common.collect.ImmutableMap;

public class bnq extends bkx<bji> {
   private final float c;

   public bnq(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(akq $$0, bji $$1) {
      return $$1.aX() && $$1.b(apx.a) > $$1.de() || $$1.bl();
   }

   protected boolean a(akq $$0, bji $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akq $$0, bji $$1, long $$2) {
      if ($$1.ef().i() < this.c) {
         $$1.K().a();
      }
   }
}
