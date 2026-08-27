import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class eyw {
   private static final ur b = ur.c("gui.banned.title.temporary").a(n.r);
   private static final ur c = ur.c("gui.banned.title.permanent").a(n.r);
   public static final ur a = ur.c("gui.banned.name.title").a(n.r);
   private static final ur d = ur.c("gui.banned.skin.title").a(n.r);
   private static final ur e = ur.a("gui.banned.skin.description", ur.b("https://aka.ms/mcjavamoderation"));

   public static eyz a(BooleanConsumer $$0, BanDetails $$1) {
      return new eyz($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", uq.m, true);
   }

   public static eyz a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new eyz($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", uq.m, true);
   }

   public static eyz a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new eyz($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, ur.a("gui.banned.name.description", ur.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", uq.m, true);
   }

   private static ur a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static ur b(BanDetails $$0) {
      return ur.a("gui.banned.description", c($$0), d($$0), ur.b("https://aka.ms/mcjavamoderation"));
   }

   private static ur c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         flr $$4 = flr.a($$3);
         ur $$5;
         if ($$4 != null) {
            $$5 = uu.a($$4.a().f(), vo.a.a(true));
         } else if ($$2 != null) {
            $$5 = ur.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = ur.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return ur.a("gui.banned.description.reason", $$5);
      } else {
         return ur.c("gui.banned.description.unknownreason");
      }
   }

   private static ur d(BanDetails $$0) {
      if (f($$0)) {
         ur $$1 = e($$0);
         return ur.a("gui.banned.description.temporary", ur.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return ur.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static ur e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return uq.a($$1.toDays());
      } else {
         return $$2 < 1L ? uq.c($$1.toMinutes()) : uq.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
