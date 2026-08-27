public class fpq {
   public static final ur a = ur.c("quickplay.error.title");
   private static final ur b = ur.c("quickplay.error.invalid_identifier");
   private static final ur c = ur.c("quickplay.error.realm_connect");
   private static final ur d = ur.c("quickplay.error.realm_permission");
   private static final ur e = ur.c("gui.toTitle");
   private static final ur f = ur.c("gui.toWorld");
   private static final ur g = ur.c("gui.toRealms");

   public static void a(esr $$0, ffv.c $$1, eoa $$2) {
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

   private static void a(esr $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fah $$2 = new ffd(new fam());
         $$0.a(new ezj($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fam()));
      }
   }

   private static void b(esr $$0, String $$1) {
      fli $$2 = new fli($$0);
      $$2.a();
      flh $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new flh(gcn.a("selectServer.defaultName"), $$1, flh.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fmi $$4 = fmi.a($$1);
      ezb.a(new fdf(new fam()), $$0, $$4, $$3, true);
   }

   private static void a(esr $$0, eoa $$1, String $$2) {
      long $$3;
      eot $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fah $$6 = new env(new fam());
         $$0.a(new ezj($$6, a, b, g));
         return;
      } catch (epn var10) {
         fah $$8 = new fam();
         $$0.a(new ezj($$8, a, c, e));
         return;
      }

      eor $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fah $$12 = new env(new fam());
         $$0.a(new ezj($$12, a, d, g));
      } else {
         fam $$13 = new fam();
         erq $$14 = new erq($$13, $$11);
         $$0.a(new eqh($$13, $$14));
      }
   }
}
