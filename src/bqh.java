import com.google.common.collect.ImmutableMap;

public class bqh extends bqa<cbp> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bqh() {
      super(ImmutableMap.of(bxl.m, bxm.b), 100);
   }

   protected boolean a(aow $$0, cbp $$1) {
      return $$1.ap() == bot.a;
   }

   protected boolean a(aow $$0, cbp $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aow $$0, cbp $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bot.i);
         this.e = 0;
      }
   }

   protected void c(aow $$0, cbp $$1, long $$2) {
      $$1.b(bot.a);
   }

   protected void d(aow $$0, cbp $$1, long $$2) {
      this.e++;
   }
}
