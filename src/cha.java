import java.util.Optional;

public interface cha {
   boolean q();

   void x(boolean var1);

   void i(cwm var1);

   void h(ul var1);

   cwm V_();

   awm v();

   @Deprecated
   static void a(bvj $$0, cwm $$1) {
      $$1.b(ku.g, $$0.an());
      cyv.a(ku.X, $$1, $$1x -> {
         if ($$0.fZ()) {
            $$1x.a("NoAI", $$0.fZ());
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
   static void a(bvj $$0, ul $$1) {
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

   static <T extends bvh & cha> Optional<bsk> a(cou $$0, bsj $$1, T $$2) {
      cwm $$3 = $$0.b($$1);
      if ($$3.h() == cwq.qA && $$2.bL()) {
         $$2.a($$2.v(), 1.0F, 1.0F);
         cwm $$4 = $$2.V_();
         $$2.i($$4);
         cwm $$5 = cwp.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dfm $$6 = $$2.dV();
         if (!$$6.C) {
            ao.k.a((arq)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bsk.a);
      } else {
         return Optional.empty();
      }
   }
}
