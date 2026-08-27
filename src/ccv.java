import java.util.Optional;

public interface ccv {
   boolean u();

   void w(boolean var1);

   void n(csd var1);

   void c(ty var1);

   csd b();

   auy y();

   @Deprecated
   static void a(brg $$0, csd $$1) {
      $$1.b(jz.d, $$0.af());
      cuq.a(jz.E, $$1, $$1x -> {
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
   static void a(brg $$0, ty $$1) {
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

   static <T extends bre & ccv> Optional<boq> a(ckl $$0, bop $$1, T $$2) {
      csd $$3 = $$0.b($$1);
      if ($$3.f() == csg.qz && $$2.bB()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         csd $$4 = $$2.b();
         $$2.n($$4);
         csd $$5 = csf.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         czu $$6 = $$2.dN();
         if (!$$6.B) {
            am.k.a((aqf)$$0, $$4);
         }

         $$2.am();
         return Optional.of(boq.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
