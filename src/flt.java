import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class flt {
   private static final xp b = xp.c("gui.banned.title.temporary").a(n.r);
   private static final xp c = xp.c("gui.banned.title.permanent").a(n.r);
   public static final xp a = xp.c("gui.banned.name.title").a(n.r);
   private static final xp d = xp.c("gui.banned.skin.title").a(n.r);
   private static final xp e = xp.a("gui.banned.skin.description", xp.b("https://aka.ms/mcjavamoderation"));

   public static flw a(BooleanConsumer $$0, BanDetails $$1) {
      return new flw($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", xo.m, true);
   }

   public static flw a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new flw($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", xo.m, true);
   }

   public static flw a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new flw($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, xp.a("gui.banned.name.description", xp.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", xo.m, true);
   }

   private static xp a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xp b(BanDetails $$0) {
      return xp.a("gui.banned.description", c($$0), d($$0), xp.b("https://aka.ms/mcjavamoderation"));
   }

   private static xp c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fyx $$4 = fyx.a($$3);
         xp $$5;
         if ($$4 != null) {
            $$5 = xs.a($$4.a().f(), ym.a.a(true));
         } else if ($$2 != null) {
            $$5 = xp.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xp.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xp.a("gui.banned.description.reason", $$5);
      } else {
         return xp.c("gui.banned.description.unknownreason");
      }
   }

   private static xp d(BanDetails $$0) {
      if (f($$0)) {
         xp $$1 = e($$0);
         return xp.a("gui.banned.description.temporary", xp.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xp.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xp e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xo.a($$1.toDays());
      } else {
         return $$2 < 1L ? xo.c($$1.toMinutes()) : xo.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
