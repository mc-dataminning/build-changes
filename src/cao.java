import java.util.Optional;

public interface cao {
   boolean w();

   void w(boolean var1);

   void n(cpq var1);

   void c(sy var1);

   cpq b();

   ato A();

   @Deprecated
   static void a(boz $$0, cpq $$1) {
      sy $$2 = $$1.x();
      if ($$0.ae()) {
         $$1.a($$0.af());
      }

      if ($$0.gb()) {
         $$2.a("NoAI", $$0.gb());
      }

      if ($$0.aU()) {
         $$2.a("Silent", $$0.aU());
      }

      if ($$0.aV()) {
         $$2.a("NoGravity", $$0.aV());
      }

      if ($$0.bZ()) {
         $$2.a("Glowing", $$0.bZ());
      }

      if ($$0.co()) {
         $$2.a("Invulnerable", $$0.co());
      }

      $$2.a("Health", $$0.eu());
   }

   @Deprecated
   static void a(boz $$0, sy $$1) {
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

   static <T extends box & cao> Optional<bml> a(cia $$0, bmk $$1, T $$2) {
      cpq $$3 = $$0.b($$1);
      if ($$3.d() == cpt.qy && $$2.bx()) {
         $$2.a($$2.A(), 1.0F, 1.0F);
         cpq $$4 = $$2.b();
         $$2.n($$4);
         cpq $$5 = cps.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cwe $$6 = $$2.dJ();
         if (!$$6.B) {
            am.k.a((apb)$$0, $$4);
         }

         $$2.am();
         return Optional.of(bml.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
