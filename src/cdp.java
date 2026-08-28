import com.google.common.collect.ImmutableMap;

public class cdp<E extends crl> extends bzw<E> {
   public cdp(int $$0) {
      super(ImmutableMap.of(chh.p, chi.b, chh.n, chi.b), $$0);
   }

   protected boolean a(asb $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(asb $$0, E $$1) {
      return $$1.aH() || $$1.bi() || $$1.bv();
   }

   protected void b(asb $$0, E $$1, long $$2) {
      if ($$1.aH()) {
         $$1.b(byr.o);
         $$1.a(awy.CP, 5.0F, 1.0F);
      } else {
         $$1.a(awy.CK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(asb $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bxe.d.b);
      }
   }
}
