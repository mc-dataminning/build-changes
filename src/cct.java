import com.google.common.collect.ImmutableMap;

public class cct<E extends cqp> extends bza<E> {
   public cct(int $$0) {
      super(ImmutableMap.of(cgl.p, cgm.b, cgl.n, cgm.b), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.dQ() == null;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.aH() || $$1.bh() || $$1.bu();
   }

   protected void b(arq $$0, E $$1, long $$2) {
      if ($$1.aH()) {
         $$1.b(bxv.o);
         $$1.a(awn.CP, 5.0F, 1.0F);
      } else {
         $$1.a(awn.CK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.dQ() == null) {
         $$1.a(bwi.d.b);
      }
   }
}
