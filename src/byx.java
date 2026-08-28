import com.google.common.collect.ImmutableMap;

public class byx extends byq<ckl> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public byx() {
      super(ImmutableMap.of(cgb.n, cgc.b), 100);
   }

   protected boolean a(aro $$0, ckl $$1) {
      return $$1.aw() == bxl.a;
   }

   protected boolean a(aro $$0, ckl $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aro $$0, ckl $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(bxl.i);
         this.e = 0;
      }
   }

   protected void c(aro $$0, ckl $$1, long $$2) {
      $$1.b(bxl.a);
   }

   protected void d(aro $$0, ckl $$1, long $$2) {
      this.e++;
   }
}
