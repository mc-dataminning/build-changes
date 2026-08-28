import java.util.List;

public class cwb extends cwe {
   public cwb(cwd $$0, cuj.a $$1) {
      super($$0, $$1.a(km.x, k()));
   }

   private static cxt k() {
      return new cxt(List.of(cxt.a.a(List.of(dfa.bs), 15.0F), cxt.a.b(awo.bE, 1.5F)), 1.0F, 2);
   }

   public static cxj a(cwd $$0, int $$1, float $$2) {
      return cxj.a()
         .a(buw.c, new buu(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), buu.a.a), btb.b)
         .a(buw.e, new buu(f, "Weapon modifier", (double)$$2, buu.a.a), btb.b)
         .a();
   }

   @Override
   public boolean a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuo $$0, bto $$1, bto $$2) {
      $$0.a(1, $$2, bta.a);
      return true;
   }
}
