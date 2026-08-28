import java.util.Optional;

public interface ciq {
   boolean m();

   void w(boolean var1);

   void j(cys var1);

   void h(tx var1);

   cys R_();

   awk n();

   @Deprecated
   static void a(bxb $$0, cys $$1) {
      $$1.a(kj.g, $$0);
      dba.a(kj.Z, $$1, $$1x -> {
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
   static void a(bxb $$0, tx $$1) {
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

   static <T extends bwz & ciq> Optional<bty> a(cqs $$0, btx $$1, T $$2) {
      cys $$3 = $$0.b($$1);
      if ($$3.h() == cyw.rk && $$2.bK()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         cys $$4 = $$2.R_();
         $$2.j($$4);
         cys $$5 = cyv.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dip $$6 = $$2.dV();
         if (!$$6.C) {
            ap.k.a((arp)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bty.a);
      } else {
         return Optional.empty();
      }
   }
}
