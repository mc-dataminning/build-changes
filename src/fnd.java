import java.util.concurrent.locks.ReentrantLock;

public class fnd {
   public static final tf a = tf.c("quickplay.error.title");
   private static final tf b = tf.c("quickplay.error.invalid_identifier");
   private static final tf c = tf.c("quickplay.error.realm_connect");
   private static final tf d = tf.c("quickplay.error.realm_permission");
   private static final tf e = tf.c("gui.toTitle");
   private static final tf f = tf.c("gui.toWorld");
   private static final tf g = tf.c("gui.toRealms");

   public static void a(eql $$0, fdm.c $$1, elv $$2) {
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

   private static void a(eql $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         eya $$2 = new fcu(new eyf());
         $$0.a(new exc($$2, a, b, f));
      } else {
         $$0.d(new exg(tf.c("selectWorld.data_read")));
         $$0.y().a(new eyf(), $$1);
      }
   }

   private static void b(eql $$0, String $$1) {
      fiy $$2 = new fiy($$0);
      $$2.a();
      fix $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fix(gaa.a("selectServer.defaultName"), $$1, fix.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fjy $$4 = fjy.a($$1);
      ewu.a(new faw(new eyf()), $$0, $$4, $$3, true);
   }

   private static void a(eql $$0, elv $$1, String $$2) {
      long $$3;
      emo $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         eya $$6 = new elq(new eyf());
         $$0.a(new exc($$6, a, b, g));
         return;
      } catch (eni var10) {
         eya $$8 = new eyf();
         $$0.a(new exc($$8, a, c, e));
         return;
      }

      emm $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         eya $$12 = new elq(new eyf());
         $$0.a(new exc($$12, a, d, g));
      } else {
         eyf $$13 = new eyf();
         epk $$14 = new epk(new elq($$13), $$13, $$11, new ReentrantLock());
         $$0.a(new eod($$13, $$14));
      }
   }
}
