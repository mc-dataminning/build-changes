import com.google.common.collect.ImmutableMap;

public class buy extends bur<cgi> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public buy() {
      super(ImmutableMap.of(ccc.m, ccd.b), 100);
   }

   protected boolean a(aqk $$0, cgi $$1) {
      return $$1.ar() == btk.a;
   }

   protected boolean a(aqk $$0, cgi $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqk $$0, cgi $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(btk.i);
         this.e = 0;
      }
   }

   protected void c(aqk $$0, cgi $$1, long $$2) {
      $$1.b(btk.a);
   }

   protected void d(aqk $$0, cgi $$1, long $$2) {
      this.e++;
   }
}
