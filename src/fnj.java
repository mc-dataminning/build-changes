public class fnj {
   public static final tl a = tl.c("quickplay.error.title");
   private static final tl b = tl.c("quickplay.error.invalid_identifier");
   private static final tl c = tl.c("quickplay.error.realm_connect");
   private static final tl d = tl.c("quickplay.error.realm_permission");
   private static final tl e = tl.c("gui.toTitle");
   private static final tl f = tl.c("gui.toWorld");
   private static final tl g = tl.c("gui.toRealms");

   public static void a(eqp $$0, fdr.c $$1, elz $$2) {
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

   private static void a(eqp $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         eye $$2 = new fcz(new eyj());
         $$0.a(new exh($$2, a, b, f));
      } else {
         $$0.d(new exl(tl.c("selectWorld.data_read")));
         $$0.y().a(new eyj(), $$1);
      }
   }

   private static void b(eqp $$0, String $$1) {
      fje $$2 = new fje($$0);
      $$2.a();
      fjd $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fjd(gag.a("selectServer.defaultName"), $$1, fjd.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fke $$4 = fke.a($$1);
      ewz.a(new fbb(new eyj()), $$0, $$4, $$3, true);
   }

   private static void a(eqp $$0, elz $$1, String $$2) {
      long $$3;
      ems $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         eye $$6 = new elu(new eyj());
         $$0.a(new exh($$6, a, b, g));
         return;
      } catch (enm var10) {
         eye $$8 = new eyj();
         $$0.a(new exh($$8, a, c, e));
         return;
      }

      emq $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         eye $$12 = new elu(new eyj());
         $$0.a(new exh($$12, a, d, g));
      } else {
         eyj $$13 = new eyj();
         epo $$14 = new epo($$13, $$11);
         $$0.a(new eog($$13, $$14));
      }
   }
}
