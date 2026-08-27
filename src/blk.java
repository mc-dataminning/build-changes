import com.google.common.collect.ImmutableMap;

public class blk extends bld<bwm> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public blk() {
      super(ImmutableMap.of(bsn.m, bso.b), 100);
   }

   protected boolean a(akt $$0, bwm $$1) {
      return $$1.an() == bjy.a;
   }

   protected boolean a(akt $$0, bwm $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(akt $$0, bwm $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(bjy.i);
         this.e = 0;
      }
   }

   protected void c(akt $$0, bwm $$1, long $$2) {
      $$1.b(bjy.a);
   }

   protected void d(akt $$0, bwm $$1, long $$2) {
      this.e++;
   }
}
