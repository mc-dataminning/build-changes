import com.google.common.collect.ImmutableMap;

public class buq extends buj<cga> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public buq() {
      super(ImmutableMap.of(cbu.m, cbv.b), 100);
   }

   protected boolean a(aqn $$0, cga $$1) {
      return $$1.ar() == btc.a;
   }

   protected boolean a(aqn $$0, cga $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqn $$0, cga $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(btc.i);
         this.e = 0;
      }
   }

   protected void c(aqn $$0, cga $$1, long $$2) {
      $$1.b(btc.a);
   }

   protected void d(aqn $$0, cga $$1, long $$2) {
      this.e++;
   }
}
