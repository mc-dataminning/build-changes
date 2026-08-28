import javax.annotation.Nullable;

public class cvi extends csb implements cst {
   private final avg a;

   public cvi(dfh $$0, avg $$1, ctx.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqg a(cxo $$0) {
      bqg $$1 = super.a($$0);
      cmk $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), csi.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avg a(dsk $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmk $$0, dcf $$1, ja $$2, @Nullable ewb $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dxg.z, $$2);
         $$1.a($$0, $$2, this.a, avi.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
