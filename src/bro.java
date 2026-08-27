import com.google.common.collect.ImmutableMap;

public class bro extends brh<ccw> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bro() {
      super(ImmutableMap.of(bys.m, byt.b), 100);
   }

   protected boolean a(apf $$0, ccw $$1) {
      return $$1.ap() == bqa.a;
   }

   protected boolean a(apf $$0, ccw $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(apf $$0, ccw $$1, long $$2) {
      if (!$$1.bg()) {
         $$1.b(bqa.i);
         this.e = 0;
      }
   }

   protected void c(apf $$0, ccw $$1, long $$2) {
      $$1.b(bqa.a);
   }

   protected void d(apf $$0, ccw $$1, long $$2) {
      this.e++;
   }
}
