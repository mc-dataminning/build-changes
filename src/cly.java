import javax.annotation.Nullable;

public interface cly extends cos {
   blz g();

   default arq as_() {
      return arr.af;
   }

   default bkb<cmx> a(cms $$0, cto $$1, cfh $$2, bjz $$3) {
      cmx $$4 = $$2.b($$3);
      blz $$5 = bmm.h($$4);
      cmx $$6 = $$2.c($$5);
      if ((!crk.d($$6) || $$2.f()) && !cmx.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(asb.c.b($$0));
         }

         cmx $$7 = $$6.b() ? $$4 : $$6.c();
         cmx $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bkb.a($$7, $$1.y_());
      } else {
         return bkb.d($$4);
      }
   }

   @Nullable
   static cly c_(cmx $$0) {
      cms $$3 = $$0.d();
      if ($$3 instanceof cly) {
         return (cly)$$3;
      } else {
         if ($$0.d() instanceof ckq $$2) {
            cwp var6 = $$2.e();
            if (var6 instanceof cly) {
               return (cly)var6;
            }
         }

         return null;
      }
   }
}
