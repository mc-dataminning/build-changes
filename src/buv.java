import java.util.Optional;

public interface buv {
   boolean t();

   void w(boolean var1);

   void l(cjh var1);

   void c(qy var1);

   cjh b();

   ape y();

   @Deprecated
   static void a(bjk $$0, cjh $$1) {
      qy $$2 = $$1.w();
      if ($$0.ac()) {
         $$1.a($$0.ad());
      }

      if ($$0.fT()) {
         $$2.a("NoAI", $$0.fT());
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
   static void a(bjk $$0, qy $$1) {
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

   static <T extends bji & buv> Optional<bha> a(cbw $$0, bgz $$1, T $$2) {
      cjh $$3 = $$0.b($$1);
      if ($$3.d() == cjk.pL && $$2.bv()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cjh $$4 = $$2.b();
         $$2.l($$4);
         cjh $$5 = cjj.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cpx $$6 = $$2.dL();
         if (!$$6.B) {
            al.j.a((akt)$$0, $$4);
         }

         $$2.ak();
         return Optional.of(bha.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
