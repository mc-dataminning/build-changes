import com.google.common.collect.ImmutableMap;

public class bwm extends bwf<chx> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bwm() {
      super(ImmutableMap.of(cdq.m, cdr.b), 100);
   }

   protected boolean a(arj $$0, chx $$1) {
      return $$1.av() == buz.a;
   }

   protected boolean a(arj $$0, chx $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arj $$0, chx $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(buz.i);
         this.e = 0;
      }
   }

   protected void c(arj $$0, chx $$1, long $$2) {
      $$1.b(buz.a);
   }

   protected void d(arj $$0, chx $$1, long $$2) {
      this.e++;
   }
}
