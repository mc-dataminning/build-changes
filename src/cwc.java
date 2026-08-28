import java.util.List;

public class cwc extends cwf {
   public cwc(cwe $$0, cuk.a $$1) {
      super($$0, $$1.a(km.x, k()));
   }

   private static cxu k() {
      return new cxu(List.of(cxu.a.a(List.of(dfb.bs), 15.0F), cxu.a.b(awp.bE, 1.5F)), 1.0F, 2);
   }

   public static cxk a(cwe $$0, int $$1, float $$2) {
      return cxk.a()
         .a(bux.c, new buv(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), buv.a.a), btc.b)
         .a(bux.e, new buv(f, "Weapon modifier", (double)$$2, buv.a.a), btc.b)
         .a();
   }

   @Override
   public boolean a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cup $$0, btp $$1, btp $$2) {
      $$0.a(1, $$2, btb.a);
      return true;
   }
}
