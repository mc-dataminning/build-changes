import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fpv {
   private static final xi b = xi.c("gui.banned.title.temporary").a(n.r);
   private static final xi c = xi.c("gui.banned.title.permanent").a(n.r);
   public static final xi a = xi.c("gui.banned.name.title").a(n.r);
   private static final xi d = xi.c("gui.banned.skin.title").a(n.r);
   private static final xi e = xi.a("gui.banned.skin.description", xi.a(ayg.n));

   public static fpx a(BooleanConsumer $$0, BanDetails $$1) {
      return new fpx($$0, a($$1), b($$1), ayg.n, xh.m, true);
   }

   public static fpx a(Runnable $$0) {
      URI $$1 = ayg.n;
      return new fpx($$2 -> {
         if ($$2) {
            ae.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xh.m, true);
   }

   public static fpx a(String $$0, Runnable $$1) {
      URI $$2 = ayg.n;
      return new fpx($$2x -> {
         if ($$2x) {
            ae.m().a($$2);
         }

         $$1.run();
      }, a, xi.a("gui.banned.name.description", xi.b($$0).a(n.o), xi.a(ayg.n)), $$2, xh.m, true);
   }

   private static xi a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xi b(BanDetails $$0) {
      return xi.a("gui.banned.description", c($$0), d($$0), xi.a(ayg.n));
   }

   private static xi c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gdi $$4 = gdi.a($$3);
         xi $$5;
         if ($$4 != null) {
            $$5 = xl.a($$4.a().f(), yf.a.a(true));
         } else if ($$2 != null) {
            $$5 = xi.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xi.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xi.a("gui.banned.description.reason", $$5);
      } else {
         return xi.c("gui.banned.description.unknownreason");
      }
   }

   private static xi d(BanDetails $$0) {
      if (f($$0)) {
         xi $$1 = e($$0);
         return xi.a("gui.banned.description.temporary", xi.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xi.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xi e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xh.a($$1.toDays());
      } else {
         return $$2 < 1L ? xh.c($$1.toMinutes()) : xh.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
