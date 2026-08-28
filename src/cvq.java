import javax.annotation.Nullable;

public class cvq extends csi implements ctb {
   private final avv a;

   public cvq(deu $$0, avv $$1, cuf.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqp a(cxx $$0) {
      bqp $$1 = super.a($$0);
      cms $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqo $$3 = $$0.p();
         $$2.a($$3, cun.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avv a(drx $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cms $$0, dbt $$1, iz $$2, @Nullable evi $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dwq.z, $$2);
         $$1.a($$0, $$2, this.a, avx.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
