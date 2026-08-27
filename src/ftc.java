public class ftc {
   public static final vg a = vg.c("quickplay.error.title");
   private static final vg b = vg.c("quickplay.error.invalid_identifier");
   private static final vg c = vg.c("quickplay.error.realm_connect");
   private static final vg d = vg.c("quickplay.error.realm_permission");
   private static final vg e = vg.c("gui.toTitle");
   private static final vg f = vg.c("gui.toWorld");
   private static final vg g = vg.c("gui.toRealms");

   public static void a(evr $$0, fja.c $$1, era $$2) {
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

   private static void a(evr $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fdm $$2 = new fii(new fdr());
         $$0.a(new fco($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fdr()));
      }
   }

   private static void b(evr $$0, String $$1) {
      foq $$2 = new foq($$0);
      $$2.a();
      fop $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fop(ggg.a("selectServer.defaultName"), $$1, fop.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fpr $$4 = fpr.a($$1);
      fcg.a(new fgk(new fdr()), $$0, $$4, $$3, true);
   }

   private static void a(evr $$0, era $$1, String $$2) {
      long $$3;
      ert $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fdm $$6 = new eqv(new fdr());
         $$0.a(new fco($$6, a, b, g));
         return;
      } catch (esn var10) {
         fdm $$8 = new fdr();
         $$0.a(new fco($$8, a, c, e));
         return;
      }

      err $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fdm $$12 = new eqv(new fdr());
         $$0.a(new fco($$12, a, d, g));
      } else {
         fdr $$13 = new fdr();
         euq $$14 = new euq($$13, $$11);
         $$0.a(new eth($$13, $$14));
      }
   }
}
