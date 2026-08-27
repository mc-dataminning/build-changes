import javax.annotation.Nullable;

public class cud extends cqx implements crq {
   private final avb a;

   public cud(dde $$0, avb $$1, csu.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bpm a(cwk $$0) {
      bpm $$1 = super.a($$0);
      clh $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bpl $$3 = $$0.p();
         $$2.a($$3, ctc.qy.v());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.s();
   }

   @Override
   protected avb a(dqh $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable clh $$0, dad $$1, in $$2, @Nullable etl $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dva.z, $$2);
         $$1.a($$0, $$2, this.a, avd.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
