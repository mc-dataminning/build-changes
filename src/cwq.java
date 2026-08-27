import javax.annotation.Nullable;

public class cwq extends cwj {
   public cwq(dfi.d $$0) {
      super($$0);
   }

   public static dfj a() {
      return csw.G.n();
   }

   @Override
   public void a(cpv $$0, cbu $$1, gw $$2, dfj $$3, @Nullable dcv $$4, cjf $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cnq.a(cns.v, $$5) == 0) {
         if ($$0.C_().i()) {
            $$0.a($$2, false);
            return;
         }

         dfj $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$1.a(cqe.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dfj $$0, cpv $$1, gw $$2) {
      if ($$1.C_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
