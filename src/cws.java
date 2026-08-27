import javax.annotation.Nullable;

public class cws extends cwl {
   public cws(dfk.d $$0) {
      super($$0);
   }

   public static dfl a() {
      return csy.G.n();
   }

   @Override
   public void a(cpx $$0, cbw $$1, gw $$2, dfl $$3, @Nullable dcx $$4, cjh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cns.a(cnu.v, $$5) == 0) {
         if ($$0.C_().i()) {
            $$0.a($$2, false);
            return;
         }

         dfl $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.a(cqg.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dfl $$0, cpx $$1, gw $$2) {
      if ($$1.C_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
