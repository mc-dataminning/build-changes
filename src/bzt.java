import com.google.common.collect.ImmutableMap;

public class bzt<T extends bvi> extends bwz<T> {
   private final float c;

   public bzt(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bvi> boolean a(T $$0) {
      return $$0.bj() && $$0.b(awv.a) > $$0.dq() || $$0.bx();
   }

   protected boolean a(arc $$0, bvi $$1) {
      return a($$1);
   }

   protected boolean a(arc $$0, bvi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arc $$0, bvi $$1, long $$2) {
      if ($$1.dZ().i() < this.c) {
         $$1.J().a();
      }
   }
}
