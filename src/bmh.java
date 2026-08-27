import com.google.common.collect.ImmutableMap;

public class bmh extends bma<bxj> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bmh() {
      super(ImmutableMap.of(btk.m, btl.b), 100);
   }

   protected boolean a(alq $$0, bxj $$1) {
      return $$1.an() == bkv.a;
   }

   protected boolean a(alq $$0, bxj $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(alq $$0, bxj $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(bkv.i);
         this.e = 0;
      }
   }

   protected void c(alq $$0, bxj $$1, long $$2) {
      $$1.b(bkv.a);
   }

   protected void d(alq $$0, bxj $$1, long $$2) {
      this.e++;
   }
}
