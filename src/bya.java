import java.util.Optional;

public interface bya {
   boolean w();

   void w(boolean var1);

   void l(cmy var1);

   void c(sn var1);

   cmy b();

   arr A();

   @Deprecated
   static void a(bmn $$0, cmy $$1) {
      sn $$2 = $$1.w();
      if ($$0.ae()) {
         $$1.a($$0.af());
      }

      if ($$0.fU()) {
         $$2.a("NoAI", $$0.fU());
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

      $$2.a("Health", $$0.ev());
   }

   @Deprecated
   static void a(bmn $$0, sn $$1) {
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

   static <T extends bml & bya> Optional<bkb> a(cfi $$0, bka $$1, T $$2) {
      cmy $$3 = $$0.b($$1);
      if ($$3.d() == cnb.qw && $$2.bx()) {
         $$2.a($$2.A(), 1.0F, 1.0F);
         cmy $$4 = $$2.b();
         $$2.l($$4);
         cmy $$5 = cna.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         ctp $$6 = $$2.dM();
         if (!$$6.B) {
            am.k.a((ane)$$0, $$4);
         }

         $$2.am();
         return Optional.of(bkb.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
