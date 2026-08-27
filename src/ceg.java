import java.util.Optional;

public interface ceg {
   boolean u();

   void w(boolean var1);

   void n(cto var1);

   void c(ud var1);

   cto b();

   avg y();

   @Deprecated
   static void a(bsq $$0, cto $$1) {
      $$1.b(kb.f, $$0.ah());
      cwd.a(kb.M, $$1, $$1x -> {
         if ($$0.gf()) {
            $$1x.a("NoAI", $$0.gf());
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
   static void a(bsq $$0, ud $$1) {
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

   static <T extends bso & ceg> Optional<bpu> a(clw $$0, bpt $$1, T $$2) {
      cto $$3 = $$0.b($$1);
      if ($$3.g() == ctr.qz && $$2.bD()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cto $$4 = $$2.b();
         $$2.n($$4);
         cto $$5 = ctq.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dax $$6 = $$2.dP();
         if (!$$6.B) {
            am.k.a((aqn)$$0, $$4);
         }

         $$2.ao();
         return Optional.of(bpu.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
