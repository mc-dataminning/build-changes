import com.google.common.collect.ImmutableMap;

public class bys extends bxr<bwa> {
   public static final int c = 100;
   private final bsj d;
   private final avz e;

   public bys(bsj $$0, avz $$1) {
      super(ImmutableMap.of(cfc.n, cfd.c, cfc.T, cfd.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ard $$0, bwa $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(ard $$0, bwa $$1, long $$2) {
      $$1.q(true);
      $$1.b(bwk.g);
   }

   protected void c(ard $$0, bwa $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dx().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awb.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bwk.a);
      $$1.ea().b(cfc.T);
      $$1.ea().a(cfc.S, this.d.a($$0.A));
   }
}
