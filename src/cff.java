import java.util.Optional;

public interface cff {
   boolean u();

   void w(boolean var1);

   void n(cun var1);

   void c(ur var1);

   cun b();

   avy y();

   @Deprecated
   static void a(btp $$0, cun $$1) {
      $$1.b(km.f, $$0.ah());
      cxc.a(km.M, $$1, $$1x -> {
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
   static void a(btp $$0, ur $$1) {
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

   static <T extends btn & cff> Optional<bqs> a(cmv $$0, bqr $$1, T $$2) {
      cun $$3 = $$0.b($$1);
      if ($$3.g() == cuq.qz && $$2.bD()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cun $$4 = $$2.b();
         $$2.n($$4);
         cun $$5 = cup.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dbw $$6 = $$2.dP();
         if (!$$6.B) {
            am.k.a((arf)$$0, $$4);
         }

         $$2.ao();
         return Optional.of(bqs.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
