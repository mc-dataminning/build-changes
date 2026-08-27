public class fsi {
   public static final vd a = vd.c("quickplay.error.title");
   private static final vd b = vd.c("quickplay.error.invalid_identifier");
   private static final vd c = vd.c("quickplay.error.realm_connect");
   private static final vd d = vd.c("quickplay.error.realm_permission");
   private static final vd e = vd.c("gui.toTitle");
   private static final vd f = vd.c("gui.toWorld");
   private static final vd g = vd.c("gui.toRealms");

   public static void a(eva $$0, fih.c $$1, eqj $$2) {
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

   private static void a(eva $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fct $$2 = new fhp(new fcy());
         $$0.a(new fbv($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fcy()));
      }
   }

   private static void b(eva $$0, String $$1) {
      fnw $$2 = new fnw($$0);
      $$2.a();
      fnv $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fnv(gfl.a("selectServer.defaultName"), $$1, fnv.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fox $$4 = fox.a($$1);
      fbn.a(new ffr(new fcy()), $$0, $$4, $$3, true);
   }

   private static void a(eva $$0, eqj $$1, String $$2) {
      long $$3;
      erc $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fct $$6 = new eqe(new fcy());
         $$0.a(new fbv($$6, a, b, g));
         return;
      } catch (erw var10) {
         fct $$8 = new fcy();
         $$0.a(new fbv($$8, a, c, e));
         return;
      }

      era $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fct $$12 = new eqe(new fcy());
         $$0.a(new fbv($$12, a, d, g));
      } else {
         fcy $$13 = new fcy();
         etz $$14 = new etz($$13, $$11);
         $$0.a(new esq($$13, $$14));
      }
   }
}
