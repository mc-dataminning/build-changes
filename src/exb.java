import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class exb {
   private static final tn b = tn.c("gui.banned.title.temporary").a(n.r);
   private static final tn c = tn.c("gui.banned.title.permanent").a(n.r);
   public static final tn a = tn.c("gui.banned.name.title").a(n.r);
   private static final tn d = tn.c("gui.banned.skin.title").a(n.r);
   private static final tn e = tn.a("gui.banned.skin.description", tn.b("https://aka.ms/mcjavamoderation"));

   public static exe a(BooleanConsumer $$0, BanDetails $$1) {
      return new exe($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", tm.m, true);
   }

   public static exe a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new exe($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", tm.m, true);
   }

   public static exe a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new exe($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, tn.a("gui.banned.name.description", tn.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", tm.m, true);
   }

   private static tn a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static tn b(BanDetails $$0) {
      return tn.a("gui.banned.description", c($$0), d($$0), tn.b("https://aka.ms/mcjavamoderation"));
   }

   private static tn c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fjt $$4 = fjt.a($$3);
         tn $$5;
         if ($$4 != null) {
            $$5 = tp.a($$4.a().e(), uj.a.a(true));
         } else if ($$2 != null) {
            $$5 = tn.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = tn.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return tn.a("gui.banned.description.reason", $$5);
      } else {
         return tn.c("gui.banned.description.unknownreason");
      }
   }

   private static tn d(BanDetails $$0) {
      if (f($$0)) {
         tn $$1 = e($$0);
         return tn.a("gui.banned.description.temporary", tn.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return tn.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static tn e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return tm.a($$1.toDays());
      } else {
         return $$2 < 1L ? tm.c($$1.toMinutes()) : tm.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
