import java.util.Optional;

public interface brn {
   boolean r();

   void w(boolean var1);

   void l(cfz var1);

   void c(qr var1);

   cfz b();

   amg w();

   @Deprecated
   static void a(bgb $$0, cfz $$1) {
      qr $$2 = $$1.w();
      if ($$0.aa()) {
         $$1.a($$0.ab());
      }

      if ($$0.fQ()) {
         $$2.a("NoAI", $$0.fQ());
      }

      if ($$0.aQ()) {
         $$2.a("Silent", $$0.aQ());
      }

      if ($$0.aR()) {
         $$2.a("NoGravity", $$0.aR());
      }

      if ($$0.bZ()) {
         $$2.a("Glowing", $$0.bZ());
      }

      if ($$0.co()) {
         $$2.a("Invulnerable", $$0.co());
      }

      $$2.a("Health", $$0.er());
   }

   @Deprecated
   static void a(bgb $$0, qr $$1) {
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

   static <T extends bfz & brn> Optional<bdx> a(byo $$0, bdw $$1, T $$2) {
      cfz $$3 = $$0.b($$1);
      if ($$3.d() == cgc.pL && $$2.bs()) {
         $$2.a($$2.w(), 1.0F, 1.0F);
         cfz $$4 = $$2.b();
         $$2.l($$4);
         cfz $$5 = cgb.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cmm $$6 = $$2.dI();
         if (!$$6.B) {
            ai.j.a((aig)$$0, $$4);
         }

         $$2.ai();
         return Optional.of(bdx.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
