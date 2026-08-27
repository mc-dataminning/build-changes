import javax.annotation.Nullable;

public class cok extends cla implements clt {
   private final ars c;

   public cok(cwy $$0, ars $$1, cnb.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bkc a(cpr $$0) {
      bkc $$1 = super.a($$0);
      cfq $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bkb $$3 = $$0.p();
         $$2.a($$3, cnj.qx.ao_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.p();
   }

   @Override
   protected ars a(djp $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctx $$1, hx $$2, @Nullable ely $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dnz.z, $$2);
         $$1.a($$0, $$2, this.c, aru.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
