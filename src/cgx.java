import java.util.Optional;

public interface cgx {
   boolean t();

   void x(boolean var1);

   void k(cwf var1);

   void h(un var1);

   cwf X_();

   awn y();

   @Deprecated
   static void a(bvg $$0, cwf $$1) {
      $$1.b(ku.g, $$0.ao());
      cyo.a(ku.X, $$1, $$1x -> {
         if ($$0.gi()) {
            $$1x.a("NoAI", $$0.gi());
         }

         if ($$0.bd()) {
            $$1x.a("Silent", $$0.bd());
         }

         if ($$0.be()) {
            $$1x.a("NoGravity", $$0.be());
         }

         if ($$0.cp()) {
            $$1x.a("Glowing", $$0.cp());
         }

         if ($$0.cE()) {
            $$1x.a("Invulnerable", $$0.cE());
         }

         $$1x.a("Health", $$0.eH());
      });
   }

   @Deprecated
   static void a(bvg $$0, un $$1) {
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

   static <T extends bve & cgx> Optional<bsh> a(cor $$0, bsg $$1, T $$2) {
      cwf $$3 = $$0.b($$1);
      if ($$3.h() == cwj.qA && $$2.bN()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cwf $$4 = $$2.X_();
         $$2.k($$4);
         cwf $$5 = cwi.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dff $$6 = $$2.dY();
         if (!$$6.C) {
            ao.k.a((arr)$$0, $$4);
         }

         $$2.av();
         return Optional.of(bsh.a);
      } else {
         return Optional.empty();
      }
   }
}
