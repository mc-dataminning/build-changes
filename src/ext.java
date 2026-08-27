import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ext {
   private static final ui b = ui.c("gui.banned.title.temporary").a(n.r);
   private static final ui c = ui.c("gui.banned.title.permanent").a(n.r);
   public static final ui a = ui.c("gui.banned.name.title").a(n.r);
   private static final ui d = ui.c("gui.banned.skin.title").a(n.r);
   private static final ui e = ui.a("gui.banned.skin.description", ui.b("https://aka.ms/mcjavamoderation"));

   public static exw a(BooleanConsumer $$0, BanDetails $$1) {
      return new exw($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", uh.m, true);
   }

   public static exw a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new exw($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", uh.m, true);
   }

   public static exw a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new exw($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, ui.a("gui.banned.name.description", ui.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", uh.m, true);
   }

   private static ui a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static ui b(BanDetails $$0) {
      return ui.a("gui.banned.description", c($$0), d($$0), ui.b("https://aka.ms/mcjavamoderation"));
   }

   private static ui c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fkm $$4 = fkm.a($$3);
         ui $$5;
         if ($$4 != null) {
            $$5 = ul.a($$4.a().f(), vf.a.a(true));
         } else if ($$2 != null) {
            $$5 = ui.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = ui.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return ui.a("gui.banned.description.reason", $$5);
      } else {
         return ui.c("gui.banned.description.unknownreason");
      }
   }

   private static ui d(BanDetails $$0) {
      if (f($$0)) {
         ui $$1 = e($$0);
         return ui.a("gui.banned.description.temporary", ui.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return ui.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static ui e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return uh.a($$1.toDays());
      } else {
         return $$2 < 1L ? uh.c($$1.toMinutes()) : uh.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
