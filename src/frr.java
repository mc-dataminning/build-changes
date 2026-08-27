public class frr {
   public static final vb a = vb.c("quickplay.error.title");
   private static final vb b = vb.c("quickplay.error.invalid_identifier");
   private static final vb c = vb.c("quickplay.error.realm_connect");
   private static final vb d = vb.c("quickplay.error.realm_permission");
   private static final vb e = vb.c("gui.toTitle");
   private static final vb f = vb.c("gui.toWorld");
   private static final vb g = vb.c("gui.toRealms");

   public static void a(euk $$0, fhq.c $$1, ept $$2) {
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

   private static void a(euk $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fcc $$2 = new fgy(new fch());
         $$0.a(new fbe($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fch()));
      }
   }

   private static void b(euk $$0, String $$1) {
      fnf $$2 = new fnf($$0);
      $$2.a();
      fne $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fne(geu.a("selectServer.defaultName"), $$1, fne.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fof $$4 = fof.a($$1);
      faw.a(new ffa(new fch()), $$0, $$4, $$3, true);
   }

   private static void a(euk $$0, ept $$1, String $$2) {
      long $$3;
      eqm $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fcc $$6 = new epo(new fch());
         $$0.a(new fbe($$6, a, b, g));
         return;
      } catch (erg var10) {
         fcc $$8 = new fch();
         $$0.a(new fbe($$8, a, c, e));
         return;
      }

      eqk $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fcc $$12 = new epo(new fch());
         $$0.a(new fbe($$12, a, d, g));
      } else {
         fch $$13 = new fch();
         etj $$14 = new etj($$13, $$11);
         $$0.a(new esa($$13, $$14));
      }
   }
}
