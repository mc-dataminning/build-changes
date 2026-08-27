import javax.annotation.Nullable;

public class cnl extends cka implements ckt {
   private final arb c;

   public cnl(cvz $$0, arb $$1, cmc.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bjl a(cos $$0) {
      bjl $$1 = super.a($$0);
      cer $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bjk $$3 = $$0.p();
         $$2.a($$3, cmk.qv.am_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected arb a(dip $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cer $$0, csy $$1, hv $$2, @Nullable ekx $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dmz.z, $$2);
         $$1.a($$0, $$2, this.c, ard.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
