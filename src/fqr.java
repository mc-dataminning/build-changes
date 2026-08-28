import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fqr {
   private static final xj b = xj.c("gui.banned.title.temporary").a(n.r);
   private static final xj c = xj.c("gui.banned.title.permanent").a(n.r);
   public static final xj a = xj.c("gui.banned.name.title").a(n.r);
   private static final xj d = xj.c("gui.banned.skin.title").a(n.r);
   private static final xj e = xj.a("gui.banned.skin.description", xj.a(ayi.n));

   public static fqt a(BooleanConsumer $$0, BanDetails $$1) {
      return new fqt($$0, a($$1), b($$1), ayi.n, xi.m, true);
   }

   public static fqt a(Runnable $$0) {
      URI $$1 = ayi.n;
      return new fqt($$2 -> {
         if ($$2) {
            ae.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xi.m, true);
   }

   public static fqt a(String $$0, Runnable $$1) {
      URI $$2 = ayi.n;
      return new fqt($$2x -> {
         if ($$2x) {
            ae.m().a($$2);
         }

         $$1.run();
      }, a, xj.a("gui.banned.name.description", xj.b($$0).a(n.o), xj.a(ayi.n)), $$2, xi.m, true);
   }

   private static xj a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xj b(BanDetails $$0) {
      return xj.a("gui.banned.description", c($$0), d($$0), xj.a(ayi.n));
   }

   private static xj c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         geh $$4 = geh.a($$3);
         xj $$5;
         if ($$4 != null) {
            $$5 = xm.a($$4.a().f(), yg.a.a(true));
         } else if ($$2 != null) {
            $$5 = xj.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xj.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xj.a("gui.banned.description.reason", $$5);
      } else {
         return xj.c("gui.banned.description.unknownreason");
      }
   }

   private static xj d(BanDetails $$0) {
      if (f($$0)) {
         xj $$1 = e($$0);
         return xj.a("gui.banned.description.temporary", xj.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xj.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xj e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xi.a($$1.toDays());
      } else {
         return $$2 < 1L ? xi.c($$1.toMinutes()) : xi.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
