import java.util.Optional;

public interface cfc {
   boolean u();

   void w(boolean var1);

   void n(cuk var1);

   void c(ur var1);

   cuk b();

   avv y();

   @Deprecated
   static void a(btm $$0, cuk $$1) {
      $$1.b(km.f, $$0.ah());
      cwz.a(km.M, $$1, $$1x -> {
         if ($$0.gg()) {
            $$1x.a("NoAI", $$0.gg());
         }

         if ($$0.aW()) {
            $$1x.a("Silent", $$0.aW());
         }

         if ($$0.aX()) {
            $$1x.a("NoGravity", $$0.aX());
         }

         if ($$0.cf()) {
            $$1x.a("Glowing", $$0.cf());
         }

         if ($$0.cu()) {
            $$1x.a("Invulnerable", $$0.cu());
         }

         $$1x.a("Health", $$0.eA());
      });
   }

   @Deprecated
   static void a(btm $$0, ur $$1) {
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
         $$0.n($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.t($$1.j("Health"));
      }
   }

   static <T extends btk & cfc> Optional<bqp> a(cms $$0, bqo $$1, T $$2) {
      cuk $$3 = $$0.b($$1);
      if ($$3.g() == cun.qz && $$2.bD()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cuk $$4 = $$2.b();
         $$2.n($$4);
         cuk $$5 = cum.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dbt $$6 = $$2.dP();
         if (!$$6.B) {
            am.k.a((arc)$$0, $$4);
         }

         $$2.ao();
         return Optional.of(bqp.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
