import com.google.common.collect.ImmutableMap;

public class bxa extends bts<cku> {
   public bxa() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      if (c($$1) || b($$1)) {
         btb<?> $$3 = $$1.dQ();
         if (!$$3.c(cmw.g)) {
            $$3.b(cbd.t);
            $$3.b(cbd.m);
            $$3.b(cbd.n);
            $$3.b(cbd.r);
            $$3.b(cbd.q);
         }

         $$3.a(cmw.g);
      }
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bsa $$0) {
      return $$0.dQ().a(cbd.A);
   }

   public static boolean c(bsa $$0) {
      return $$0.dQ().a(cbd.x);
   }
}
