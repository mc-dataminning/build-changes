import com.google.common.collect.ImmutableMap;

public class bya extends bwz<bvi> {
   public static final int c = 100;
   private final bru d;
   private final avz e;

   public bya(bru $$0, avz $$1) {
      super(ImmutableMap.of(cek.n, cel.c, cek.T, cel.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ard $$0, bvi $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(ard $$0, bvi $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvs.g);
   }

   protected void c(ard $$0, bvi $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awb.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvs.a);
      $$1.eb().b(cek.T);
      $$1.eb().a(cek.S, this.d.a($$0.A));
   }
}
