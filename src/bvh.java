import com.google.common.collect.ImmutableMap;

public class bvh extends bug<bsq> {
   public static final int c = 100;
   private final bpl d;
   private final avn e;

   public bvh(bpl $$0, avn $$1) {
      super(ImmutableMap.of(cbr.n, cbs.c, cbr.T, cbs.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqt $$0, bsq $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(aqt $$0, bsq $$1, long $$2) {
      $$1.q(true);
      $$1.b(bsz.g);
   }

   protected void c(aqt $$0, bsq $$1, long $$2) {
      if ($$1.aE()) {
         $$1.g($$1.dx().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avq.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bsz.a);
      $$1.dZ().b(cbr.T);
      $$1.dZ().a(cbr.S, this.d.a($$0.A));
   }
}
