import com.google.common.collect.ImmutableMap;

public class boj extends bko<cap> {
   private static final int c = 25;
   private static final int d = 20;

   public boj() {
      super(ImmutableMap.of(bry.ax, brz.a, bry.o, brz.b, bry.aE, brz.c, bry.aC, brz.c), caq.b);
   }

   protected void a(aki $$0, cap $$1, long $$2) {
      bjx<cap> $$3 = $$1.dM();
      $$3.a(bry.aC, asn.a, 25L);
      $$3.b(bry.m);
      biw $$4 = $$1.dM().c(bry.ax).get();
      bkq.a($$1, $$4);
      $$1.b(bji.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aki $$0, cap $$1, long $$2) {
      return true;
   }

   protected void c(aki $$0, cap $$1, long $$2) {
      if (!$$1.dM().a(bry.aC) && !$$1.dM().a(bry.aE)) {
         $$1.dM().a(bry.aE, asn.a, (long)(caq.b - 25));
         $$1.a(aou.zE, 3.0F, 1.0F);
      }
   }

   protected void d(aki $$0, cap $$1, long $$2) {
      if ($$1.c(bji.l)) {
         $$1.b(bji.a);
      }

      $$1.dM().c(bry.ax).ifPresent($$1::l);
      $$1.dM().b(bry.ax);
   }
}
