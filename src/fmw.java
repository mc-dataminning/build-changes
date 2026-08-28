import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fmw {
   private static final wz b = wz.c("gui.banned.title.temporary").a(n.r);
   private static final wz c = wz.c("gui.banned.title.permanent").a(n.r);
   public static final wz a = wz.c("gui.banned.name.title").a(n.r);
   private static final wz d = wz.c("gui.banned.skin.title").a(n.r);
   private static final wz e = wz.a("gui.banned.skin.description", wz.a(axj.n));

   public static fmy a(BooleanConsumer $$0, BanDetails $$1) {
      return new fmy($$0, a($$1), b($$1), axj.n, wy.m, true);
   }

   public static fmy a(Runnable $$0) {
      URI $$1 = axj.n;
      return new fmy($$2 -> {
         if ($$2) {
            ad.k().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wy.m, true);
   }

   public static fmy a(String $$0, Runnable $$1) {
      URI $$2 = axj.n;
      return new fmy($$2x -> {
         if ($$2x) {
            ad.k().a($$2);
         }

         $$1.run();
      }, a, wz.a("gui.banned.name.description", wz.b($$0).a(n.o), wz.a(axj.n)), $$2, wy.m, true);
   }

   private static wz a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wz b(BanDetails $$0) {
      return wz.a("gui.banned.description", c($$0), d($$0), wz.a(axj.n));
   }

   private static wz c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gae $$4 = gae.a($$3);
         wz $$5;
         if ($$4 != null) {
            $$5 = xc.a($$4.a().f(), xw.a.a(true));
         } else if ($$2 != null) {
            $$5 = wz.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wz.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wz.a("gui.banned.description.reason", $$5);
      } else {
         return wz.c("gui.banned.description.unknownreason");
      }
   }

   private static wz d(BanDetails $$0) {
      if (f($$0)) {
         wz $$1 = e($$0);
         return wz.a("gui.banned.description.temporary", wz.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wz.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wz e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wy.a($$1.toDays());
      } else {
         return $$2 < 1L ? wy.c($$1.toMinutes()) : wy.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
