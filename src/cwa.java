import java.util.List;

public class cwa extends cwd {
   public cwa(cwc $$0, cui.a $$1) {
      super($$0, $$1.a(km.w, k()));
   }

   private static cxs k() {
      return new cxs(List.of(cxs.a.a(List.of(dez.bs), 15.0F), cxs.a.b(awo.bE, 1.5F)), 1.0F, 2);
   }

   public static cxi a(cwc $$0, int $$1, float $$2) {
      return cxi.a()
         .a(buv.c, new but(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), but.a.a), bta.b)
         .a(buv.e, new but(f, "Weapon modifier", (double)$$2, but.a.a), bta.b)
         .a();
   }

   @Override
   public boolean a(dsa $$0, dbw $$1, iz $$2, cmv $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cun $$0, btn $$1, btn $$2) {
      $$0.a(1, $$2, bsz.a);
      return true;
   }
}
