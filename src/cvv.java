import javax.annotation.Nullable;

public class cvv extends csn implements ctg {
   private final avz a;

   public cvv(dez $$0, avz $$1, cuk.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqu a(cyc $$0) {
      bqu $$1 = super.a($$0);
      cmx $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqt $$3 = $$0.p();
         $$2.a($$3, cus.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avz a(dsc $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmx $$0, dby $$1, iz $$2, @Nullable evn $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dwv.z, $$2);
         $$1.a($$0, $$2, this.a, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
