import java.util.Optional;

public interface ciw {
   boolean m();

   void w(boolean var1);

   void a_(czd var1);

   void h(tz var1);

   czd S_();

   awm n();

   @Deprecated
   static void a(bxg $$0, czd $$1) {
      $$1.a(kj.g, $$0);
      dbl.a(kj.Z, $$1, $$1x -> {
         if ($$0.gg()) {
            $$1x.a("NoAI", $$0.gg());
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

         $$1x.a("Health", $$0.eG());
      });
   }

   @Deprecated
   static void a(bxg $$0, tz $$1) {
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
         $$0.m($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.d($$1.j("Health"));
      }
   }

   static <T extends bxe & ciw> Optional<bud> a(crc $$0, buc $$1, T $$2) {
      czd $$3 = $$0.b($$1);
      if ($$3.h() == czh.rp && $$2.bK()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         czd $$4 = $$2.S_();
         $$2.a_($$4);
         czd $$5 = czg.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dja $$6 = $$2.dV();
         if (!$$6.C) {
            ap.k.a((arr)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bud.a);
      } else {
         return Optional.empty();
      }
   }
}
