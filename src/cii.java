import java.util.Optional;

public interface cii {
   boolean m();

   void w(boolean var1);

   void j(cxy var1);

   void h(tw var1);

   cxy R_();

   awj n();

   @Deprecated
   static void a(bwt $$0, cxy $$1) {
      $$1.a(kx.g, $$0);
      dae.a(kx.Z, $$1, $$1x -> {
         if ($$0.gf()) {
            $$1x.a("NoAI", $$0.gf());
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

         $$1x.a("Health", $$0.eF());
      });
   }

   @Deprecated
   static void a(bwt $$0, tw $$1) {
      if ($$1.e("NoAI")) {
         $$0.t($$1.q("NoAI"));
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
         $$0.m($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.d($$1.j("Health"));
      }
   }

   static <T extends bwr & cii> Optional<btq> a(cqi $$0, btp $$1, T $$2) {
      cxy $$3 = $$0.b($$1);
      if ($$3.h() == cyc.rk && $$2.bK()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         cxy $$4 = $$2.R_();
         $$2.j($$4);
         cxy $$5 = cyb.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dhp $$6 = $$2.dV();
         if (!$$6.C) {
            ap.k.a((aro)$$0, $$4);
         }

         $$2.at();
         return Optional.of(btq.a);
      } else {
         return Optional.empty();
      }
   }
}
