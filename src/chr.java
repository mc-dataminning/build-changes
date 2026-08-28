import java.util.Optional;

public interface chr {
   boolean m();

   void w(boolean var1);

   void i(cxh var1);

   void h(tq var1);

   cxh R_();

   avz n();

   @Deprecated
   static void a(bwa $$0, cxh $$1) {
      $$1.b(kv.g, $$0.an());
      czo.a(kv.Z, $$1, $$1x -> {
         if ($$0.gh()) {
            $$1x.a("NoAI", $$0.gh());
         }

         if ($$0.bb()) {
            $$1x.a("Silent", $$0.bb());
         }

         if ($$0.bc()) {
            $$1x.a("NoGravity", $$0.bc());
         }

         if ($$0.cm()) {
            $$1x.a("Glowing", $$0.cm());
         }

         if ($$0.cB()) {
            $$1x.a("Invulnerable", $$0.cB());
         }

         $$1x.a("Health", $$0.eE());
      });
   }

   @Deprecated
   static void a(bwa $$0, tq $$1) {
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

   static <T extends bvy & chr> Optional<bsy> a(cpr $$0, bsx $$1, T $$2) {
      cxh $$3 = $$0.b($$1);
      if ($$3.h() == cxl.ri && $$2.bJ()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         cxh $$4 = $$2.R_();
         $$2.i($$4);
         cxh $$5 = cxk.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dgz $$6 = $$2.dU();
         if (!$$6.C) {
            ap.k.a((are)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bsy.a);
      } else {
         return Optional.empty();
      }
   }
}
