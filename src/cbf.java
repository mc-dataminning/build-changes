import java.util.Optional;

public interface cbf {
   boolean s();

   void w(boolean var1);

   void n(cqk var1);

   void c(ta var1);

   cqk b();

   atx y();

   @Deprecated
   static void a(bpq $$0, cqk $$1) {
      ta $$2 = $$1.x();
      if ($$0.ae()) {
         $$1.a($$0.af());
      }

      if ($$0.gd()) {
         $$2.a("NoAI", $$0.gd());
      }

      if ($$0.aU()) {
         $$2.a("Silent", $$0.aU());
      }

      if ($$0.aV()) {
         $$2.a("NoGravity", $$0.aV());
      }

      if ($$0.cc()) {
         $$2.a("Glowing", $$0.cc());
      }

      if ($$0.cr()) {
         $$2.a("Invulnerable", $$0.cr());
      }

      $$2.a("Health", $$0.ex());
   }

   @Deprecated
   static void a(bpq $$0, ta $$1) {
      if ($$1.e("NoAI")) {
         $$0.t($$1.q("NoAI"));
      }

      if ($$1.e("Silent")) {
         $$0.d($$1.q("Silent"));
      }

      if ($$1.e("NoGravity")) {
         $$0.e($$1.q("NoGravity"));
      }

      if ($$1.e("Glowing")) {
         $$0.i($$1.q("Glowing"));
      }

      if ($$1.e("Invulnerable")) {
         $$0.m($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.t($$1.j("Health"));
      }
   }

   static <T extends bpo & cbf> Optional<bnc> a(cis $$0, bnb $$1, T $$2) {
      cqk $$3 = $$0.b($$1);
      if ($$3.d() == cqn.qy && $$2.bA()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cqk $$4 = $$2.b();
         $$2.n($$4);
         cqk $$5 = cqm.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cwz $$6 = $$2.dM();
         if (!$$6.B) {
            am.k.a((apg)$$0, $$4);
         }

         $$2.am();
         return Optional.of(bnc.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
