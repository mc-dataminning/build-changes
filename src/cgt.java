import java.util.Optional;

public interface cgt {
   boolean t();

   void x(boolean var1);

   void k(cwb var1);

   void h(uk var1);

   cwb X_();

   awk y();

   @Deprecated
   static void a(bvc $$0, cwb $$1) {
      $$1.b(ku.g, $$0.ao());
      cyk.a(ku.X, $$1, $$1x -> {
         if ($$0.gh()) {
            $$1x.a("NoAI", $$0.gh());
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
   static void a(bvc $$0, uk $$1) {
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

   static <T extends bva & cgt> Optional<bsd> a(com $$0, bsc $$1, T $$2) {
      cwb $$3 = $$0.b($$1);
      if ($$3.h() == cwf.qA && $$2.bM()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cwb $$4 = $$2.X_();
         $$2.k($$4);
         cwb $$5 = cwe.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dfb $$6 = $$2.dX();
         if (!$$6.C) {
            ao.k.a((aro)$$0, $$4);
         }

         $$2.av();
         return Optional.of(bsd.a);
      } else {
         return Optional.empty();
      }
   }
}
