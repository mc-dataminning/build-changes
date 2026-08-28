import com.google.common.collect.ImmutableMap;

public class cbj<E extends cor> extends bxq<E> {
   public cbj(int $$0) {
      super(ImmutableMap.of(cfb.o, cfc.b, cfb.m, cfc.b), $$0);
   }

   protected boolean a(arx $$0, E $$1, long $$2) {
      return $$1.dS() == null;
   }

   protected boolean a(arx $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(arx $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bwj.o);
         $$1.a(awv.CA, 5.0F, 1.0F);
      } else {
         $$1.a(awv.Cv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arx $$0, E $$1, long $$2) {
      if ($$1.dS() == null) {
         $$1.a(bvb.d.b);
      }
   }
}
