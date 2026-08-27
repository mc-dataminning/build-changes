public class fnp {
   public static final tn a = tn.c("quickplay.error.title");
   private static final tn b = tn.c("quickplay.error.invalid_identifier");
   private static final tn c = tn.c("quickplay.error.realm_connect");
   private static final tn d = tn.c("quickplay.error.realm_permission");
   private static final tn e = tn.c("gui.toTitle");
   private static final tn f = tn.c("gui.toWorld");
   private static final tn g = tn.c("gui.toRealms");

   public static void a(eqx $$0, fdy.c $$1, emh $$2) {
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

   private static void a(eqx $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         eym $$2 = new fdg(new eyr());
         $$0.a(new exo($$2, a, b, f));
      } else {
         $$0.d(new exs(tn.c("selectWorld.data_read")));
         $$0.y().a(new eyr(), $$1);
      }
   }

   private static void b(eqx $$0, String $$1) {
      fjk $$2 = new fjk($$0);
      $$2.a();
      fjj $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fjj(gam.a("selectServer.defaultName"), $$1, fjj.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fkk $$4 = fkk.a($$1);
      exg.a(new fbi(new eyr()), $$0, $$4, $$3, true);
   }

   private static void a(eqx $$0, emh $$1, String $$2) {
      long $$3;
      ena $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         eym $$6 = new emc(new eyr());
         $$0.a(new exo($$6, a, b, g));
         return;
      } catch (enu var10) {
         eym $$8 = new eyr();
         $$0.a(new exo($$8, a, c, e));
         return;
      }

      emy $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         eym $$12 = new emc(new eyr());
         $$0.a(new exo($$12, a, d, g));
      } else {
         eyr $$13 = new eyr();
         epw $$14 = new epw($$13, $$11);
         $$0.a(new eoo($$13, $$14));
      }
   }
}
