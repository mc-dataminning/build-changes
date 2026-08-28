import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fpn {
   private static final xh b = xh.c("gui.banned.title.temporary").a(n.r);
   private static final xh c = xh.c("gui.banned.title.permanent").a(n.r);
   public static final xh a = xh.c("gui.banned.name.title").a(n.r);
   private static final xh d = xh.c("gui.banned.skin.title").a(n.r);
   private static final xh e = xh.a("gui.banned.skin.description", xh.a(ayf.n));

   public static fpp a(BooleanConsumer $$0, BanDetails $$1) {
      return new fpp($$0, a($$1), b($$1), ayf.n, xg.m, true);
   }

   public static fpp a(Runnable $$0) {
      URI $$1 = ayf.n;
      return new fpp($$2 -> {
         if ($$2) {
            ad.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xg.m, true);
   }

   public static fpp a(String $$0, Runnable $$1) {
      URI $$2 = ayf.n;
      return new fpp($$2x -> {
         if ($$2x) {
            ad.m().a($$2);
         }

         $$1.run();
      }, a, xh.a("gui.banned.name.description", xh.b($$0).a(n.o), xh.a(ayf.n)), $$2, xg.m, true);
   }

   private static xh a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xh b(BanDetails $$0) {
      return xh.a("gui.banned.description", c($$0), d($$0), xh.a(ayf.n));
   }

   private static xh c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gcx $$4 = gcx.a($$3);
         xh $$5;
         if ($$4 != null) {
            $$5 = xk.a($$4.a().f(), ye.a.a(true));
         } else if ($$2 != null) {
            $$5 = xh.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xh.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xh.a("gui.banned.description.reason", $$5);
      } else {
         return xh.c("gui.banned.description.unknownreason");
      }
   }

   private static xh d(BanDetails $$0) {
      if (f($$0)) {
         xh $$1 = e($$0);
         return xh.a("gui.banned.description.temporary", xh.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xh.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xh e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xg.a($$1.toDays());
      } else {
         return $$2 < 1L ? xg.c($$1.toMinutes()) : xg.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
