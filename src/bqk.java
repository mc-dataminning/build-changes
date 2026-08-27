import com.google.common.collect.ImmutableMap;

public class bqk extends bmp<ccq> {
   private static final int c = 25;
   private static final int d = 20;

   public bqk() {
      super(ImmutableMap.of(btz.ax, bua.a, btz.o, bua.b, btz.aE, bua.c, btz.aC, bua.c), ccr.b);
   }

   protected void a(ama $$0, ccq $$1, long $$2) {
      bly<ccq> $$3 = $$1.dN();
      $$3.a(btz.aC, auj.a, 25L);
      $$3.b(btz.m);
      bky $$4 = $$1.dN().c(btz.ax).get();
      bmr.a($$1, $$4);
      $$1.b(blk.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ama $$0, ccq $$1, long $$2) {
      return true;
   }

   protected void c(ama $$0, ccq $$1, long $$2) {
      if (!$$1.dN().a(btz.aC) && !$$1.dN().a(btz.aE)) {
         $$1.dN().a(btz.aE, auj.a, (long)(ccr.b - 25));
         $$1.a(aqn.zN, 3.0F, 1.0F);
      }
   }

   protected void d(ama $$0, ccq $$1, long $$2) {
      if ($$1.c(blk.l)) {
         $$1.b(blk.a);
      }

      $$1.dN().c(btz.ax).ifPresent($$1::j);
      $$1.dN().b(btz.ax);
   }
}
