import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fpc {
   private static final xe b = xe.c("gui.banned.title.temporary").a(n.r);
   private static final xe c = xe.c("gui.banned.title.permanent").a(n.r);
   public static final xe a = xe.c("gui.banned.name.title").a(n.r);
   private static final xe d = xe.c("gui.banned.skin.title").a(n.r);
   private static final xe e = xe.a("gui.banned.skin.description", xe.a(ayb.n));

   public static fpe a(BooleanConsumer $$0, BanDetails $$1) {
      return new fpe($$0, a($$1), b($$1), ayb.n, xd.m, true);
   }

   public static fpe a(Runnable $$0) {
      URI $$1 = ayb.n;
      return new fpe($$2 -> {
         if ($$2) {
            ad.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xd.m, true);
   }

   public static fpe a(String $$0, Runnable $$1) {
      URI $$2 = ayb.n;
      return new fpe($$2x -> {
         if ($$2x) {
            ad.m().a($$2);
         }

         $$1.run();
      }, a, xe.a("gui.banned.name.description", xe.b($$0).a(n.o), xe.a(ayb.n)), $$2, xd.m, true);
   }

   private static xe a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xe b(BanDetails $$0) {
      return xe.a("gui.banned.description", c($$0), d($$0), xe.a(ayb.n));
   }

   private static xe c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gcm $$4 = gcm.a($$3);
         xe $$5;
         if ($$4 != null) {
            $$5 = xh.a($$4.a().f(), yb.a.a(true));
         } else if ($$2 != null) {
            $$5 = xe.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xe.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xe.a("gui.banned.description.reason", $$5);
      } else {
         return xe.c("gui.banned.description.unknownreason");
      }
   }

   private static xe d(BanDetails $$0) {
      if (f($$0)) {
         xe $$1 = e($$0);
         return xe.a("gui.banned.description.temporary", xe.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xe.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xe e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xd.a($$1.toDays());
      } else {
         return $$2 < 1L ? xd.c($$1.toMinutes()) : xd.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
