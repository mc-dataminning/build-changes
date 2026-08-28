import java.util.List;

public class cvq extends cvt {
   public cvq(cvs $$0, cty.a $$1) {
      super($$0, $$1.a(kn.x, k()));
   }

   private static cxh k() {
      return new cxh(List.of(cxh.a.a(List.of(dfk.bs), 15.0F), cxh.a.b(avw.bE, 1.5F)), 1.0F, 2);
   }

   public static cwx a(cvs $$0, int $$1, float $$2) {
      return cwx.a()
         .a(buk.c, new bui(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), bui.a.a), bsp.b)
         .a(buk.e, new bui(f, "Weapon modifier", (double)$$2, bui.a.a), bsp.b)
         .a();
   }

   @Override
   public boolean a(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cud $$0, btc $$1, btc $$2) {
      return true;
   }

   @Override
   public void b(cud $$0, btc $$1, btc $$2) {
      $$0.a(1, $$2, bso.a);
   }
}
