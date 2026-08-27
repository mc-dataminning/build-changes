import com.google.common.collect.ImmutableMap;

public class bxl<E extends ckl> extends bts<E> {
   public bxl(int $$0) {
      super(ImmutableMap.of(cbd.o, cbe.b, cbd.m, cbe.b), $$0);
   }

   protected boolean a(aqh $$0, E $$1, long $$2) {
      return $$1.dJ() == null;
   }

   protected boolean a(aqh $$0, E $$1) {
      return $$1.aC() || $$1.bc() || $$1.bq();
   }

   protected void b(aqh $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bsl.o);
         $$1.a(avc.Bw, 5.0F, 1.0F);
      } else {
         $$1.a(avc.Br, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqh $$0, E $$1, long $$2) {
      if ($$1.dJ() == null) {
         $$1.a(brh.c.b);
      }
   }
}
