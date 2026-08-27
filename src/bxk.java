import java.util.Optional;

public interface bxk {
   boolean w();

   void w(boolean var1);

   void l(cmh var1);

   void c(sj var1);

   cmh b();

   arb A();

   @Deprecated
   static void a(blx $$0, cmh $$1) {
      sj $$2 = $$1.w();
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
   static void a(blx $$0, sj $$1) {
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

   static <T extends blv & bxk> Optional<bjl> a(cer $$0, bjk $$1, T $$2) {
      cmh $$3 = $$0.b($$1);
      if ($$3.d() == cmk.qw && $$2.bx()) {
         $$2.a($$2.A(), 1.0F, 1.0F);
         cmh $$4 = $$2.b();
         $$2.l($$4);
         cmh $$5 = cmj.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         csy $$6 = $$2.dM();
         if (!$$6.B) {
            am.k.a((amq)$$0, $$4);
         }

         $$2.am();
         return Optional.of(bjl.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
