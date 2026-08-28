import java.util.Optional;

public interface chy {
   boolean p();

   void x(boolean var1);

   void i(cxo var1);

   void h(ux var1);

   cxo X_();

   axe t();

   @Deprecated
   static void a(bwh $$0, cxo $$1) {
      $$1.b(ku.g, $$0.an());
      czx.a(ku.X, $$1, $$1x -> {
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
   static void a(bwh $$0, ux $$1) {
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

   static <T extends bwf & chy> Optional<bti> a(cpw $$0, bth $$1, T $$2) {
      cxo $$3 = $$0.b($$1);
      if ($$3.h() == cxs.qX && $$2.bL()) {
         $$2.a($$2.t(), 1.0F, 1.0F);
         cxo $$4 = $$2.X_();
         $$2.i($$4);
         cxo $$5 = cxr.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dhh $$6 = $$2.dW();
         if (!$$6.C) {
            ao.k.a((asi)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bti.a);
      } else {
         return Optional.empty();
      }
   }
}
