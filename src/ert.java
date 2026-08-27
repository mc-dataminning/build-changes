import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Date;
import java.util.UUID;

public class ert {
   private static final ur a = ur.c("mco.util.time.now");
   private static final int b = 60;
   private static final int c = 3600;
   private static final int d = 86400;

   public static ur a(long $$0) {
      if ($$0 < 0L) {
         return a;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return ur.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return ur.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return ur.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return ur.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static ur a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(euo $$0, int $$1, int $$2, int $$3, UUID $$4) {
      etd $$5 = etd.N();
      ProfileResult $$6 = $$5.aj().fetchProfile($$4, false);
      gcu $$7 = $$6 != null ? $$5.ak().b($$6.profile()) : gcm.a($$4);
      evy.a($$0, $$7.a(), $$1, $$2, $$3);
   }
}
