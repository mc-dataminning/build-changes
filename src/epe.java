import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class epe {
   private static final te a = te.c("mco.util.time.now");
   private static final int b = 60;
   private static final int c = 3600;
   private static final int d = 86400;

   public static te a(long $$0) {
      if ($$0 < 0L) {
         return a;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return te.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return te.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return te.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return te.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static te a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(erx $$0, int $$1, int $$2, int $$3, UUID $$4) {
      eqn $$5 = eqn.N();
      GameProfile $$6 = $$5.aj().fetchProfile($$4, false);
      fzg $$7 = $$6 != null ? $$5.ak().b($$6) : fyy.a($$4);
      eth.a($$0, $$7.a(), $$1, $$2, $$3);
   }
}
