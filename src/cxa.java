import javax.annotation.Nullable;

public class cxa extends ctu implements cuk {
   private final awf a;

   public cxa(dhm $$0, awf $$1, cvn.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public brs a(czp $$0) {
      brs $$1 = super.a($$0);
      cnx $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cua.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.s();
   }

   @Override
   protected awf a(dus $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cnx $$0, dej $$1, jf $$2, @Nullable eys $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dzp.z, $$2);
         $$1.a($$0, $$2, this.a, awh.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
