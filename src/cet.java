import java.util.Optional;

public interface cet {
   boolean u();

   void w(boolean var1);

   void n(cuc var1);

   void c(tx var1);

   cuc b();

   avg y();

   @Deprecated
   static void a(btd $$0, cuc $$1) {
      $$1.b(kn.g, $$0.ai());
      cwq.a(kn.N, $$1, $$1x -> {
         if ($$0.gd()) {
            $$1x.a("NoAI", $$0.gd());
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
   static void a(btd $$0, tx $$1) {
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
         $$0.u($$1.j("Health"));
      }
   }

   static <T extends btb & cet> Optional<bqg> a(cmk $$0, bqf $$1, T $$2) {
      cuc $$3 = $$0.b($$1);
      if ($$3.g() == cuf.qz && $$2.bE()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cuc $$4 = $$2.b();
         $$2.n($$4);
         cuc $$5 = cue.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dcf $$6 = $$2.dQ();
         if (!$$6.B) {
            am.k.a((aqn)$$0, $$4);
         }

         $$2.ap();
         return Optional.of(bqg.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
