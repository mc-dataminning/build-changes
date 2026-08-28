import java.util.Optional;

public interface cjb {
   boolean m();

   void w(boolean var1);

   void a_(czn var1);

   void h(tz var1);

   czn S_();

   awm n();

   @Deprecated
   static void a(bxl $$0, czn $$1) {
      $$1.a(kk.g, $$0);
      dbv.a(kk.Z, $$1, $$1x -> {
         if ($$0.gi()) {
            $$1x.a("NoAI", $$0.gi());
         }

         if ($$0.aZ()) {
            $$1x.a("Silent", $$0.aZ());
         }

         if ($$0.ba()) {
            $$1x.a("NoGravity", $$0.ba());
         }

         if ($$0.cl()) {
            $$1x.a("Glowing", $$0.cl());
         }

         if ($$0.cB()) {
            $$1x.a("Invulnerable", $$0.cB());
         }

         $$1x.a("Health", $$0.eF());
      });
   }

   @Deprecated
   static void a(bxl $$0, tz $$1) {
      if ($$1.c("NoAI")) {
         $$0.t($$1.o("NoAI"));
      }

      if ($$1.c("Silent")) {
         $$0.e($$1.o("Silent"));
      }

      if ($$1.c("NoGravity")) {
         $$0.f($$1.o("NoGravity"));
      }

      if ($$1.c("Glowing")) {
         $$0.j($$1.o("Glowing"));
      }

      if ($$1.c("Invulnerable")) {
         $$0.m($$1.o("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.d($$1.h("Health"));
      }
   }

   static <T extends bxj & cjb> Optional<bug> a(crm $$0, buf $$1, T $$2) {
      czn $$3 = $$0.b($$1);
      if ($$3.h() == czr.rp && $$2.bI()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         czn $$4 = $$2.S_();
         $$2.a_($$4);
         czn $$5 = czq.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         djm $$6 = $$2.dU();
         if (!$$6.C) {
            aq.k.a((arr)$$0, $$4);
         }

         $$2.aq();
         return Optional.of(bug.a);
      } else {
         return Optional.empty();
      }
   }
}
