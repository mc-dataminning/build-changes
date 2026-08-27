import java.util.Optional;

public interface cdr {
   boolean u();

   void w(boolean var1);

   void n(csz var1);

   void c(ua var1);

   csz b();

   avb y();

   @Deprecated
   static void a(bsc $$0, csz $$1) {
      $$1.b(ka.f, $$0.af());
      cvm.a(ka.L, $$1, $$1x -> {
         if ($$0.gf()) {
            $$1x.a("NoAI", $$0.gf());
         }

         if ($$0.aU()) {
            $$1x.a("Silent", $$0.aU());
         }

         if ($$0.aV()) {
            $$1x.a("NoGravity", $$0.aV());
         }

         if ($$0.cd()) {
            $$1x.a("Glowing", $$0.cd());
         }

         if ($$0.cs()) {
            $$1x.a("Invulnerable", $$0.cs());
         }

         $$1x.a("Health", $$0.ey());
      });
   }

   @Deprecated
   static void a(bsc $$0, ua $$1) {
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
         $$0.t($$1.j("Health"));
      }
   }

   static <T extends bsa & cdr> Optional<bpm> a(clh $$0, bpl $$1, T $$2) {
      csz $$3 = $$0.b($$1);
      if ($$3.f() == ctc.qz && $$2.bB()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         csz $$4 = $$2.b();
         $$2.n($$4);
         csz $$5 = ctb.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dad $$6 = $$2.dN();
         if (!$$6.B) {
            am.k.a((aqi)$$0, $$4);
         }

         $$2.am();
         return Optional.of(bpm.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
