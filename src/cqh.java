import javax.annotation.Nullable;

public class cqh extends cmw implements cnp {
   private final atk c;

   public cqh(cys $$0, atk $$1, coy.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public blw a(crm $$0) {
      blw $$1 = super.a($$0);
      chl $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         blv $$3 = $$0.p();
         $$2.a($$3, cpg.qx.ao_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.p();
   }

   @Override
   protected atk a(dlj $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable chl $$0, cvr $$1, hz $$2, @Nullable env $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dpw.z, $$2);
         $$1.a($$0, $$2, this.c, atm.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
