import java.util.List;

public class cvp extends cvs {
   public cvp(cvr $$0, ctx.a $$1) {
      super($$0, $$1.a(kn.x, k()));
   }

   private static cxg k() {
      return new cxg(List.of(cxg.a.a(List.of(dfj.bs), 15.0F), cxg.a.b(avw.bE, 1.5F)), 1.0F, 2);
   }

   public static cww a(cvr $$0, int $$1, float $$2) {
      return cww.a()
         .a(buj.c, new buh(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), buh.a.a), bso.b)
         .a(buj.e, new buh(f, "Weapon modifier", (double)$$2, buh.a.a), bso.b)
         .a();
   }

   @Override
   public boolean a(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuc $$0, btb $$1, btb $$2) {
      return true;
   }

   @Override
   public void b(cuc $$0, btb $$1, btb $$2) {
      $$0.a(1, $$2, bsn.a);
   }
}
