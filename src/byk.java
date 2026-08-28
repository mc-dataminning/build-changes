import com.google.common.collect.ImmutableMap;

public class byk<E extends cll> extends bur<E> {
   public byk(int $$0) {
      super(ImmutableMap.of(ccc.o, ccd.b, ccc.m, ccd.b), $$0);
   }

   protected boolean a(aqk $$0, E $$1, long $$2) {
      return $$1.dL() == null;
   }

   protected boolean a(aqk $$0, E $$1) {
      return $$1.aE() || $$1.be() || $$1.bs();
   }

   protected void b(aqk $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(btk.o);
         $$1.a(avf.BK, 5.0F, 1.0F);
      } else {
         $$1.a(avf.BF, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqk $$0, E $$1, long $$2) {
      if ($$1.dL() == null) {
         $$1.a(bsd.c.b);
      }
   }
}
