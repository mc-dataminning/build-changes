import com.google.common.collect.ImmutableMap;

public class blt extends bks<bjd> {
   public static final int c = 100;
   private final bge d;
   private final aoy e;

   public blt(bge $$0, aoy $$1) {
      super(ImmutableMap.of(bsc.n, bsd.c, bsc.S, bsd.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(akn $$0, bjd $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(akn $$0, bjd $$1, long $$2) {
      $$1.p(true);
      $$1.b(bjn.g);
   }

   protected void c(akn $$0, bjd $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.dn().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, apa.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bjn.a);
      $$1.dM().b(bsc.S);
      $$1.dM().a(bsc.R, this.d.a($$0.z));
   }
}
