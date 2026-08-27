import javax.annotation.Nullable;

public interface cos {
   bom i();

   default il<ato> at_() {
      return atp.aq;
   }

   default bmm<cpq> a(cpl $$0, cwe $$1, cia $$2, bmk $$3) {
      cpq $$4 = $$2.b($$3);
      bom $$5 = boz.h($$4);
      cpq $$6 = $$2.c($$5);
      if ((!cua.d($$6) || $$2.f()) && !cpq.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(atz.c.b($$0));
         }

         cpq $$7 = $$6.b() ? $$4 : $$6.c();
         cpq $$8 = $$2.f() ? $$4.q() : $$4.c();
         $$2.a($$5, $$8);
         return bmm.a($$7, $$1.y_());
      } else {
         return bmm.d($$4);
      }
   }

   @Nullable
   static cos c_(cpq $$0) {
      cpl $$3 = $$0.d();
      if ($$3 instanceof cos) {
         return (cos)$$3;
      } else {
         if ($$0.d() instanceof cnl $$2) {
            czf var6 = $$2.d();
            if (var6 instanceof cos) {
               return (cos)var6;
            }
         }

         return null;
      }
   }
}
