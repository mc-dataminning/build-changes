import javax.annotation.Nullable;

public interface cun {
   btr m();

   default jn<awc> n() {
      return awd.as;
   }

   default brk a(cvg $$0, dds $$1, cnp $$2, brj $$3) {
      cvl $$4 = $$2.b($$3);
      btr $$5 = $$2.i($$4);
      if (!$$2.e($$5)) {
         return brk.e;
      } else {
         cvl $$6 = $$2.a($$5);
         if ((!day.a($$6, dax.E) || $$2.f()) && !cvl.a($$4, $$6)) {
            if (!$$1.w_()) {
               $$2.b(awn.c.b($$0));
            }

            cvl $$7 = $$6.f() ? $$4 : $$6.g();
            cvl $$8 = $$2.f() ? $$4.u() : $$4.g();
            $$2.a($$5, $$8);
            return brk.a.a($$7);
         } else {
            return brk.d;
         }
      }
   }

   @Nullable
   static cun c_(cvl $$0) {
      cvg $$3 = $$0.h();
      if ($$3 instanceof cun) {
         return (cun)$$3;
      } else {
         if ($$0.h() instanceof ctl $$2) {
            dgv var6 = $$2.d();
            if (var6 instanceof cun) {
               return (cun)var6;
            }
         }

         return null;
      }
   }
}
