import com.google.common.collect.ImmutableMap;

public class bxa extends bwt<cil> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxa() {
      super(ImmutableMap.of(cee.m, cef.b), 100);
   }

   protected boolean a(arn $$0, cil $$1) {
      return $$1.ay() == bvm.a;
   }

   protected boolean a(arn $$0, cil $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arn $$0, cil $$1, long $$2) {
      if (!$$1.bo()) {
         $$1.b(bvm.i);
         this.e = 0;
      }
   }

   protected void c(arn $$0, cil $$1, long $$2) {
      $$1.b(bvm.a);
   }

   protected void d(arn $$0, cil $$1, long $$2) {
      this.e++;
   }
}
