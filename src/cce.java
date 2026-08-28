import com.google.common.collect.ImmutableMap;

public class cce extends byi<cpl> {
   private static final int c = 25;
   private static final int d = 20;

   public cce() {
      super(ImmutableMap.of(cft.az, cfu.a, cft.p, cfu.b, cft.aG, cfu.c, cft.aE, cfu.c), cpm.b);
   }

   protected void a(arn $$0, cpl $$1, long $$2) {
      bxr<cpl> $$3 = $$1.eb();
      $$3.a(cft.aE, baq.a, 25L);
      $$3.b(cft.n);
      bwr $$4 = $$1.eb().c(cft.az).get();
      byk.a($$1, $$4);
      $$1.b(bxd.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arn $$0, cpl $$1, long $$2) {
      return true;
   }

   protected void c(arn $$0, cpl $$1, long $$2) {
      if (!$$1.eb().a(cft.aE) && !$$1.eb().a(cft.aG)) {
         $$1.eb().a(cft.aG, baq.a, (long)(cpm.b - 25));
         $$1.a(awk.CS, 3.0F, 1.0F);
      }
   }

   protected void d(arn $$0, cpl $$1, long $$2) {
      if ($$1.c(bxd.l)) {
         $$1.b(bxd.a);
      }

      $$1.eb().c(cft.az).ifPresent($$1::j);
      $$1.eb().b(cft.az);
   }
}
