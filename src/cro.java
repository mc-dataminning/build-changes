import javax.annotation.Nullable;

public class cro extends cof implements coz {
   private final atx c;

   public cro(daa $$0, atx $$1, cqf.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bnc a(csu $$0) {
      bnc $$1 = super.a($$0);
      cis $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bnb $$3 = $$0.p();
         $$2.a($$3, cqn.qx.am_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.r();
   }

   @Override
   protected atx a(dmz $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cis $$0, cwz $$1, ib $$2, @Nullable epn $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, drn.z, $$2);
         $$1.a($$0, $$2, this.c, atz.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
