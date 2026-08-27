import com.google.common.collect.ImmutableMap;

public class bqx extends bpw<boi> {
   public static final int c = 100;
   private final blf d;
   private final atj e;

   public bqx(blf $$0, atj $$1) {
      super(ImmutableMap.of(bxh.n, bxi.c, bxh.T, bxi.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aov $$0, boi $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(aov $$0, boi $$1, long $$2) {
      $$1.p(true);
      $$1.b(bor.g);
   }

   protected void c(aov $$0, boi $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, atl.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bor.a);
      $$1.dO().b(bxh.T);
      $$1.dO().a(bxh.S, this.d.a($$0.z));
   }
}
