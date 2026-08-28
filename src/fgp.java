import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Date;
import java.util.UUID;

public class fgp {
   private static final xd a = xd.c("mco.util.time.now");
   private static final int b = 60;
   private static final int c = 3600;
   private static final int d = 86400;

   public static xd a(long $$0) {
      if ($$0 < 0L) {
         return a;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return xd.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return xd.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return xd.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return xd.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static xd a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(fjn $$0, int $$1, int $$2, int $$3, UUID $$4) {
      fib $$5 = fib.Q();
      ProfileResult $$6 = $$5.al().fetchProfile($$4, false);
      gxl $$7 = $$6 != null ? $$5.am().b($$6.profile()) : gxc.a($$4);
      fkz.a($$0, $$7, $$1, $$2, $$3);
   }
}
