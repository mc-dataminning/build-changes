import java.util.Optional;

public interface cfe {
   boolean t();

   void w(boolean var1);

   void n(cuo var1);

   void c(ua var1);

   cuo b();

   avn x();

   @Deprecated
   static void a(btn $$0, cuo $$1) {
      $$1.b(kq.g, $$0.aj());
      cxf.a(kq.N, $$1, $$1x -> {
         if ($$0.gb()) {
            $$1x.a("NoAI", $$0.gb());
         }

         if ($$0.aX()) {
            $$1x.a("Silent", $$0.aX());
         }

         if ($$0.aY()) {
            $$1x.a("NoGravity", $$0.aY());
         }

         if ($$0.cg()) {
            $$1x.a("Glowing", $$0.cg());
         }

         if ($$0.cv()) {
            $$1x.a("Invulnerable", $$0.cv());
         }

         $$1x.a("Health", $$0.ex());
      });
   }

   @Deprecated
   static void a(btn $$0, ua $$1) {
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

   static <T extends btl & cfe> Optional<bqq> a(cmv $$0, bqp $$1, T $$2) {
      cuo $$3 = $$0.b($$1);
      if ($$3.g() == cur.qz && $$2.bE()) {
         $$2.a($$2.x(), 1.0F, 1.0F);
         cuo $$4 = $$2.b();
         $$2.n($$4);
         cuo $$5 = cuq.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dcu $$6 = $$2.dQ();
         if (!$$6.B) {
            an.k.a((aqu)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(bqq.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
