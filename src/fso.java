public class fso {
   public static final vf a = vf.c("quickplay.error.title");
   private static final vf b = vf.c("quickplay.error.invalid_identifier");
   private static final vf c = vf.c("quickplay.error.realm_connect");
   private static final vf d = vf.c("quickplay.error.realm_permission");
   private static final vf e = vf.c("gui.toTitle");
   private static final vf f = vf.c("gui.toWorld");
   private static final vf g = vf.c("gui.toRealms");

   public static void a(evg $$0, fin.c $$1, eqp $$2) {
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

   private static void a(evg $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fcz $$2 = new fhv(new fde());
         $$0.a(new fcb($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fde()));
      }
   }

   private static void b(evg $$0, String $$1) {
      foc $$2 = new foc($$0);
      $$2.a();
      fob $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fob(gfq.a("selectServer.defaultName"), $$1, fob.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fpd $$4 = fpd.a($$1);
      fbt.a(new ffx(new fde()), $$0, $$4, $$3, true);
   }

   private static void a(evg $$0, eqp $$1, String $$2) {
      long $$3;
      eri $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fcz $$6 = new eqk(new fde());
         $$0.a(new fcb($$6, a, b, g));
         return;
      } catch (esc var10) {
         fcz $$8 = new fde();
         $$0.a(new fcb($$8, a, c, e));
         return;
      }

      erg $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fcz $$12 = new eqk(new fde());
         $$0.a(new fcb($$12, a, d, g));
      } else {
         fde $$13 = new fde();
         euf $$14 = new euf($$13, $$11);
         $$0.a(new esw($$13, $$14));
      }
   }
}
