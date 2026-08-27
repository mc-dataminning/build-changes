import com.google.common.collect.ImmutableMap;

public class bkv extends bko<bvx> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bkv() {
      super(ImmutableMap.of(bry.m, brz.b), 100);
   }

   protected boolean a(aki $$0, bvx $$1) {
      return $$1.an() == bji.a;
   }

   protected boolean a(aki $$0, bvx $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aki $$0, bvx $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(bji.i);
         this.e = 0;
      }
   }

   protected void c(aki $$0, bvx $$1, long $$2) {
      $$1.b(bji.a);
   }

   protected void d(aki $$0, bvx $$1, long $$2) {
      this.e++;
   }
}
