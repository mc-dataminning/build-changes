import java.util.List;

public class cvn extends cvq {
   public cvn(cvp $$0, ctv.a $$1) {
      super($$0, $$1.a(kn.x, k()));
   }

   private static cxe k() {
      return new cxe(List.of(cxe.a.a(List.of(dfh.bs), 15.0F), cxe.a.b(avu.bE, 1.5F)), 1.0F, 2);
   }

   public static cwu a(cvp $$0, int $$1, float $$2) {
      return cwu.a()
         .a(bug.c, new bue(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), bue.a.a), bsl.b)
         .a(bug.e, new bue(f, "Weapon modifier", (double)$$2, bue.a.a), bsl.b)
         .a();
   }

   @Override
   public boolean a(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cua $$0, bsy $$1, bsy $$2) {
      return true;
   }

   @Override
   public void b(cua $$0, bsy $$1, bsy $$2) {
      $$0.a(1, $$2, bsk.a);
   }
}
