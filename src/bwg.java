import com.google.common.collect.ImmutableMap;

public class bwg extends bvf<btn> {
   public static final int c = 100;
   private final bqb d;
   private final avn e;

   public bwg(bqb $$0, avn $$1) {
      super(ImmutableMap.of(ccq.n, ccr.c, ccq.T, ccr.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqt $$0, btn $$1, long $$2) {
      return !$$1.aF();
   }

   protected void b(aqt $$0, btn $$1, long $$2) {
      $$1.r(true);
      $$1.b(bty.g);
   }

   protected void c(aqt $$0, btn $$1, long $$2) {
      if ($$1.aF()) {
         $$1.i($$1.dt().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avp.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bty.a);
      $$1.dU().b(ccq.T);
      $$1.dU().a(ccq.S, this.d.a($$0.z));
   }
}
