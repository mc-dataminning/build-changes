import java.util.List;

public class cvd extends cvg {
   public cvd(cvf $$0, ctl.a $$1) {
      super($$0, $$1.a(kb.w, k()));
   }

   private static cwv k() {
      return new cwv(List.of(cwv.a.a(List.of(dec.bs), 15.0F), cwv.a.b(avx.bE, 1.5F)), 1.0F, 2);
   }

   public static cwl a(cvf $$0, int $$1, float $$2) {
      return cwl.a()
         .a(bty.c, new btw(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), btw.a.a), bse.b)
         .a(bty.e, new btw(f, "Weapon modifier", (double)$$2, btw.a.a), bse.b)
         .a();
   }

   @Override
   public boolean a(drd $$0, daz $$1, io $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(ctq $$0, bsq $$1, bsq $$2) {
      $$0.a(1, $$2, bsd.a);
      return true;
   }
}
