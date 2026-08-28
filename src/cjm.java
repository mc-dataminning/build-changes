import java.util.Optional;

public interface cjm {
   boolean m();

   void w(boolean var1);

   void a_(czy var1);

   void d(tz var1);

   czy W_();

   awo n();

   @Deprecated
   static void a(bxw $$0, czy $$1) {
      $$1.a(kk.g, $$0);
      dcg.a(kk.Z, $$1, $$1x -> {
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
   static void a(bxw $$0, tz $$1) {
      $$1.q("NoAI").ifPresent($$0::t);
      $$1.q("Silent").ifPresent($$0::e);
      $$1.q("NoGravity").ifPresent($$0::f);
      $$1.q("Glowing").ifPresent($$0::j);
      $$1.q("Invulnerable").ifPresent($$0::m);
      $$1.g("Health").ifPresent($$0::d);
   }

   static <T extends bxu & cjm> Optional<bur> a(crx $$0, buq $$1, T $$2) {
      czy $$3 = $$0.b($$1);
      if ($$3.h() == dac.rp && $$2.bJ()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         czy $$4 = $$2.W_();
         $$2.a_($$4);
         czy $$5 = dab.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         djx $$6 = $$2.dV();
         if (!$$6.C) {
            aq.k.a((art)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(bur.a);
      } else {
         return Optional.empty();
      }
   }
}
