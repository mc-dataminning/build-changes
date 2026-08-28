import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class flq {
   private static final xo b = xo.c("gui.banned.title.temporary").a(n.r);
   private static final xo c = xo.c("gui.banned.title.permanent").a(n.r);
   public static final xo a = xo.c("gui.banned.name.title").a(n.r);
   private static final xo d = xo.c("gui.banned.skin.title").a(n.r);
   private static final xo e = xo.a("gui.banned.skin.description", xo.b("https://aka.ms/mcjavamoderation"));

   public static flt a(BooleanConsumer $$0, BanDetails $$1) {
      return new flt($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", xn.m, true);
   }

   public static flt a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new flt($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", xn.m, true);
   }

   public static flt a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new flt($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, xo.a("gui.banned.name.description", xo.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", xn.m, true);
   }

   private static xo a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xo b(BanDetails $$0) {
      return xo.a("gui.banned.description", c($$0), d($$0), xo.b("https://aka.ms/mcjavamoderation"));
   }

   private static xo c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fyu $$4 = fyu.a($$3);
         xo $$5;
         if ($$4 != null) {
            $$5 = xr.a($$4.a().f(), yl.a.a(true));
         } else if ($$2 != null) {
            $$5 = xo.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xo.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xo.a("gui.banned.description.reason", $$5);
      } else {
         return xo.c("gui.banned.description.unknownreason");
      }
   }

   private static xo d(BanDetails $$0) {
      if (f($$0)) {
         xo $$1 = e($$0);
         return xo.a("gui.banned.description.temporary", xo.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xo.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xo e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xn.a($$1.toDays());
      } else {
         return $$2 < 1L ? xn.c($$1.toMinutes()) : xn.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
