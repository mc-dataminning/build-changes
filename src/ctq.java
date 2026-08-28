import javax.annotation.Nullable;

public interface ctq {
   bta m();

   default ji<avy> n() {
      return avz.as;
   }

   default bqu<cuo> a(cuj $$0, dbx $$1, cmw $$2, bqs $$3) {
      cuo $$4 = $$2.b($$3);
      bta $$5 = btq.h($$4);
      if (!$$2.d($$5)) {
         return bqu.c($$4);
      } else {
         cuo $$6 = $$2.a($$5);
         if ((!daa.f($$6) || $$2.f()) && !cuo.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awj.c.b($$0));
            }

            cuo $$7 = $$6.e() ? $$4 : $$6.f();
            cuo $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqu.a($$7, $$1.x_());
         } else {
            return bqu.d($$4);
         }
      }
   }

   @Nullable
   static ctq c_(cuo $$0) {
      cuj $$3 = $$0.g();
      if ($$3 instanceof ctq) {
         return (ctq)$$3;
      } else {
         if ($$0.g() instanceof csm $$2) {
            dey var6 = $$2.d();
            if (var6 instanceof ctq) {
               return (ctq)var6;
            }
         }

         return null;
      }
   }
}
