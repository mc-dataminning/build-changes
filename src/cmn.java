import javax.annotation.Nullable;

public class cmn extends cjc implements cjv {
   private final aqq c;

   public cmn(cva $$0, aqq $$1, cle.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bix a(cnt $$0) {
      bix $$1 = super.a($$0);
      cdu $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         biw $$3 = $$0.p();
         $$2.a($$3, clm.qv.al_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aqq a(dhi $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cdu $$0, csa $$1, ht $$2, @Nullable ejq $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dls.z, $$2);
         $$1.a($$0, $$2, this.c, aqs.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
