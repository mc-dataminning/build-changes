public class foj {
   public static final ui a = ui.c("quickplay.error.title");
   private static final ui b = ui.c("quickplay.error.invalid_identifier");
   private static final ui c = ui.c("quickplay.error.realm_connect");
   private static final ui d = ui.c("quickplay.error.realm_permission");
   private static final ui e = ui.c("gui.toTitle");
   private static final ui f = ui.c("gui.toWorld");
   private static final ui g = ui.c("gui.toRealms");

   public static void a(ero $$0, feq.c $$1, emx $$2) {
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

   private static void a(ero $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         ezd $$2 = new fdy(new ezi());
         $$0.a(new eyg($$2, a, b, f));
      } else {
         $$0.d(new eyk(ui.c("selectWorld.data_read")));
         $$0.y().a(new ezi(), $$1);
      }
   }

   private static void b(ero $$0, String $$1) {
      fkd $$2 = new fkd($$0);
      $$2.a();
      fkc $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fkc(gbg.a("selectServer.defaultName"), $$1, fkc.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fld $$4 = fld.a($$1);
      exy.a(new fca(new ezi()), $$0, $$4, $$3, true);
   }

   private static void a(ero $$0, emx $$1, String $$2) {
      long $$3;
      enq $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ezd $$6 = new ems(new ezi());
         $$0.a(new eyg($$6, a, b, g));
         return;
      } catch (eok var10) {
         ezd $$8 = new ezi();
         $$0.a(new eyg($$8, a, c, e));
         return;
      }

      eno $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ezd $$12 = new ems(new ezi());
         $$0.a(new eyg($$12, a, d, g));
      } else {
         ezi $$13 = new ezi();
         eqn $$14 = new eqn($$13, $$11);
         $$0.a(new epe($$13, $$14));
      }
   }
}
