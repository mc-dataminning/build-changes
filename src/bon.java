import com.google.common.collect.ImmutableMap;

public class bon extends bnm<blx> {
   public static final int c = 100;
   private final biw d;
   private final arb e;

   public bon(biw $$0, arb $$1) {
      super(ImmutableMap.of(bux.n, buy.c, bux.S, buy.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(amp $$0, blx $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(amp $$0, blx $$1, long $$2) {
      $$1.p(true);
      $$1.b(bmh.g);
   }

   protected void c(amp $$0, blx $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, ard.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bmh.a);
      $$1.dO().b(bux.S);
      $$1.dO().a(bux.R, this.d.a($$0.z));
   }
}
