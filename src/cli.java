import javax.annotation.Nullable;

public interface cli extends cob {
   blk g();

   default arb as_() {
      return arc.af;
   }

   default bjm<cmh> a(cmc $$0, csy $$1, cer $$2, bjk $$3) {
      cmh $$4 = $$2.b($$3);
      blk $$5 = blx.h($$4);
      cmh $$6 = $$2.c($$5);
      if ((!cqu.d($$6) || $$2.f()) && !cmh.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(arm.c.b($$0));
         }

         cmh $$7 = $$6.b() ? $$4 : $$6.c();
         cmh $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bjm.a($$7, $$1.y_());
      } else {
         return bjm.d($$4);
      }
   }

   @Nullable
   static cli c_(cmh $$0) {
      cmc $$3 = $$0.d();
      if ($$3 instanceof cli) {
         return (cli)$$3;
      } else {
         if ($$0.d() instanceof cka $$2) {
            cvz var6 = $$2.e();
            if (var6 instanceof cli) {
               return (cli)var6;
            }
         }

         return null;
      }
   }
}
