import com.google.common.collect.ImmutableMap;

public class bzr extends byq<bxb> {
   public static final int c = 100;
   private final btj d;
   private final awk e;

   public bzr(btj $$0, awk $$1) {
      super(ImmutableMap.of(cgb.o, cgc.c, cgb.U, cgc.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aro $$0, bxb $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(aro $$0, bxb $$1, long $$2) {
      $$1.q(true);
      $$1.b(bxl.g);
   }

   protected void c(aro $$0, bxb $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awm.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bxl.a);
      $$1.eb().b(cgb.U);
      $$1.eb().a(cgb.T, this.d.a($$0.A));
   }
}
