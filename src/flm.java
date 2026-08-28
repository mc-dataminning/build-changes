import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class flm {
   private static final xl b = xl.c("gui.banned.title.temporary").a(n.r);
   private static final xl c = xl.c("gui.banned.title.permanent").a(n.r);
   public static final xl a = xl.c("gui.banned.name.title").a(n.r);
   private static final xl d = xl.c("gui.banned.skin.title").a(n.r);
   private static final xl e = xl.a("gui.banned.skin.description", xl.b("https://aka.ms/mcjavamoderation"));

   public static flp a(BooleanConsumer $$0, BanDetails $$1) {
      return new flp($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", xk.m, true);
   }

   public static flp a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new flp($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", xk.m, true);
   }

   public static flp a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new flp($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, xl.a("gui.banned.name.description", xl.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", xk.m, true);
   }

   private static xl a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xl b(BanDetails $$0) {
      return xl.a("gui.banned.description", c($$0), d($$0), xl.b("https://aka.ms/mcjavamoderation"));
   }

   private static xl c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fyq $$4 = fyq.a($$3);
         xl $$5;
         if ($$4 != null) {
            $$5 = xo.a($$4.a().f(), yi.a.a(true));
         } else if ($$2 != null) {
            $$5 = xl.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xl.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xl.a("gui.banned.description.reason", $$5);
      } else {
         return xl.c("gui.banned.description.unknownreason");
      }
   }

   private static xl d(BanDetails $$0) {
      if (f($$0)) {
         xl $$1 = e($$0);
         return xl.a("gui.banned.description.temporary", xl.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xl.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xl e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xk.a($$1.toDays());
      } else {
         return $$2 < 1L ? xk.c($$1.toMinutes()) : xk.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
