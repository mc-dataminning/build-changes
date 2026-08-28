import com.google.common.collect.ImmutableMap;

public class bvq extends bvj<cha> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvq() {
      super(ImmutableMap.of(ccu.m, ccv.b), 100);
   }

   protected boolean a(arf $$0, cha $$1) {
      return $$1.ar() == buc.a;
   }

   protected boolean a(arf $$0, cha $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arf $$0, cha $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(buc.i);
         this.e = 0;
      }
   }

   protected void c(arf $$0, cha $$1, long $$2) {
      $$1.b(buc.a);
   }

   protected void d(arf $$0, cha $$1, long $$2) {
      this.e++;
   }
}
