import java.util.concurrent.locks.ReentrantLock;

public class fni {
   public static final ti a = ti.c("quickplay.error.title");
   private static final ti b = ti.c("quickplay.error.invalid_identifier");
   private static final ti c = ti.c("quickplay.error.realm_connect");
   private static final ti d = ti.c("quickplay.error.realm_permission");
   private static final ti e = ti.c("gui.toTitle");
   private static final ti f = ti.c("gui.toWorld");
   private static final ti g = ti.c("gui.toRealms");

   public static void a(eqq $$0, fdr.c $$1, ema $$2) {
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

   private static void a(eqq $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         eyf $$2 = new fcz(new eyk());
         $$0.a(new exh($$2, a, b, f));
      } else {
         $$0.d(new exl(ti.c("selectWorld.data_read")));
         $$0.y().a(new eyk(), $$1);
      }
   }

   private static void b(eqq $$0, String $$1) {
      fjd $$2 = new fjd($$0);
      $$2.a();
      fjc $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fjc(gaf.a("selectServer.defaultName"), $$1, fjc.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fkd $$4 = fkd.a($$1);
      ewz.a(new fbb(new eyk()), $$0, $$4, $$3, true);
   }

   private static void a(eqq $$0, ema $$1, String $$2) {
      long $$3;
      emt $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         eyf $$6 = new elv(new eyk());
         $$0.a(new exh($$6, a, b, g));
         return;
      } catch (enn var10) {
         eyf $$8 = new eyk();
         $$0.a(new exh($$8, a, c, e));
         return;
      }

      emr $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         eyf $$12 = new elv(new eyk());
         $$0.a(new exh($$12, a, d, g));
      } else {
         eyk $$13 = new eyk();
         epp $$14 = new epp(new elv($$13), $$13, $$11, new ReentrantLock());
         $$0.a(new eoh($$13, $$14));
      }
   }
}
