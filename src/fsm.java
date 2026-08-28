import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fsm {
   private static final xv b = xv.c("gui.banned.title.temporary").a(n.r);
   private static final xv c = xv.c("gui.banned.title.permanent").a(n.r);
   public static final xv a = xv.c("gui.banned.name.title").a(n.r);
   private static final xv d = xv.c("gui.banned.skin.title").a(n.r);
   private static final xv e = xv.a("gui.banned.skin.description", xv.a(aza.n));

   public static fso a(BooleanConsumer $$0, BanDetails $$1) {
      return new fso($$0, a($$1), b($$1), aza.n, xu.m, true);
   }

   public static fso a(Runnable $$0) {
      URI $$1 = aza.n;
      return new fso($$2 -> {
         if ($$2) {
            ae.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xu.m, true);
   }

   public static fso a(String $$0, Runnable $$1) {
      URI $$2 = aza.n;
      return new fso($$2x -> {
         if ($$2x) {
            ae.m().a($$2);
         }

         $$1.run();
      }, a, xv.a("gui.banned.name.description", xv.b($$0).a(n.o), xv.a(aza.n)), $$2, xu.m, true);
   }

   private static xv a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xv b(BanDetails $$0) {
      return xv.a("gui.banned.description", c($$0), d($$0), xv.a(aza.n));
   }

   private static xv c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gge $$4 = gge.a($$3);
         xv $$5;
         if ($$4 != null) {
            $$5 = xy.a($$4.a().f(), ys.a.a(true));
         } else if ($$2 != null) {
            $$5 = xv.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xv.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xv.a("gui.banned.description.reason", $$5);
      } else {
         return xv.c("gui.banned.description.unknownreason");
      }
   }

   private static xv d(BanDetails $$0) {
      if (f($$0)) {
         xv $$1 = e($$0);
         return xv.a("gui.banned.description.temporary", xv.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xv.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xv e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xu.a($$1.toDays());
      } else {
         return $$2 < 1L ? xu.c($$1.toMinutes()) : xu.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
