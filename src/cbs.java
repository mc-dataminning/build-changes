import com.google.common.collect.ImmutableMap;

public class cbs<E extends cpa> extends bxz<E> {
   public cbs(int $$0) {
      super(ImmutableMap.of(cfk.o, cfl.b, cfk.m, cfl.b), $$0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return $$1.dS() == null;
   }

   protected boolean a(ash $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(ash $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bws.o);
         $$1.a(axf.Ck, 5.0F, 1.0F);
      } else {
         $$1.a(axf.Cf, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.dS() == null) {
         $$1.a(bvk.d.b);
      }
   }
}
