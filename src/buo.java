import java.util.Optional;

public interface buo {
   boolean q();

   void w(boolean var1);

   void l(cja var1);

   void c(qu var1);

   cja b();

   aoy t();

   @Deprecated
   static void a(bjd $$0, cja $$1) {
      qu $$2 = $$1.w();
      if ($$0.ac()) {
         $$1.a($$0.ad());
      }

      if ($$0.fQ()) {
         $$2.a("NoAI", $$0.fQ());
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

      $$2.a("Health", $$0.et());
   }

   @Deprecated
   static void a(bjd $$0, qu $$1) {
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

   static <T extends bjb & buo> Optional<bgt> a(cbp $$0, bgs $$1, T $$2) {
      cja $$3 = $$0.b($$1);
      if ($$3.d() == cjd.pL && $$2.bv()) {
         $$2.a($$2.t(), 1.0F, 1.0F);
         cja $$4 = $$2.b();
         $$2.l($$4);
         cja $$5 = cjc.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cpq $$6 = $$2.dK();
         if (!$$6.B) {
            al.j.a((ako)$$0, $$4);
         }

         $$2.ak();
         return Optional.of(bgt.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
