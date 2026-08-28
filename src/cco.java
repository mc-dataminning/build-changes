import com.google.common.collect.ImmutableMap;

public class cco<E extends cqf> extends byv<E> {
   public cco(int $$0) {
      super(ImmutableMap.of(cgg.p, cgh.b, cgg.n, cgh.b), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bw();
   }

   protected void b(arq $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bxq.o);
         $$1.a(awn.CP, 5.0F, 1.0F);
      } else {
         $$1.a(awn.CK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bwf.e.b);
      }
   }
}
