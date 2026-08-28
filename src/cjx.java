import java.util.Optional;

public interface cjx {
   boolean m();

   void w(boolean var1);

   void a_(dak var1);

   void d(ua var1);

   dak X_();

   awx n();

   @Deprecated
   static void a(byh $$0, dak $$1) {
      $$1.a(kl.g, $$0);
      dcs.a(kl.Z, $$1, $$1x -> {
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
   static void a(byh $$0, ua $$1) {
      $$1.q("NoAI").ifPresent($$0::t);
      $$1.q("Silent").ifPresent($$0::e);
      $$1.q("NoGravity").ifPresent($$0::f);
      $$1.q("Glowing").ifPresent($$0::j);
      $$1.q("Invulnerable").ifPresent($$0::m);
      $$1.g("Health").ifPresent($$0::d);
   }

   static <T extends byf & cjx> Optional<bvc> a(csi $$0, bvb $$1, T $$2) {
      dak $$3 = $$0.b($$1);
      if ($$3.h() == dao.rp && $$2.bJ()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         dak $$4 = $$2.X_();
         $$2.a_($$4);
         dak $$5 = dan.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dkj $$6 = $$2.dV();
         if (!$$6.C) {
            aq.k.a((asc)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(bvc.a);
      } else {
         return Optional.empty();
      }
   }
}
