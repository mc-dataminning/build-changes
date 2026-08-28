import com.google.common.collect.ImmutableMap;

public class byc extends bxb<bvk> {
   public static final int c = 100;
   private final brw d;
   private final avz e;

   public byc(brw $$0, avz $$1) {
      super(ImmutableMap.of(cem.n, cen.c, cem.T, cen.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ard $$0, bvk $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(ard $$0, bvk $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvu.g);
   }

   protected void c(ard $$0, bvk $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awb.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvu.a);
      $$1.eb().b(cem.T);
      $$1.eb().a(cem.S, this.d.a($$0.A));
   }
}
