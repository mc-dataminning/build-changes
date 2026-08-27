import java.util.Optional;

public interface ccf {
   boolean u();

   void w(boolean var1);

   void n(crj var1);

   void c(tm var1);

   crj b();

   aul y();

   @Deprecated
   static void a(bqq $$0, crj $$1) {
      $$1.b(jp.d, $$0.af());
      ctt.a(jp.E, $$1, $$1x -> {
         if ($$0.gd()) {
            $$1x.a("NoAI", $$0.gd());
         }

         if ($$0.aU()) {
            $$1x.a("Silent", $$0.aU());
         }

         if ($$0.aV()) {
            $$1x.a("NoGravity", $$0.aV());
         }

         if ($$0.cc()) {
            $$1x.a("Glowing", $$0.cc());
         }

         if ($$0.cr()) {
            $$1x.a("Invulnerable", $$0.cr());
         }

         $$1x.a("Health", $$0.ex());
      });
   }

   @Deprecated
   static void a(bqq $$0, tm $$1) {
      if ($$1.e("NoAI")) {
         $$0.t($$1.q("NoAI"));
      }

      if ($$1.e("Silent")) {
         $$0.d($$1.q("Silent"));
      }

      if ($$1.e("NoGravity")) {
         $$0.e($$1.q("NoGravity"));
      }

      if ($$1.e("Glowing")) {
         $$0.i($$1.q("Glowing"));
      }

      if ($$1.e("Invulnerable")) {
         $$0.m($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.t($$1.j("Health"));
      }
   }

   static <T extends bqo & ccf> Optional<boa> a(cjt $$0, bnz $$1, T $$2) {
      crj $$3 = $$0.b($$1);
      if ($$3.f() == crm.qy && $$2.bA()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         crj $$4 = $$2.b();
         $$2.n($$4);
         crj $$5 = crl.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cyx $$6 = $$2.dM();
         if (!$$6.B) {
            am.k.a((apt)$$0, $$4);
         }

         $$2.am();
         return Optional.of(boa.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
