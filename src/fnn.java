import java.util.concurrent.locks.ReentrantLock;

public class fnn {
   public static final tl a = tl.c("quickplay.error.title");
   private static final tl b = tl.c("quickplay.error.invalid_identifier");
   private static final tl c = tl.c("quickplay.error.realm_connect");
   private static final tl d = tl.c("quickplay.error.realm_permission");
   private static final tl e = tl.c("gui.toTitle");
   private static final tl f = tl.c("gui.toWorld");
   private static final tl g = tl.c("gui.toRealms");

   public static void a(eqv $$0, fdw.c $$1, emf $$2) {
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

   private static void a(eqv $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         eyk $$2 = new fde(new eyp());
         $$0.a(new exm($$2, a, b, f));
      } else {
         $$0.d(new exq(tl.c("selectWorld.data_read")));
         $$0.y().a(new eyp(), $$1);
      }
   }

   private static void b(eqv $$0, String $$1) {
      fji $$2 = new fji($$0);
      $$2.a();
      fjh $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fjh(gak.a("selectServer.defaultName"), $$1, fjh.b.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fki $$4 = fki.a($$1);
      exe.a(new fbg(new eyp()), $$0, $$4, $$3, true);
   }

   private static void a(eqv $$0, emf $$1, String $$2) {
      long $$3;
      emy $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         eyk $$6 = new ema(new eyp());
         $$0.a(new exm($$6, a, b, g));
         return;
      } catch (ens var10) {
         eyk $$8 = new eyp();
         $$0.a(new exm($$8, a, c, e));
         return;
      }

      emw $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         eyk $$12 = new ema(new eyp());
         $$0.a(new exm($$12, a, d, g));
      } else {
         eyp $$13 = new eyp();
         epu $$14 = new epu(new ema($$13), $$13, $$11, new ReentrantLock());
         $$0.a(new eom($$13, $$14));
      }
   }
}
