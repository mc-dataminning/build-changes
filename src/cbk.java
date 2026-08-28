import com.google.common.collect.ImmutableMap;

public class cbk<E extends cou> extends bxr<E> {
   public cbk(int $$0) {
      super(ImmutableMap.of(cfc.o, cfd.b, cfc.m, cfd.b), $$0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return $$1.dQ() == null;
   }

   protected boolean a(ard $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bv();
   }

   protected void b(ard $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bwk.o);
         $$1.a(awa.CJ, 5.0F, 1.0F);
      } else {
         $$1.a(awa.CE, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.dQ() == null) {
         $$1.a(bva.d.b);
      }
   }
}
