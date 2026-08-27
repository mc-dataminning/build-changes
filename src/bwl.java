import java.util.Optional;

public interface bwl {
   boolean t();

   void w(boolean var1);

   void l(clb var1);

   void c(rz var1);

   clb b();

   aqm y();

   @Deprecated
   static void a(bla $$0, clb $$1) {
      rz $$2 = $$1.w();
      if ($$0.ac()) {
         $$1.a($$0.ad());
      }

      if ($$0.fU()) {
         $$2.a("NoAI", $$0.fU());
      }

      if ($$0.aS()) {
         $$2.a("Silent", $$0.aS());
      }

      if ($$0.aT()) {
         $$2.a("NoGravity", $$0.aT());
      }

      if ($$0.cb()) {
         $$2.a("Glowing", $$0.cb());
      }

      if ($$0.cq()) {
         $$2.a("Invulnerable", $$0.cq());
      }

      $$2.a("Health", $$0.eu());
   }

   @Deprecated
   static void a(bla $$0, rz $$1) {
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
         $$0.c($$1.j("Health"));
      }
   }

   static <T extends bky & bwl> Optional<biq> a(cdm $$0, bip $$1, T $$2) {
      clb $$3 = $$0.b($$1);
      if ($$3.d() == cle.pL && $$2.bv()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         clb $$4 = $$2.b();
         $$2.l($$4);
         clb $$5 = cld.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         crs $$6 = $$2.dL();
         if (!$$6.B) {
            al.j.a((amb)$$0, $$4);
         }

         $$2.ak();
         return Optional.of(biq.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
