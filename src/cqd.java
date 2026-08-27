import javax.annotation.Nullable;

public class cqd extends cms implements cnl {
   private final atj c;

   public cqd(cyo $$0, atj $$1, cou.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public blu a(cri $$0) {
      blu $$1 = super.a($$0);
      chh $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         blt $$3 = $$0.p();
         $$2.a($$3, cpc.qx.ao_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.p();
   }

   @Override
   protected atj a(dlf $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable chh $$0, cvn $$1, hz $$2, @Nullable eno $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dpp.z, $$2);
         $$1.a($$0, $$2, this.c, atl.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
