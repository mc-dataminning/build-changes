import java.util.Optional;

public interface chb {
   boolean p();

   void x(boolean var1);

   void i(cwq var1);

   void h(tq var1);

   cwq W_();

   avz t();

   @Deprecated
   static void a(bvk $$0, cwq $$1) {
      $$1.b(kv.g, $$0.an());
      cyz.a(kv.X, $$1, $$1x -> {
         if ($$0.gf()) {
            $$1x.a("NoAI", $$0.gf());
         }

         if ($$0.bb()) {
            $$1x.a("Silent", $$0.bb());
         }

         if ($$0.bc()) {
            $$1x.a("NoGravity", $$0.bc());
         }

         if ($$0.cn()) {
            $$1x.a("Glowing", $$0.cn());
         }

         if ($$0.cC()) {
            $$1x.a("Invulnerable", $$0.cC());
         }

         $$1x.a("Health", $$0.eD());
      });
   }

   @Deprecated
   static void a(bvk $$0, tq $$1) {
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

   static <T extends bvi & chb> Optional<bsl> a(coy $$0, bsk $$1, T $$2) {
      cwq $$3 = $$0.b($$1);
      if ($$3.h() == cwu.rg && $$2.bL()) {
         $$2.a($$2.t(), 1.0F, 1.0F);
         cwq $$4 = $$2.W_();
         $$2.i($$4);
         cwq $$5 = cwt.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dgj $$6 = $$2.dV();
         if (!$$6.C) {
            ap.k.a((are)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bsl.a);
      } else {
         return Optional.empty();
      }
   }
}
