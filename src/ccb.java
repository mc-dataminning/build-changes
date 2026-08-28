import com.google.common.collect.ImmutableMap;

public class ccb<E extends cpl> extends byi<E> {
   public ccb(int $$0) {
      super(ImmutableMap.of(cft.p, cfu.b, cft.n, cfu.b), $$0);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(arn $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bw();
   }

   protected void b(arn $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bxd.o);
         $$1.a(awk.CJ, 5.0F, 1.0F);
      } else {
         $$1.a(awk.CE, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bvs.e.b);
      }
   }
}
