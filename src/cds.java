import com.google.common.collect.ImmutableMap;

public class cds extends bzw<crl> {
   private static final int c = 25;
   private static final int d = 20;

   public cds() {
      super(ImmutableMap.of(chh.az, chi.a, chh.p, chi.b, chh.aG, chi.c, chh.aE, chi.c), crm.b);
   }

   protected void a(asb $$0, crl $$1, long $$2) {
      bzf<crl> $$3 = $$1.ec();
      $$3.a(chh.aE, bbh.a, 25L);
      $$3.b(chh.n);
      byf $$4 = $$1.ec().c(chh.az).get();
      bzy.a($$1, $$4);
      $$1.b(byr.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(asb $$0, crl $$1, long $$2) {
      return true;
   }

   protected void c(asb $$0, crl $$1, long $$2) {
      if (!$$1.ec().a(chh.aE) && !$$1.ec().a(chh.aG)) {
         $$1.ec().a(chh.aG, bbh.a, (long)(crm.b - 25));
         $$1.a(awy.CY, 3.0F, 1.0F);
      }
   }

   protected void d(asb $$0, crl $$1, long $$2) {
      if ($$1.c(byr.l)) {
         $$1.b(byr.a);
      }

      $$1.ec().c(chh.az).ifPresent($$1::i);
      $$1.ec().b(chh.az);
   }
}
