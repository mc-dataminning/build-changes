import com.google.common.collect.ImmutableMap;

public class byc<E extends clc> extends buj<E> {
   public byc(int $$0) {
      super(ImmutableMap.of(cbu.o, cbv.b, cbu.m, cbv.b), $$0);
   }

   protected boolean a(aqn $$0, E $$1, long $$2) {
      return $$1.dL() == null;
   }

   protected boolean a(aqn $$0, E $$1) {
      return $$1.aE() || $$1.be() || $$1.bs();
   }

   protected void b(aqn $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(btc.o);
         $$1.a(avi.BH, 5.0F, 1.0F);
      } else {
         $$1.a(avi.BC, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqn $$0, E $$1, long $$2) {
      if ($$1.dL() == null) {
         $$1.a(brw.c.b);
      }
   }
}
