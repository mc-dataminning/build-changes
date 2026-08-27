import javax.annotation.Nullable;

public interface ckp extends cni {
   bla g();

   default aqu at_() {
      return aqv.af;
   }

   default bjc<clo> a(clj $$0, csf $$1, cdz $$2, bja $$3) {
      clo $$4 = $$2.b($$3);
      bla $$5 = bln.h($$4);
      clo $$6 = $$2.c($$5);
      if ((!cqb.d($$6) || $$2.f()) && !clo.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(arf.c.b($$0));
         }

         clo $$7 = $$6.b() ? $$4 : $$6.c();
         clo $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bjc.a($$7, $$1.y_());
      } else {
         return bjc.d($$4);
      }
   }

   @Nullable
   static ckp c_(clo $$0) {
      clj $$3 = $$0.d();
      if ($$3 instanceof ckp) {
         return (ckp)$$3;
      } else {
         if ($$0.d() instanceof cjh $$2) {
            cvf var6 = $$2.e();
            if (var6 instanceof ckp) {
               return (ckp)var6;
            }
         }

         return null;
      }
   }
}
