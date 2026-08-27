import java.util.Optional;

public interface ceg {
   boolean t();

   void w(boolean var1);

   void n(cuh var1);

   void c(uk var1);

   cuh b();

   avn x();

   @Deprecated
   static void a(bsq $$0, cuh $$1) {
      $$1.b(ke.f, $$0.ah());
      cxf.a(ke.N, $$1, $$1x -> {
         if ($$0.go()) {
            $$1x.a("NoAI", $$0.go());
         }

         if ($$0.ba()) {
            $$1x.a("Silent", $$0.ba());
         }

         if ($$0.bb()) {
            $$1x.a("NoGravity", $$0.bb());
         }

         if ($$0.ck()) {
            $$1x.a("Glowing", $$0.ck());
         }

         if ($$0.cz()) {
            $$1x.a("Invulnerable", $$0.cz());
         }

         $$1x.a("Health", $$0.eI());
      });
   }

   @Deprecated
   static void a(bsq $$0, uk $$1) {
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

   static <T extends bso & ceg> Optional<bqa> a(cly $$0, bpz $$1, T $$2) {
      cuh $$3 = $$0.b($$1);
      if ($$3.f() == cuk.rW && $$2.bI()) {
         $$2.a($$2.x(), 1.0F, 1.0F);
         cuh $$4 = $$2.b();
         $$2.n($$4);
         cuh $$5 = cuj.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dca $$6 = $$2.dU();
         if (!$$6.C) {
            an.k.a((aqu)$$0, $$4);
         }

         $$2.ao();
         return Optional.of(bqa.a($$6.C));
      } else {
         return Optional.empty();
      }
   }
}
