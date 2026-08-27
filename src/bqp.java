import com.google.common.collect.ImmutableMap;

public class bqp<E extends ccy> extends bmx<E> {
   public bqp(int $$0) {
      super(ImmutableMap.of(buh.o, bui.b, buh.m, bui.b), $$0);
   }

   protected boolean a(ame $$0, E $$1, long $$2) {
      return $$1.dJ() == null;
   }

   protected boolean a(ame $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(ame $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bls.o);
         $$1.a(aqr.Af, 5.0F, 1.0F);
      } else {
         $$1.a(aqr.Aa, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ame $$0, E $$1, long $$2) {
      if ($$1.dJ() == null) {
         $$1.a(bkq.c.b);
      }
   }
}
