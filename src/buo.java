import com.google.common.collect.ImmutableMap;

public class buo extends buh<cfy> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public buo() {
      super(ImmutableMap.of(cbs.m, cbt.b), 100);
   }

   protected boolean a(aqm $$0, cfy $$1) {
      return $$1.ar() == bta.a;
   }

   protected boolean a(aqm $$0, cfy $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqm $$0, cfy $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(bta.i);
         this.e = 0;
      }
   }

   protected void c(aqm $$0, cfy $$1, long $$2) {
      $$1.b(bta.a);
   }

   protected void d(aqm $$0, cfy $$1, long $$2) {
      this.e++;
   }
}
