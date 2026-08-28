import com.google.common.collect.ImmutableMap;

public class byw<E extends clw> extends bvd<E> {
   public byw(int $$0) {
      super(ImmutableMap.of(cco.o, ccp.b, cco.m, ccp.b), $$0);
   }

   protected boolean a(arb $$0, E $$1, long $$2) {
      return $$1.dL() == null;
   }

   protected boolean a(arb $$0, E $$1) {
      return $$1.aE() || $$1.be() || $$1.bs();
   }

   protected void b(arb $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(btw.o);
         $$1.a(avw.BH, 5.0F, 1.0F);
      } else {
         $$1.a(avw.BC, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arb $$0, E $$1, long $$2) {
      if ($$1.dL() == null) {
         $$1.a(bsp.c.b);
      }
   }
}
