import javax.annotation.Nullable;

public class cka extends cgp implements chi {
   private final aot c;

   public cka(csk $$0, aot $$1, cir.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bgo a(clg $$0) {
      bgo $$1 = super.a($$0);
      cbl $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bgn $$3 = $$0.p();
         $$2.a($$3, ciz.pK.ae_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aot a(dey $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cbl $$0, cpk $$1, gv $$2, @Nullable ehb $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, dji.z, $$2);
         $$1.a($$0, $$2, this.c, aov.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
