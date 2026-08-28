import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Date;
import java.util.UUID;

public class fjz {
   private static final wo a = wo.c("mco.util.time.now");
   private static final int b = 60;
   private static final int c = 3600;
   private static final int d = 86400;

   public static wo a(long $$0) {
      if ($$0 < 0L) {
         return a;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return wo.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return wo.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return wo.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return wo.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static wo a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(fod $$0, int $$1, int $$2, int $$3, UUID $$4) {
      flj $$5 = flj.Q();
      ProfileResult $$6 = $$5.am().fetchProfile($$4, false);
      hfk $$7 = $$6 != null ? $$5.an().b($$6.profile()) : hfb.a($$4);
      fpr.a($$0, $$7, $$1, $$2, $$3);
   }
}
