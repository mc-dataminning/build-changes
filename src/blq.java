import com.google.common.collect.ImmutableMap;

public class blq extends bkp<bja> {
   public static final int c = 100;
   private final bgb d;
   private final aov e;

   public blq(bgb $$0, aov $$1) {
      super(ImmutableMap.of(brz.n, bsa.c, brz.S, bsa.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(akk $$0, bja $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(akk $$0, bja $$1, long $$2) {
      $$1.p(true);
      $$1.b(bjk.g);
   }

   protected void c(akk $$0, bja $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.dn().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aox.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bjk.a);
      $$1.dM().b(brz.S);
      $$1.dM().a(brz.R, this.d.a($$0.z));
   }
}
