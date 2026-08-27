import javax.annotation.Nullable;

public class ckb extends cgq implements chj {
   private final aov c;

   public ckb(csl $$0, aov $$1, cis.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bgq a(clh $$0) {
      bgq $$1 = super.a($$0);
      cbm $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bgp $$3 = $$0.p();
         $$2.a($$3, cja.pK.ad_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aov a(dez $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cbm $$0, cpl $$1, gu $$2, @Nullable egz $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, djj.z, $$2);
         $$1.a($$0, $$2, this.c, aox.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
