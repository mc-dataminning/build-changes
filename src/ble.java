import com.google.common.collect.ImmutableMap;

public class ble extends bkx<bwg> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public ble() {
      super(ImmutableMap.of(bsh.m, bsi.b), 100);
   }

   protected boolean a(akr $$0, bwg $$1) {
      return $$1.ao() == bjs.a;
   }

   protected boolean a(akr $$0, bwg $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(akr $$0, bwg $$1, long $$2) {
      if (!$$1.bc()) {
         $$1.b(bjs.i);
         this.e = 0;
      }
   }

   protected void c(akr $$0, bwg $$1, long $$2) {
      $$1.b(bjs.a);
   }

   protected void d(akr $$0, bwg $$1, long $$2) {
      this.e++;
   }
}
