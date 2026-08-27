import com.google.common.collect.ImmutableMap;

public class btm extends bsl<bqv> {
   public static final int c = 100;
   private final bnq d;
   private final aun e;

   public btm(bnq $$0, aun $$1) {
      super(ImmutableMap.of(bzw.n, bzx.c, bzw.T, bzx.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(apu $$0, bqv $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(apu $$0, bqv $$1, long $$2) {
      $$1.p(true);
      $$1.b(bre.g);
   }

   protected void c(apu $$0, bqv $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aup.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bre.a);
      $$1.dP().b(bzw.T);
      $$1.dP().a(bzw.S, this.d.a($$0.z));
   }
}
