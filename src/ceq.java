import java.util.Optional;

public interface ceq {
   boolean u();

   void w(boolean var1);

   void n(cua var1);

   void c(tx var1);

   cua b();

   ave y();

   @Deprecated
   static void a(bta $$0, cua $$1) {
      $$1.b(kn.g, $$0.ah());
      cwo.a(kn.N, $$1, $$1x -> {
         if ($$0.gc()) {
            $$1x.a("NoAI", $$0.gc());
         }

         if ($$0.aW()) {
            $$1x.a("Silent", $$0.aW());
         }

         if ($$0.aX()) {
            $$1x.a("NoGravity", $$0.aX());
         }

         if ($$0.cf()) {
            $$1x.a("Glowing", $$0.cf());
         }

         if ($$0.cu()) {
            $$1x.a("Invulnerable", $$0.cu());
         }

         $$1x.a("Health", $$0.ew());
      });
   }

   @Deprecated
   static void a(bta $$0, tx $$1) {
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
         $$0.u($$1.j("Health"));
      }
   }

   static <T extends bsy & ceq> Optional<bqd> a(cmh $$0, bqc $$1, T $$2) {
      cua $$3 = $$0.b($$1);
      if ($$3.g() == cud.qz && $$2.bD()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cua $$4 = $$2.b();
         $$2.n($$4);
         cua $$5 = cuc.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dcd $$6 = $$2.dP();
         if (!$$6.B) {
            am.k.a((aql)$$0, $$4);
         }

         $$2.ao();
         return Optional.of(bqd.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
