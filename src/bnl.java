import com.google.common.collect.ImmutableMap;

public class bnl extends bks<bjd> {
   private final float c;

   public bnl(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(akn $$0, bjd $$1) {
      return $$1.aX() && $$1.b(apt.a) > $$1.de() || $$1.bl();
   }

   protected boolean a(akn $$0, bjd $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akn $$0, bjd $$1, long $$2) {
      if ($$1.ee().i() < this.c) {
         $$1.F().a();
      }
   }
}
