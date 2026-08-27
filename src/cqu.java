import javax.annotation.Nullable;

public class cqu extends cnl implements coe {
   private final ato c;

   public cqu(czf $$0, ato $$1, cpl.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bml a(crz $$0) {
      bml $$1 = super.a($$0);
      cia $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bmk $$3 = $$0.p();
         $$2.a($$3, cpt.qx.an_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.r();
   }

   @Override
   protected ato a(dme $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cia $$0, cwe $$1, ib $$2, @Nullable eor $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dqr.z, $$2);
         $$1.a($$0, $$2, this.c, atq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
