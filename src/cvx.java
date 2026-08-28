import java.util.List;

public class cvx extends cwa {
   public cvx(cvz $$0, cuf.a $$1) {
      super($$0, $$1.a(km.w, k()));
   }

   private static cxp k() {
      return new cxp(List.of(cxp.a.a(List.of(dew.bs), 15.0F), cxp.a.b(awl.bE, 1.5F)), 1.0F, 2);
   }

   public static cxf a(cvz $$0, int $$1, float $$2) {
      return cxf.a()
         .a(bus.c, new buq(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), buq.a.a), bsx.b)
         .a(bus.e, new buq(f, "Weapon modifier", (double)$$2, buq.a.a), bsx.b)
         .a();
   }

   @Override
   public boolean a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuk $$0, btk $$1, btk $$2) {
      $$0.a(1, $$2, bsw.a);
      return true;
   }
}
