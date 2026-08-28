import com.google.common.collect.ImmutableMap;

public class bxg extends bwz<cir> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxg() {
      super(ImmutableMap.of(cek.m, cel.b), 100);
   }

   protected boolean a(arc $$0, cir $$1) {
      return $$1.aw() == bvs.a;
   }

   protected boolean a(arc $$0, cir $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arc $$0, cir $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bvs.i);
         this.e = 0;
      }
   }

   protected void c(arc $$0, cir $$1, long $$2) {
      $$1.b(bvs.a);
   }

   protected void d(arc $$0, cir $$1, long $$2) {
      this.e++;
   }
}
