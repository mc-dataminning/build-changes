import com.google.common.collect.ImmutableMap;

public class ccj<E extends cpv> extends byq<E> {
   public ccj(int $$0) {
      super(ImmutableMap.of(cgb.p, cgc.b, cgb.n, cgc.b), $$0);
   }

   protected boolean a(aro $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(aro $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bw();
   }

   protected void b(aro $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bxl.o);
         $$1.a(awl.CJ, 5.0F, 1.0F);
      } else {
         $$1.a(awl.CE, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aro $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bwa.e.b);
      }
   }
}
