import com.google.common.collect.ImmutableMap;

public class btx extends bsw<brg> {
   public static final int c = 100;
   private final bob d;
   private final auy e;

   public btx(bob $$0, auy $$1) {
      super(ImmutableMap.of(cah.n, cai.c, cah.T, cai.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqe $$0, brg $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(aqe $$0, brg $$1, long $$2) {
      $$1.q(true);
      $$1.b(brp.g);
   }

   protected void c(aqe $$0, brg $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dq().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, ava.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(brp.a);
      $$1.dQ().b(cah.T);
      $$1.dQ().a(cah.S, this.d.a($$0.z));
   }
}
