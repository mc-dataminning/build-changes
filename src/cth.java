import javax.annotation.Nullable;

public class cth extends cqb implements cqu {
   private final auy a;

   public cth(dcv $$0, auy $$1, cry.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public boq a(cvn $$0) {
      boq $$1 = super.a($$0);
      ckl $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bop $$3 = $$0.p();
         $$2.a($$3, csg.qy.x());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.u();
   }

   @Override
   protected auy a(dpy $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable ckl $$0, czu $$1, im $$2, @Nullable etb $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().n(), 3);
         }

         $$1.a($$0, dur.z, $$2);
         $$1.a($$0, $$2, this.a, ava.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
