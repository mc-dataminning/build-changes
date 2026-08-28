import com.google.common.collect.ImmutableMap;

public class bzc<E extends cmc> extends bvj<E> {
   public bzc(int $$0) {
      super(ImmutableMap.of(ccu.o, ccv.b, ccu.m, ccv.b), $$0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return $$1.dL() == null;
   }

   protected boolean a(arf $$0, E $$1) {
      return $$1.aE() || $$1.be() || $$1.bs();
   }

   protected void b(arf $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(buc.o);
         $$1.a(awa.BH, 5.0F, 1.0F);
      } else {
         $$1.a(awa.BC, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.dL() == null) {
         $$1.a(bsv.c.b);
      }
   }
}
