import com.google.common.collect.ImmutableMap;

public class bkw extends bkp<bvy> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bkw() {
      super(ImmutableMap.of(brz.m, bsa.b), 100);
   }

   protected boolean a(akk $$0, bvy $$1) {
      return $$1.an() == bjk.a;
   }

   protected boolean a(akk $$0, bvy $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(akk $$0, bvy $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(bjk.i);
         this.e = 0;
      }
   }

   protected void c(akk $$0, bvy $$1, long $$2) {
      $$1.b(bjk.a);
   }

   protected void d(akk $$0, bvy $$1, long $$2) {
      this.e++;
   }
}
