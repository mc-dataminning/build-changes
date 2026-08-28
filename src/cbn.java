import com.google.common.collect.ImmutableMap;

public class cbn<E extends cov> extends bxu<E> {
   public cbn(int $$0) {
      super(ImmutableMap.of(cff.o, cfg.b, cff.m, cfg.b), $$0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(ash $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(ash $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bwn.o);
         $$1.a(axf.Cj, 5.0F, 1.0F);
      } else {
         $$1.a(axf.Ce, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bvf.c.b);
      }
   }
}
