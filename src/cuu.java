import javax.annotation.Nullable;

public class cuu extends crm implements csf {
   private final avg a;

   public cuu(ddy $$0, avg $$1, ctj.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bpu a(cxb $$0) {
      bpu $$1 = super.a($$0);
      clw $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bpt $$3 = $$0.p();
         $$2.a($$3, ctr.qy.v());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.s();
   }

   @Override
   protected avg a(drb $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable clw $$0, dax $$1, io $$2, @Nullable eug $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dvu.z, $$2);
         $$1.a($$0, $$2, this.a, avi.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
