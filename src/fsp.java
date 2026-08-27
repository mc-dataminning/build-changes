public class fsp {
   public static final vf a = vf.c("quickplay.error.title");
   private static final vf b = vf.c("quickplay.error.invalid_identifier");
   private static final vf c = vf.c("quickplay.error.realm_connect");
   private static final vf d = vf.c("quickplay.error.realm_permission");
   private static final vf e = vf.c("gui.toTitle");
   private static final vf f = vf.c("gui.toWorld");
   private static final vf g = vf.c("gui.toRealms");

   public static void a(evh $$0, fio.c $$1, eqq $$2) {
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

   private static void a(evh $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fda $$2 = new fhw(new fdf());
         $$0.a(new fcc($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fdf()));
      }
   }

   private static void b(evh $$0, String $$1) {
      fod $$2 = new fod($$0);
      $$2.a();
      foc $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new foc(gfr.a("selectServer.defaultName"), $$1, foc.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fpe $$4 = fpe.a($$1);
      fbu.a(new ffy(new fdf()), $$0, $$4, $$3, true);
   }

   private static void a(evh $$0, eqq $$1, String $$2) {
      long $$3;
      erj $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fda $$6 = new eql(new fdf());
         $$0.a(new fcc($$6, a, b, g));
         return;
      } catch (esd var10) {
         fda $$8 = new fdf();
         $$0.a(new fcc($$8, a, c, e));
         return;
      }

      erh $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fda $$12 = new eql(new fdf());
         $$0.a(new fcc($$12, a, d, g));
      } else {
         fdf $$13 = new fdf();
         eug $$14 = new eug($$13, $$11);
         $$0.a(new esx($$13, $$14));
      }
   }
}
