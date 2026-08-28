import com.google.common.collect.ImmutableMap;

public class byz<E extends clz> extends bvg<E> {
   public byz(int $$0) {
      super(ImmutableMap.of(ccr.o, ccs.b, ccr.m, ccs.b), $$0);
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return $$1.dL() == null;
   }

   protected boolean a(are $$0, E $$1) {
      return $$1.aE() || $$1.be() || $$1.bs();
   }

   protected void b(are $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(btz.o);
         $$1.a(avz.BH, 5.0F, 1.0F);
      } else {
         $$1.a(avz.BC, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(are $$0, E $$1, long $$2) {
      if ($$1.dL() == null) {
         $$1.a(bss.c.b);
      }
   }
}
