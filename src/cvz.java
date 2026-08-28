import javax.annotation.Nullable;

public class cvz extends cso implements ctg {
   private final avo a;

   public cvz(dfy $$0, avo $$1, cul.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqr a(cyf $$0) {
      bqr $$1 = super.a($$0);
      cmx $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), csv.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avo a(dtc $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcw $$1, jd $$2, @Nullable eww $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dxz.z, $$2);
         $$1.a($$0, $$2, this.a, avq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
