public class fqi {
   public static final uv a = uv.c("quickplay.error.title");
   private static final uv b = uv.c("quickplay.error.invalid_identifier");
   private static final uv c = uv.c("quickplay.error.realm_connect");
   private static final uv d = uv.c("quickplay.error.realm_permission");
   private static final uv e = uv.c("gui.toTitle");
   private static final uv f = uv.c("gui.toWorld");
   private static final uv g = uv.c("gui.toRealms");

   public static void a(eti $$0, fgn.c $$1, eor $$2) {
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

   private static void a(eti $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         faz $$2 = new ffv(new fbe());
         $$0.a(new fab($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fbe()));
      }
   }

   private static void b(eti $$0, String $$1) {
      fma $$2 = new fma($$0);
      $$2.a();
      flz $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new flz(gdf.a("selectServer.defaultName"), $$1, flz.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fna $$4 = fna.a($$1);
      ezt.a(new fdx(new fbe()), $$0, $$4, $$3, true);
   }

   private static void a(eti $$0, eor $$1, String $$2) {
      long $$3;
      epk $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         faz $$6 = new eom(new fbe());
         $$0.a(new fab($$6, a, b, g));
         return;
      } catch (eqe var10) {
         faz $$8 = new fbe();
         $$0.a(new fab($$8, a, c, e));
         return;
      }

      epi $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         faz $$12 = new eom(new fbe());
         $$0.a(new fab($$12, a, d, g));
      } else {
         fbe $$13 = new fbe();
         esh $$14 = new esh($$13, $$11);
         $$0.a(new eqy($$13, $$14));
      }
   }
}
