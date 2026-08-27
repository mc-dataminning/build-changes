import com.google.common.collect.ImmutableMap;

public class btd extends bsw<cen> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public btd() {
      super(ImmutableMap.of(cah.m, cai.b), 100);
   }

   protected boolean a(aqe $$0, cen $$1) {
      return $$1.ap() == brp.a;
   }

   protected boolean a(aqe $$0, cen $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqe $$0, cen $$1, long $$2) {
      if (!$$1.bg()) {
         $$1.b(brp.i);
         this.e = 0;
      }
   }

   protected void c(aqe $$0, cen $$1, long $$2) {
      $$1.b(brp.a);
   }

   protected void d(aqe $$0, cen $$1, long $$2) {
      this.e++;
   }
}
