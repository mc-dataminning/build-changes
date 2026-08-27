import javax.annotation.Nullable;

public class cti extends ctb {
   public cti(dca.d $$0) {
      super($$0);
   }

   public static dcb a() {
      return cpo.G.n();
   }

   @Override
   public void a(cmm $$0, byo $$1, gu $$2, dcb $$3, @Nullable czn $$4, cfz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cki.a(ckk.v, $$5) == 0) {
         if ($$0.x_().i()) {
            $$0.a($$2, false);
            return;
         }

         dcb $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.a(cmv.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dcb $$0, cmm $$1, gu $$2) {
      if ($$1.x_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
