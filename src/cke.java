import javax.annotation.Nullable;

public class cke extends cgt implements chm {
   private final aoy c;

   public cke(csq $$0, aoy $$1, civ.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bgt a(clk $$0) {
      bgt $$1 = super.a($$0);
      cbp $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bgs $$3 = $$0.p();
         $$2.a($$3, cjd.pK.ad_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aoy a(dfe $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cbp $$0, cpq $$1, gw $$2, @Nullable ehe $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, djo.z, $$2);
         $$1.a($$0, $$2, this.c, apa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
