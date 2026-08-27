import com.google.common.collect.ImmutableMap;

public class bnw extends bld<bjo> {
   private final float c;

   public bnw(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(akt $$0, bjo $$1) {
      return $$1.aX() && $$1.b(aqa.a) > $$1.de() || $$1.bl();
   }

   protected boolean a(akt $$0, bjo $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akt $$0, bjo $$1, long $$2) {
      if ($$1.ef().i() < this.c) {
         $$1.K().a();
      }
   }
}
