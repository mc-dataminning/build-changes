import com.google.common.collect.ImmutableMap;

public class brq extends bqp<boz> {
   public static final int c = 100;
   private final blw d;
   private final ato e;

   public brq(blw $$0, ato $$1) {
      super(ImmutableMap.of(bya.n, byb.c, bya.T, byb.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(apa $$0, boz $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(apa $$0, boz $$1, long $$2) {
      $$1.p(true);
      $$1.b(bpi.g);
   }

   protected void c(apa $$0, boz $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dm().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, atq.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bpi.a);
      $$1.dM().b(bya.T);
      $$1.dM().a(bya.S, this.d.a($$0.z));
   }
}
