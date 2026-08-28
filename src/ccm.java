import com.google.common.collect.ImmutableMap;

public class ccm<E extends cqb> extends byt<E> {
   public ccm(int $$0) {
      super(ImmutableMap.of(cge.p, cgf.b, cge.n, cgf.b), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bw();
   }

   protected void b(arq $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bxo.o);
         $$1.a(awn.CM, 5.0F, 1.0F);
      } else {
         $$1.a(awn.CH, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bwd.e.b);
      }
   }
}
