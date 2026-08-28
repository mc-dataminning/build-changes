import java.util.Optional;

public interface cgf {
   boolean t();

   void x(boolean var1);

   void m(cvs var1);

   void h(ug var1);

   cvs W_();

   awf y();

   @Deprecated
   static void a(bup $$0, cvs $$1) {
      $$1.b(ks.g, $$0.al());
      cyh.a(ks.S, $$1, $$1x -> {
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

         $$1x.a("Health", $$0.eB());
      });
   }

   @Deprecated
   static void a(bup $$0, ug $$1) {
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

   static <T extends bun & cgf> Optional<brs> a(cnx $$0, brr $$1, T $$2) {
      cvs $$3 = $$0.b($$1);
      if ($$3.h() == cvw.qA && $$2.bI()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cvs $$4 = $$2.W_();
         $$2.m($$4);
         cvs $$5 = cvv.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dej $$6 = $$2.dS();
         if (!$$6.B) {
            an.k.a((ark)$$0, $$4);
         }

         $$2.as();
         return Optional.of(brs.a);
      } else {
         return Optional.empty();
      }
   }
}
