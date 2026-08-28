import com.google.common.collect.ImmutableMap;

public class bze extends bvi<cmb> {
   private static final int c = 25;
   private static final int d = 20;

   public bze() {
      super(ImmutableMap.of(cct.ay, ccu.a, cct.o, ccu.b, cct.aF, ccu.c, cct.aD, ccu.c), cmc.b);
   }

   protected void a(arf $$0, cmb $$1, long $$2) {
      bur<cmb> $$3 = $$1.dS();
      $$3.a(cct.aD, bac.a, 25L);
      $$3.b(cct.m);
      btp $$4 = $$1.dS().c(cct.ay).get();
      bvk.a($$1, $$4);
      $$1.b(bub.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arf $$0, cmb $$1, long $$2) {
      return true;
   }

   protected void c(arf $$0, cmb $$1, long $$2) {
      if (!$$1.dS().a(cct.aD) && !$$1.dS().a(cct.aF)) {
         $$1.dS().a(cct.aF, bac.a, (long)(cmc.b - 25));
         $$1.a(awa.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(arf $$0, cmb $$1, long $$2) {
      if ($$1.c(bub.l)) {
         $$1.b(bub.a);
      }

      $$1.dS().c(cct.ay).ifPresent($$1::j);
      $$1.dS().b(cct.ay);
   }
}
