import javax.annotation.Nullable;

public interface ctc {
   bsk m();

   default jj<ave> n() {
      return avf.as;
   }

   default bqe<cua> a(ctv $$0, dcd $$1, cmh $$2, bqc $$3) {
      cua $$4 = $$2.b($$3);
      bsk $$5 = bta.h($$4);
      if (!$$2.d($$5)) {
         return bqe.c($$4);
      } else {
         cua $$6 = $$2.a($$5);
         if ((!czl.a($$6, czk.F) || $$2.f()) && !cua.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avp.c.b($$0));
            }

            cua $$7 = $$6.e() ? $$4 : $$6.f();
            cua $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqe.a($$7, $$1.x_());
         } else {
            return bqe.d($$4);
         }
      }
   }

   @Nullable
   static ctc c_(cua $$0) {
      ctv $$3 = $$0.g();
      if ($$3 instanceof ctc) {
         return (ctc)$$3;
      } else {
         if ($$0.g() instanceof cry $$2) {
            dff var6 = $$2.d();
            if (var6 instanceof ctc) {
               return (ctc)var6;
            }
         }

         return null;
      }
   }
}
