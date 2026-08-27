import com.google.common.collect.ImmutableMap;

public class brb extends bqa<bok> {
   public static final int c = 100;
   private final blh d;
   private final atk e;

   public brb(blh $$0, atk $$1) {
      super(ImmutableMap.of(bxl.n, bxm.c, bxl.T, bxm.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aow $$0, bok $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(aow $$0, bok $$1, long $$2) {
      $$1.p(true);
      $$1.b(bot.g);
   }

   protected void c(aow $$0, bok $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, atm.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bot.a);
      $$1.dO().b(bxl.T);
      $$1.dO().a(bxl.S, this.d.a($$0.z));
   }
}
