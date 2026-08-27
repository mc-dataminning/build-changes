import com.google.common.collect.ImmutableMap;

public class bya<E extends cla> extends buh<E> {
   public bya(int $$0) {
      super(ImmutableMap.of(cbs.o, cbt.b, cbs.m, cbt.b), $$0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return $$1.dL() == null;
   }

   protected boolean a(aqm $$0, E $$1) {
      return $$1.aE() || $$1.be() || $$1.bs();
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(bta.o);
         $$1.a(avh.BH, 5.0F, 1.0F);
      } else {
         $$1.a(avh.BC, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.dL() == null) {
         $$1.a(bru.c.b);
      }
   }
}
