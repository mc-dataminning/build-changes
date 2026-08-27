import java.util.Optional;

public interface but {
   boolean t();

   void w(boolean var1);

   void l(cjf var1);

   void c(qw var1);

   cjf b();

   apc y();

   @Deprecated
   static void a(bji $$0, cjf $$1) {
      qw $$2 = $$1.w();
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
   static void a(bji $$0, qw $$1) {
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

   static <T extends bjg & but> Optional<bgy> a(cbu $$0, bgx $$1, T $$2) {
      cjf $$3 = $$0.b($$1);
      if ($$3.d() == cji.pL && $$2.bv()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         cjf $$4 = $$2.b();
         $$2.l($$4);
         cjf $$5 = cjh.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cpv $$6 = $$2.dL();
         if (!$$6.B) {
            al.j.a((akr)$$0, $$4);
         }

         $$2.ak();
         return Optional.of(bgy.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
