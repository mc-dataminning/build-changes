import com.google.common.collect.ImmutableMap;

public class bts extends bpw<cgl> {
   private static final int c = 25;
   private static final int d = 20;

   public bts() {
      super(ImmutableMap.of(bxh.ay, bxi.a, bxh.o, bxi.b, bxh.aF, bxi.c, bxh.aD, bxi.c), cgm.b);
   }

   protected void a(aov $$0, cgl $$1, long $$2) {
      bpf<cgl> $$3 = $$1.dO();
      $$3.a(bxh.aD, axk.a, 25L);
      $$3.b(bxh.m);
      bog $$4 = $$1.dO().c(bxh.ay).get();
      bpy.a($$1, $$4);
      $$1.b(bor.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aov $$0, cgl $$1, long $$2) {
      return true;
   }

   protected void c(aov $$0, cgl $$1, long $$2) {
      if (!$$1.dO().a(bxh.aD) && !$$1.dO().a(bxh.aF)) {
         $$1.dO().a(bxh.aF, axk.a, (long)(cgm.b - 25));
         $$1.a(atk.AY, 3.0F, 1.0F);
      }
   }

   protected void d(aov $$0, cgl $$1, long $$2) {
      if ($$1.c(bor.l)) {
         $$1.b(bor.a);
      }

      $$1.dO().c(bxh.ay).ifPresent($$1::j);
      $$1.dO().b(bxh.ay);
   }
}
