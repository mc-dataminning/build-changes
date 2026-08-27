import com.google.common.collect.ImmutableMap;

public class bpv extends bma<ccb> {
   private static final int c = 25;
   private static final int d = 20;

   public bpv() {
      super(ImmutableMap.of(btk.ax, btl.a, btk.o, btl.b, btk.aE, btl.c, btk.aC, btl.c), ccc.b);
   }

   protected void a(alq $$0, ccb $$1, long $$2) {
      blj<ccb> $$3 = $$1.dN();
      $$3.a(btk.aC, atz.a, 25L);
      $$3.b(btk.m);
      bkj $$4 = $$1.dN().c(btk.ax).get();
      bmc.a($$1, $$4);
      $$1.b(bkv.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(alq $$0, ccb $$1, long $$2) {
      return true;
   }

   protected void c(alq $$0, ccb $$1, long $$2) {
      if (!$$1.dN().a(btk.aC) && !$$1.dN().a(btk.aE)) {
         $$1.dN().a(btk.aE, atz.a, (long)(ccc.b - 25));
         $$1.a(aqd.zL, 3.0F, 1.0F);
      }
   }

   protected void d(alq $$0, ccb $$1, long $$2) {
      if ($$1.c(bkv.l)) {
         $$1.b(bkv.a);
      }

      $$1.dN().c(btk.ax).ifPresent($$1::j);
      $$1.dN().b(btk.ax);
   }
}
