import javax.annotation.Nullable;

public class cob extends ckq implements clj {
   private final arq c;

   public cob(cwp $$0, arq $$1, cms.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bka a(cpi $$0) {
      bka $$1 = super.a($$0);
      cfh $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bjz $$3 = $$0.p();
         $$2.a($$3, cna.qv.am_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected arq a(djg $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cfh $$0, cto $$1, hx $$2, @Nullable elo $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dnq.z, $$2);
         $$1.a($$0, $$2, this.c, ars.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
