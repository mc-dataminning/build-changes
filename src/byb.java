import com.google.common.collect.ImmutableMap;

public class byb extends bxa<bvj> {
   public static final int c = 100;
   private final brv d;
   private final awm e;

   public byb(brv $$0, awm $$1) {
      super(ImmutableMap.of(cel.n, cem.c, cel.T, cem.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arp $$0, bvj $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arp $$0, bvj $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvt.g);
   }

   protected void c(arp $$0, bvj $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.h($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awo.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvt.a);
      $$1.eb().b(cel.T);
      $$1.eb().a(cel.S, this.d.a($$0.A));
   }
}
