import javax.annotation.Nullable;

public class cyo extends cvo implements cwc {
   private final avz a;

   public cyo(dke $$0, avz $$1, cxd.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bsy a(daz $$0) {
      bsy $$1 = super.a($$0);
      cpr $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cvu.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected avz a(dxq $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgz $$1, ji $$2, @Nullable fbt $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ecp.z, $$2);
         $$1.a($$0, $$2, this.a, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
