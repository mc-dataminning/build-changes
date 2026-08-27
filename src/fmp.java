import java.util.concurrent.locks.ReentrantLock;

public class fmp {
   public static final te a = te.c("quickplay.error.title");
   private static final te b = te.c("quickplay.error.invalid_identifier");
   private static final te c = te.c("quickplay.error.realm_connect");
   private static final te d = te.c("quickplay.error.realm_permission");
   private static final te e = te.c("gui.toTitle");
   private static final te f = te.c("gui.toWorld");
   private static final te g = te.c("gui.toRealms");

   public static void a(eqn $$0, fdd.c $$1, ang $$2, elx $$3) {
      String $$4 = $$1.c();
      String $$5 = $$1.d();
      String $$6 = $$1.e();
      $$2.a().thenRunAsync(() -> {
         if (!ac.b($$4)) {
            a($$0, $$4);
         } else if (!ac.b($$5)) {
            b($$0, $$5);
         } else if (!ac.b($$6)) {
            a($$0, $$3, $$6);
         }
      }, $$0);
   }

   private static void a(eqn $$0, String $$1) {
      if (!$$0.k().b($$1)) {
         exv $$2 = new fcl(new eya());
         $$0.a(new ewx($$2, a, b, f));
      } else {
         $$0.d(new exb(te.c("selectWorld.data_read")));
         $$0.w().a(new eya(), $$1);
      }
   }

   private static void b(eqn $$0, String $$1) {
      fio $$2 = new fio($$0);
      $$2.a();
      fin $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fin(fzm.a("selectServer.defaultName"), $$1, fin.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fjk $$4 = fjk.a($$1);
      ewp.a(new far(new eya()), $$0, $$4, $$3, true);
   }

   private static void a(eqn $$0, elx $$1, String $$2) {
      long $$3;
      emq $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         exv $$6 = new els(new eya());
         $$0.a(new ewx($$6, a, b, g));
         return;
      } catch (enk var10) {
         exv $$8 = new eya();
         $$0.a(new ewx($$8, a, c, e));
         return;
      }

      emo $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         exv $$12 = new els(new eya());
         $$0.a(new ewx($$12, a, d, g));
      } else {
         eya $$13 = new eya();
         epm $$14 = new epm(new els($$13), $$13, $$11, new ReentrantLock());
         $$0.a(new eof($$13, $$14));
      }
   }
}
