import javax.annotation.Nullable;

public class cwh extends cwa {
   public cwh(dez.d $$0) {
      super($$0);
   }

   public static dfa a() {
      return csn.G.n();
   }

   @Override
   public void a(cpm $$0, cbn $$1, gu $$2, dfa $$3, @Nullable dcm $$4, ciy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cnh.a(cnj.v, $$5) == 0) {
         if ($$0.x_().i()) {
            $$0.a($$2, false);
            return;
         }

         dfa $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.a(cpv.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dfa $$0, cpm $$1, gu $$2) {
      if ($$1.x_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
