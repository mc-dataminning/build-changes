import java.util.Optional;

public interface cgo {
   boolean t();

   void x(boolean var1);

   void k(cvx var1);

   void h(uj var1);

   cvx X_();

   awj y();

   @Deprecated
   static void a(bux $$0, cvx $$1) {
      $$1.b(kt.g, $$0.an());
      cyg.a(kt.W, $$1, $$1x -> {
         if ($$0.gi()) {
            $$1x.a("NoAI", $$0.gi());
         }

         if ($$0.bc()) {
            $$1x.a("Silent", $$0.bc());
         }

         if ($$0.bd()) {
            $$1x.a("NoGravity", $$0.bd());
         }

         if ($$0.co()) {
            $$1x.a("Glowing", $$0.co());
         }

         if ($$0.cD()) {
            $$1x.a("Invulnerable", $$0.cD());
         }

         $$1x.a("Health", $$0.eG());
      });
   }

   @Deprecated
   static void a(bux $$0, uj $$1) {
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

   static <T extends buv & cgo> Optional<bry> a(coh $$0, brx $$1, T $$2) {
      cvx $$3 = $$0.b($$1);
      if ($$3.h() == cwb.qA && $$2.bM()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cvx $$4 = $$2.X_();
         $$2.k($$4);
         cvx $$5 = cwa.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dev $$6 = $$2.dX();
         if (!$$6.C) {
            an.k.a((arn)$$0, $$4);
         }

         $$2.au();
         return Optional.of(bry.a);
      } else {
         return Optional.empty();
      }
   }
}
