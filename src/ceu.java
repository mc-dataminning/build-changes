import java.util.Optional;

public interface ceu {
   boolean t();

   void w(boolean var1);

   void n(cud var1);

   void c(tx var1);

   cud b();

   avg x();

   @Deprecated
   static void a(bte $$0, cud $$1) {
      $$1.b(kn.g, $$0.aj());
      cwr.a(kn.N, $$1, $$1x -> {
         if ($$0.gc()) {
            $$1x.a("NoAI", $$0.gc());
         }

         if ($$0.aY()) {
            $$1x.a("Silent", $$0.aY());
         }

         if ($$0.aZ()) {
            $$1x.a("NoGravity", $$0.aZ());
         }

         if ($$0.ch()) {
            $$1x.a("Glowing", $$0.ch());
         }

         if ($$0.cw()) {
            $$1x.a("Invulnerable", $$0.cw());
         }

         $$1x.a("Health", $$0.ey());
      });
   }

   @Deprecated
   static void a(bte $$0, tx $$1) {
      if ($$1.e("NoAI")) {
         $$0.c($$1.q("NoAI"));
      }

      if ($$1.e("Silent")) {
         $$0.f($$1.q("Silent"));
      }

      if ($$1.e("NoGravity")) {
         $$0.g($$1.q("NoGravity"));
      }

      if ($$1.e("Glowing")) {
         $$0.k($$1.q("Glowing"));
      }

      if ($$1.e("Invulnerable")) {
         $$0.o($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.u($$1.j("Health"));
      }
   }

   static <T extends btc & ceu> Optional<bqh> a(cml $$0, bqg $$1, T $$2) {
      cud $$3 = $$0.b($$1);
      if ($$3.g() == cug.qz && $$2.bF()) {
         $$2.a($$2.x(), 1.0F, 1.0F);
         cud $$4 = $$2.b();
         $$2.n($$4);
         cud $$5 = cuf.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dcg $$6 = $$2.dR();
         if (!$$6.B) {
            am.k.a((aqn)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(bqh.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
