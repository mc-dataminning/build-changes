import javax.annotation.Nullable;

public class cln extends cic implements civ {
   private final aqc c;

   public cln(cua $$0, aqc $$1, cke.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bib a(cmt $$0) {
      bib $$1 = super.a($$0);
      ccx $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bia $$3 = $$0.p();
         $$2.a($$3, ckm.pK.al_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aqc a(dgb $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqz $$1, ht $$2, @Nullable eib $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dkl.z, $$2);
         $$1.a($$0, $$2, this.c, aqe.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
