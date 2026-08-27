import javax.annotation.Nullable;

public class cwg extends cvz {
   public cwg(dey.d $$0) {
      super($$0);
   }

   public static dez a() {
      return csm.G.n();
   }

   @Override
   public void a(cpl $$0, cbm $$1, gu $$2, dez $$3, @Nullable dcl $$4, cix $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cng.a(cni.v, $$5) == 0) {
         if ($$0.x_().i()) {
            $$0.a($$2, false);
            return;
         }

         dez $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.a(cpu.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dez $$0, cpl $$1, gu $$2) {
      if ($$1.x_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
