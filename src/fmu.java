import java.util.concurrent.locks.ReentrantLock;

public class fmu {
   public static final tf a = tf.c("quickplay.error.title");
   private static final tf b = tf.c("quickplay.error.invalid_identifier");
   private static final tf c = tf.c("quickplay.error.realm_connect");
   private static final tf d = tf.c("quickplay.error.realm_permission");
   private static final tf e = tf.c("gui.toTitle");
   private static final tf f = tf.c("gui.toWorld");
   private static final tf g = tf.c("gui.toRealms");

   public static void a(eqm $$0, fdh.c $$1, ani $$2, elw $$3) {
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

   private static void a(eqm $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         exz $$2 = new fcp(new eye());
         $$0.a(new exb($$2, a, b, f));
      } else {
         $$0.d(new exf(tf.c("selectWorld.data_read")));
         $$0.y().a(new eye(), $$1);
      }
   }

   private static void b(eqm $$0, String $$1) {
      fit $$2 = new fit($$0);
      $$2.a();
      fis $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fis(fzr.a("selectServer.defaultName"), $$1, fis.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fjp $$4 = fjp.a($$1);
      ewt.a(new fav(new eye()), $$0, $$4, $$3, true);
   }

   private static void a(eqm $$0, elw $$1, String $$2) {
      long $$3;
      emp $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         exz $$6 = new elr(new eye());
         $$0.a(new exb($$6, a, b, g));
         return;
      } catch (enj var10) {
         exz $$8 = new eye();
         $$0.a(new exb($$8, a, c, e));
         return;
      }

      emn $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         exz $$12 = new elr(new eye());
         $$0.a(new exb($$12, a, d, g));
      } else {
         eye $$13 = new eye();
         epl $$14 = new epl(new elr($$13), $$13, $$11, new ReentrantLock());
         $$0.a(new eoe($$13, $$14));
      }
   }
}
