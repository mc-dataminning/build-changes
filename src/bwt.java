import java.util.Optional;

public interface bwt {
   boolean w();

   void w(boolean var1);

   void l(clj var1);

   void c(rz var1);

   clj b();

   aqq A();

   @Deprecated
   static void a(bli $$0, clj $$1) {
      rz $$2 = $$1.w();
      if ($$0.ae()) {
         $$1.a($$0.af());
      }

      if ($$0.fV()) {
         $$2.a("NoAI", $$0.fV());
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

      $$2.a("Health", $$0.ew());
   }

   @Deprecated
   static void a(bli $$0, rz $$1) {
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
         $$0.c($$1.j("Health"));
      }
   }

   static <T extends blg & bwt> Optional<bix> a(cdu $$0, biw $$1, T $$2) {
      clj $$3 = $$0.b($$1);
      if ($$3.d() == clm.qw && $$2.bx()) {
         $$2.a($$2.A(), 1.0F, 1.0F);
         clj $$4 = $$2.b();
         $$2.l($$4);
         clj $$5 = cll.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         csa $$6 = $$2.dN();
         if (!$$6.B) {
            al.j.a((amf)$$0, $$4);
         }

         $$2.am();
         return Optional.of(bix.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
