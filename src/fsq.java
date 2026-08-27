public class fsq {
   public static final vf a = vf.c("quickplay.error.title");
   private static final vf b = vf.c("quickplay.error.invalid_identifier");
   private static final vf c = vf.c("quickplay.error.realm_connect");
   private static final vf d = vf.c("quickplay.error.realm_permission");
   private static final vf e = vf.c("gui.toTitle");
   private static final vf f = vf.c("gui.toWorld");
   private static final vf g = vf.c("gui.toRealms");

   public static void a(evi $$0, fip.c $$1, eqr $$2) {
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

   private static void a(evi $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fdb $$2 = new fhx(new fdg());
         $$0.a(new fcd($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fdg()));
      }
   }

   private static void b(evi $$0, String $$1) {
      foe $$2 = new foe($$0);
      $$2.a();
      fod $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fod(gfs.a("selectServer.defaultName"), $$1, fod.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fpf $$4 = fpf.a($$1);
      fbv.a(new ffz(new fdg()), $$0, $$4, $$3, true);
   }

   private static void a(evi $$0, eqr $$1, String $$2) {
      long $$3;
      erk $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fdb $$6 = new eqm(new fdg());
         $$0.a(new fcd($$6, a, b, g));
         return;
      } catch (ese var10) {
         fdb $$8 = new fdg();
         $$0.a(new fcd($$8, a, c, e));
         return;
      }

      eri $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fdb $$12 = new eqm(new fdg());
         $$0.a(new fcd($$12, a, d, g));
      } else {
         fdg $$13 = new fdg();
         euh $$14 = new euh($$13, $$11);
         $$0.a(new esy($$13, $$14));
      }
   }
}
