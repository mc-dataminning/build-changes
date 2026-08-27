import com.google.common.collect.ImmutableMap;

public class btz extends bts<cfj> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public btz() {
      super(ImmutableMap.of(cbd.m, cbe.b), 100);
   }

   protected boolean a(aqh $$0, cfj $$1) {
      return $$1.ap() == bsl.a;
   }

   protected boolean a(aqh $$0, cfj $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqh $$0, cfj $$1, long $$2) {
      if (!$$1.bg()) {
         $$1.b(bsl.i);
         this.e = 0;
      }
   }

   protected void c(aqh $$0, cfj $$1, long $$2) {
      $$1.b(bsl.a);
   }

   protected void d(aqh $$0, cfj $$1, long $$2) {
      this.e++;
   }
}
