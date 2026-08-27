import com.google.common.collect.ImmutableMap;

public class bnh extends bko<biy> {
   private final float c;

   public bnh(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(aki $$0, biy $$1) {
      return $$1.aX() && $$1.b(apo.a) > $$1.de() || $$1.bl();
   }

   protected boolean a(aki $$0, biy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aki $$0, biy $$1, long $$2) {
      if ($$1.ee().i() < this.c) {
         $$1.F().a();
      }
   }
}
