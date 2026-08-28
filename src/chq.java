import java.util.Optional;

public interface chq {
   boolean p();

   void x(boolean var1);

   void i(cxg var1);

   void h(um var1);

   cxg X_();

   awu t();

   @Deprecated
   static void a(bvz $$0, cxg $$1) {
      $$1.b(ku.g, $$0.an());
      czp.a(ku.X, $$1, $$1x -> {
         if ($$0.gb()) {
            $$1x.a("NoAI", $$0.gb());
         }

         if ($$0.bb()) {
            $$1x.a("Silent", $$0.bb());
         }

         if ($$0.bc()) {
            $$1x.a("NoGravity", $$0.bc());
         }

         if ($$0.cn()) {
            $$1x.a("Glowing", $$0.cn());
         }

         if ($$0.cC()) {
            $$1x.a("Invulnerable", $$0.cC());
         }

         $$1x.a("Health", $$0.eE());
      });
   }

   @Deprecated
   static void a(bvz $$0, um $$1) {
      if ($$1.e("NoAI")) {
         $$0.u($$1.q("NoAI"));
      }

      if ($$1.e("Silent")) {
         $$0.e($$1.q("Silent"));
      }

      if ($$1.e("NoGravity")) {
         $$0.f($$1.q("NoGravity"));
      }

      if ($$1.e("Glowing")) {
         $$0.j($$1.q("Glowing"));
      }

      if ($$1.e("Invulnerable")) {
         $$0.n($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.x($$1.j("Health"));
      }
   }

   static <T extends bvx & chq> Optional<bta> a(cpo $$0, bsz $$1, T $$2) {
      cxg $$3 = $$0.b($$1);
      if ($$3.h() == cxk.rg && $$2.bL()) {
         $$2.a($$2.t(), 1.0F, 1.0F);
         cxg $$4 = $$2.X_();
         $$2.i($$4);
         cxg $$5 = cxj.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dgz $$6 = $$2.dW();
         if (!$$6.C) {
            ao.k.a((ary)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bta.a);
      } else {
         return Optional.empty();
      }
   }
}
