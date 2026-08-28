import com.google.common.collect.ImmutableMap;

public class ccm extends byq<cpv> {
   private static final int c = 25;
   private static final int d = 20;

   public ccm() {
      super(ImmutableMap.of(cgb.az, cgc.a, cgb.p, cgc.b, cgb.aG, cgc.c, cgb.aE, cgc.c), cpw.b);
   }

   protected void a(aro $$0, cpv $$1, long $$2) {
      bxz<cpv> $$3 = $$1.eb();
      $$3.a(cgb.aE, bas.a, 25L);
      $$3.b(cgb.n);
      bwz $$4 = $$1.eb().c(cgb.az).get();
      bys.a($$1, $$4);
      $$1.b(bxl.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aro $$0, cpv $$1, long $$2) {
      return true;
   }

   protected void c(aro $$0, cpv $$1, long $$2) {
      if (!$$1.eb().a(cgb.aE) && !$$1.eb().a(cgb.aG)) {
         $$1.eb().a(cgb.aG, bas.a, (long)(cpw.b - 25));
         $$1.a(awl.CS, 3.0F, 1.0F);
      }
   }

   protected void d(aro $$0, cpv $$1, long $$2) {
      if ($$1.c(bxl.l)) {
         $$1.b(bxl.a);
      }

      $$1.eb().c(cgb.az).ifPresent($$1::i);
      $$1.eb().b(cgb.az);
   }
}
