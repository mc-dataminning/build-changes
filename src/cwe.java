import java.util.List;

public class cwe extends cwh {
   public cwe(cwg $$0, cum.a $$1) {
      super($$0, $$1.a(km.x, k()));
   }

   private static cxw k() {
      return new cxw(List.of(cxw.a.a(List.of(dfd.bs), 15.0F), cxw.a.b(awp.bE, 1.5F)), 1.0F, 2);
   }

   public static cxm a(cwg $$0, int $$1, float $$2) {
      return cxm.a()
         .a(buz.c, new bux(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), bux.a.a), bte.b)
         .a(buz.e, new bux(f, "Weapon modifier", (double)$$2, bux.a.a), bte.b)
         .a();
   }

   @Override
   public boolean a(dse $$0, dca $$1, iz $$2, cmz $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cur $$0, btr $$1, btr $$2) {
      $$0.a(1, $$2, btd.a);
      return true;
   }
}
