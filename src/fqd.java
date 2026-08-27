public class fqd {
   public static final ur a = ur.c("quickplay.error.title");
   private static final ur b = ur.c("quickplay.error.invalid_identifier");
   private static final ur c = ur.c("quickplay.error.realm_connect");
   private static final ur d = ur.c("quickplay.error.realm_permission");
   private static final ur e = ur.c("gui.toTitle");
   private static final ur f = ur.c("gui.toWorld");
   private static final ur g = ur.c("gui.toRealms");

   public static void a(etd $$0, fgi.c $$1, eom $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ac.b($$3)) {
         a($$0, $$3);
      } else if (!ac.b($$4)) {
         b($$0, $$4);
      } else if (!ac.b($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(etd $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fau $$2 = new ffq(new faz());
         $$0.a(new ezw($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new faz()));
      }
   }

   private static void b(etd $$0, String $$1) {
      flv $$2 = new flv($$0);
      $$2.a();
      flu $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new flu(gda.a("selectServer.defaultName"), $$1, flu.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fmv $$4 = fmv.a($$1);
      ezo.a(new fds(new faz()), $$0, $$4, $$3, true);
   }

   private static void a(etd $$0, eom $$1, String $$2) {
      long $$3;
      epf $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fau $$6 = new eoh(new faz());
         $$0.a(new ezw($$6, a, b, g));
         return;
      } catch (epz var10) {
         fau $$8 = new faz();
         $$0.a(new ezw($$8, a, c, e));
         return;
      }

      epd $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fau $$12 = new eoh(new faz());
         $$0.a(new ezw($$12, a, d, g));
      } else {
         faz $$13 = new faz();
         esc $$14 = new esc($$13, $$11);
         $$0.a(new eqt($$13, $$14));
      }
   }
}
