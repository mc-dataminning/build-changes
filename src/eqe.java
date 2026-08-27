import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Date;
import java.util.UUID;

public class eqe {
   private static final ui a = ui.c("mco.util.time.now");
   private static final int b = 60;
   private static final int c = 3600;
   private static final int d = 86400;

   public static ui a(long $$0) {
      if ($$0 < 0L) {
         return a;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return ui.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return ui.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return ui.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return ui.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static ui a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(esy $$0, int $$1, int $$2, int $$3, UUID $$4) {
      ero $$5 = ero.O();
      ProfileResult $$6 = $$5.ak().fetchProfile($$4, false);
      gba $$7 = $$6 != null ? $$5.al().b($$6.profile()) : gas.a($$4);
      eui.a($$0, $$7.a(), $$1, $$2, $$3);
   }
}
