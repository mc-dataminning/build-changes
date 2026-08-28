import java.util.Optional;

public interface cfx {
   boolean t();

   void x(boolean var1);

   void o(cvl var1);

   void h(uf var1);

   cvl V_();

   awc y();

   @Deprecated
   static void a(buh $$0, cvl $$1) {
      $$1.b(kr.g, $$0.al());
      cya.a(kr.P, $$1, $$1x -> {
         if ($$0.gd()) {
            $$1x.a("NoAI", $$0.gd());
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

         $$1x.a("Health", $$0.eA());
      });
   }

   @Deprecated
   static void a(buh $$0, uf $$1) {
      if ($$1.e("NoAI")) {
         $$0.u($$1.q("NoAI"));
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
         $$0.x($$1.j("Health"));
      }
   }

   static <T extends buf & cfx> Optional<brk> a(cnp $$0, brj $$1, T $$2) {
      cvl $$3 = $$0.b($$1);
      if ($$3.h() == cvo.qA && $$2.bI()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cvl $$4 = $$2.V_();
         $$2.o($$4);
         cvl $$5 = cvn.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dds $$6 = $$2.dS();
         if (!$$6.B) {
            an.k.a((arh)$$0, $$4);
         }

         $$2.as();
         return Optional.of(brk.a);
      } else {
         return Optional.empty();
      }
   }
}
