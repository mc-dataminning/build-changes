import java.util.List;

public class cwd extends cwg {
   public cwd(cwf $$0, cul.a $$1) {
      super($$0, $$1.a(km.x, k()));
   }

   private static cxv k() {
      return new cxv(List.of(cxv.a.a(List.of(dfc.bs), 15.0F), cxv.a.b(awp.bE, 1.5F)), 1.0F, 2);
   }

   public static cxl a(cwf $$0, int $$1, float $$2) {
      return cxl.a()
         .a(buy.c, new buw(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), buw.a.a), btd.b)
         .a(buy.e, new buw(f, "Weapon modifier", (double)$$2, buw.a.a), btd.b)
         .a();
   }

   @Override
   public boolean a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuq $$0, btq $$1, btq $$2) {
      $$0.a(1, $$2, btc.a);
      return true;
   }
}
