import javax.annotation.Nullable;

public class cuw extends cro implements csh {
   private final avh a;

   public cuw(dea $$0, avh $$1, ctl.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bpw a(cxd $$0) {
      bpw $$1 = super.a($$0);
      cly $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bpv $$3 = $$0.p();
         $$2.a($$3, ctt.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avh a(drd $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cly $$0, daz $$1, io $$2, @Nullable eui $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dvw.z, $$2);
         $$1.a($$0, $$2, this.a, avj.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
