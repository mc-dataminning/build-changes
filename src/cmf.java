import javax.annotation.Nullable;

public class cmf extends ciu implements cjn {
   private final aqm c;

   public cmf(cut $$0, aqm $$1, ckw.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public biq a(cnl $$0) {
      biq $$1 = super.a($$0);
      cdm $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bip $$3 = $$0.p();
         $$2.a($$3, cle.pK.al_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aqm a(dgw $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cdm $$0, crs $$1, ht $$2, @Nullable eje $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dlg.z, $$2);
         $$1.a($$0, $$2, this.c, aqo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
