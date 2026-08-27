import javax.annotation.Nullable;

public class crq extends coh implements cpb {
   private final atx c;

   public crq(dac $$0, atx $$1, cqh.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bnd a(csw $$0) {
      bnd $$1 = super.a($$0);
      ciu $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bnc $$3 = $$0.p();
         $$2.a($$3, cqp.qx.am_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.r();
   }

   @Override
   protected atx a(dnb $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable ciu $$0, cxb $$1, ib $$2, @Nullable epp $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, drp.z, $$2);
         $$1.a($$0, $$2, this.c, atz.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
