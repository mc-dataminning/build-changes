import java.util.Optional;

public interface cfg {
   boolean t();

   void w(boolean var1);

   void n(cuq var1);

   void h(ub var1);

   cuq b();

   avo x();

   @Deprecated
   static void a(btp $$0, cuq $$1) {
      $$1.b(kq.g, $$0.aj());
      cxh.a(kq.N, $$1, $$1x -> {
         if ($$0.ga()) {
            $$1x.a("NoAI", $$0.ga());
         }

         if ($$0.aX()) {
            $$1x.a("Silent", $$0.aX());
         }

         if ($$0.aY()) {
            $$1x.a("NoGravity", $$0.aY());
         }

         if ($$0.cg()) {
            $$1x.a("Glowing", $$0.cg());
         }

         if ($$0.cv()) {
            $$1x.a("Invulnerable", $$0.cv());
         }

         $$1x.a("Health", $$0.ex());
      });
   }

   @Deprecated
   static void a(btp $$0, ub $$1) {
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
         $$0.v($$1.j("Health"));
      }
   }

   static <T extends btn & cfg> Optional<bqr> a(cmx $$0, bqq $$1, T $$2) {
      cuq $$3 = $$0.b($$1);
      if ($$3.g() == cut.qz && $$2.bE()) {
         $$2.a($$2.x(), 1.0F, 1.0F);
         cuq $$4 = $$2.b();
         $$2.n($$4);
         cuq $$5 = cus.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dcw $$6 = $$2.dP();
         if (!$$6.B) {
            an.k.a((aqv)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(bqr.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
