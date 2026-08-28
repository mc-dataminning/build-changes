import com.google.common.collect.ImmutableMap;

public class bvn extends bvg<cgx> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvn() {
      super(ImmutableMap.of(ccr.m, ccs.b), 100);
   }

   protected boolean a(are $$0, cgx $$1) {
      return $$1.ar() == btz.a;
   }

   protected boolean a(are $$0, cgx $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(are $$0, cgx $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(btz.i);
         this.e = 0;
      }
   }

   protected void c(are $$0, cgx $$1, long $$2) {
      $$1.b(btz.a);
   }

   protected void d(are $$0, cgx $$1, long $$2) {
      this.e++;
   }
}
