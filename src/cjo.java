import java.util.Optional;

public interface cjo {
   boolean m();

   void w(boolean var1);

   void a_(daa var1);

   void d(ua var1);

   daa W_();

   awq n();

   @Deprecated
   static void a(bxy $$0, daa $$1) {
      $$1.a(kl.g, $$0);
      dci.a(kl.Z, $$1, $$1x -> {
         if ($$0.gj()) {
            $$1x.a("NoAI", $$0.gj());
         }

         if ($$0.ba()) {
            $$1x.a("Silent", $$0.ba());
         }

         if ($$0.bb()) {
            $$1x.a("NoGravity", $$0.bb());
         }

         if ($$0.cm()) {
            $$1x.a("Glowing", $$0.cm());
         }

         if ($$0.cC()) {
            $$1x.a("Invulnerable", $$0.cC());
         }

         $$1x.a("Health", $$0.eG());
      });
   }

   @Deprecated
   static void a(bxy $$0, ua $$1) {
      $$1.q("NoAI").ifPresent($$0::t);
      $$1.q("Silent").ifPresent($$0::e);
      $$1.q("NoGravity").ifPresent($$0::f);
      $$1.q("Glowing").ifPresent($$0::j);
      $$1.q("Invulnerable").ifPresent($$0::m);
      $$1.g("Health").ifPresent($$0::d);
   }

   static <T extends bxw & cjo> Optional<but> a(crz $$0, bus $$1, T $$2) {
      daa $$3 = $$0.b($$1);
      if ($$3.h() == dae.rp && $$2.bJ()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         daa $$4 = $$2.W_();
         $$2.a_($$4);
         daa $$5 = dad.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         djz $$6 = $$2.dV();
         if (!$$6.C) {
            aq.k.a((arv)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(but.a);
      } else {
         return Optional.empty();
      }
   }
}
