import java.util.List;

public class cvb extends cve {
   public cvb(cvd $$0, ctj.a $$1) {
      super($$0, $$1.a(kb.w, j()));
   }

   private static cwt j() {
      return new cwt(List.of(cwt.a.a(List.of(dea.bs), 15.0F), cwt.a.b(avw.bE, 1.5F)), 1.0F, 2);
   }

   public static cwj a(cvd $$0, int $$1, float $$2) {
      return cwj.a()
         .a(btw.c, new btu(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), btu.a.a), bsc.b)
         .a(btw.e, new btu(f, "Weapon modifier", (double)$$2, btu.a.a), bsc.b)
         .a();
   }

   @Override
   public boolean a(drb $$0, dax $$1, io $$2, clw $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cto $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsb.a);
      return true;
   }
}
