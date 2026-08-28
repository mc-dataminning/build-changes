import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class foy {
   private static final xd b = xd.c("gui.banned.title.temporary").a(n.r);
   private static final xd c = xd.c("gui.banned.title.permanent").a(n.r);
   public static final xd a = xd.c("gui.banned.name.title").a(n.r);
   private static final xd d = xd.c("gui.banned.skin.title").a(n.r);
   private static final xd e = xd.a("gui.banned.skin.description", xd.a(axz.n));

   public static fpa a(BooleanConsumer $$0, BanDetails $$1) {
      return new fpa($$0, a($$1), b($$1), axz.n, xc.m, true);
   }

   public static fpa a(Runnable $$0) {
      URI $$1 = axz.n;
      return new fpa($$2 -> {
         if ($$2) {
            ad.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xc.m, true);
   }

   public static fpa a(String $$0, Runnable $$1) {
      URI $$2 = axz.n;
      return new fpa($$2x -> {
         if ($$2x) {
            ad.m().a($$2);
         }

         $$1.run();
      }, a, xd.a("gui.banned.name.description", xd.b($$0).a(n.o), xd.a(axz.n)), $$2, xc.m, true);
   }

   private static xd a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xd b(BanDetails $$0) {
      return xd.a("gui.banned.description", c($$0), d($$0), xd.a(axz.n));
   }

   private static xd c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gch $$4 = gch.a($$3);
         xd $$5;
         if ($$4 != null) {
            $$5 = xg.a($$4.a().f(), ya.a.a(true));
         } else if ($$2 != null) {
            $$5 = xd.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xd.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xd.a("gui.banned.description.reason", $$5);
      } else {
         return xd.c("gui.banned.description.unknownreason");
      }
   }

   private static xd d(BanDetails $$0) {
      if (f($$0)) {
         xd $$1 = e($$0);
         return xd.a("gui.banned.description.temporary", xd.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xd.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xd e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xc.a($$1.toDays());
      } else {
         return $$2 < 1L ? xc.c($$1.toMinutes()) : xc.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
