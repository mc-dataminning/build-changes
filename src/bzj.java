import com.google.common.collect.ImmutableMap;

public class bzj extends byi<bwt> {
   public static final int c = 100;
   private final btb d;
   private final awj e;

   public bzj(btb $$0, awj $$1) {
      super(ImmutableMap.of(cft.o, cfu.c, cft.U, cfu.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arn $$0, bwt $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arn $$0, bwt $$1, long $$2) {
      $$1.q(true);
      $$1.b(bxd.g);
   }

   protected void c(arn $$0, bwt $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awl.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bxd.a);
      $$1.eb().b(cft.U);
      $$1.eb().a(cft.T, this.d.a($$0.A));
   }
}
