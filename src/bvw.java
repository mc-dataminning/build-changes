import java.util.Optional;

public interface bvw {
   boolean t();

   void w(boolean var1);

   void l(ckj var1);

   void c(rt var1);

   ckj b();

   aqc y();

   @Deprecated
   static void a(bkl $$0, ckj $$1) {
      rt $$2 = $$1.w();
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
   static void a(bkl $$0, rt $$1) {
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

   static <T extends bkj & bvw> Optional<bib> a(ccx $$0, bia $$1, T $$2) {
      ckj $$3 = $$0.b($$1);
      if ($$3.d() == ckm.pL && $$2.bv()) {
         $$2.a($$2.y(), 1.0F, 1.0F);
         ckj $$4 = $$2.b();
         $$2.l($$4);
         ckj $$5 = ckl.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cqz $$6 = $$2.dL();
         if (!$$6.B) {
            al.j.a((alr)$$0, $$4);
         }

         $$2.ak();
         return Optional.of(bib.a($$6.B));
      } else {
         return Optional.empty();
      }
   }
}
