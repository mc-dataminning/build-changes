import com.google.common.collect.ImmutableMap;

public class bom extends bof<bzu> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bom() {
      super(ImmutableMap.of(bvq.m, bvr.b), 100);
   }

   protected boolean a(ane $$0, bzu $$1) {
      return $$1.ap() == bna.a;
   }

   protected boolean a(ane $$0, bzu $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ane $$0, bzu $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bna.i);
         this.e = 0;
      }
   }

   protected void c(ane $$0, bzu $$1, long $$2) {
      $$1.b(bna.a);
   }

   protected void d(ane $$0, bzu $$1, long $$2) {
      this.e++;
   }
}
