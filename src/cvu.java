import javax.annotation.Nullable;

public class cvu extends csm implements ctf {
   private final avy a;

   public cvu(dey $$0, avy $$1, cuj.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqt a(cyb $$0) {
      bqt $$1 = super.a($$0);
      cmw $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqs $$3 = $$0.p();
         $$2.a($$3, cur.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avy a(dsb $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbx $$1, iz $$2, @Nullable evm $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dwu.z, $$2);
         $$1.a($$0, $$2, this.a, awa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
