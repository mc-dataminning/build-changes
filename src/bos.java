import com.google.common.collect.ImmutableMap;

public class bos extends bkx<cay> {
   private static final int c = 25;
   private static final int d = 20;

   public bos() {
      super(ImmutableMap.of(bsh.ax, bsi.a, bsh.o, bsi.b, bsh.aE, bsi.c, bsh.aC, bsi.c), caz.b);
   }

   protected void a(akq $$0, cay $$1, long $$2) {
      bkg<cay> $$3 = $$1.dN();
      $$3.a(bsh.aC, asx.a, 25L);
      $$3.b(bsh.m);
      bjg $$4 = $$1.dN().c(bsh.ax).get();
      bkz.a($$1, $$4);
      $$1.b(bjs.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(akq $$0, cay $$1, long $$2) {
      return true;
   }

   protected void c(akq $$0, cay $$1, long $$2) {
      if (!$$1.dN().a(bsh.aC) && !$$1.dN().a(bsh.aE)) {
         $$1.dN().a(bsh.aE, asx.a, (long)(caz.b - 25));
         $$1.a(apd.zJ, 3.0F, 1.0F);
      }
   }

   protected void d(akq $$0, cay $$1, long $$2) {
      if ($$1.c(bjs.l)) {
         $$1.b(bjs.a);
      }

      $$1.dN().c(bsh.ax).ifPresent($$1::j);
      $$1.dN().b(bsh.ax);
   }
}
