import javax.annotation.Nullable;

public interface cts {
   btc m();

   default ji<avz> n() {
      return awa.as;
   }

   default bqw<cuq> a(cul $$0, dbz $$1, cmy $$2, bqu $$3) {
      cuq $$4 = $$2.b($$3);
      btc $$5 = bts.h($$4);
      if (!$$2.d($$5)) {
         return bqw.c($$4);
      } else {
         cuq $$6 = $$2.a($$5);
         if ((!dac.f($$6) || $$2.f()) && !cuq.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awk.c.b($$0));
            }

            cuq $$7 = $$6.e() ? $$4 : $$6.f();
            cuq $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqw.a($$7, $$1.x_());
         } else {
            return bqw.d($$4);
         }
      }
   }

   @Nullable
   static cts c_(cuq $$0) {
      cul $$3 = $$0.g();
      if ($$3 instanceof cts) {
         return (cts)$$3;
      } else {
         if ($$0.g() instanceof cso $$2) {
            dfa var6 = $$2.d();
            if (var6 instanceof cts) {
               return (cts)var6;
            }
         }

         return null;
      }
   }
}
