import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fic {
   private static final wg b = wg.c("gui.banned.title.temporary").a(n.r);
   private static final wg c = wg.c("gui.banned.title.permanent").a(n.r);
   public static final wg a = wg.c("gui.banned.name.title").a(n.r);
   private static final wg d = wg.c("gui.banned.skin.title").a(n.r);
   private static final wg e = wg.a("gui.banned.skin.description", wg.b("https://aka.ms/mcjavamoderation"));

   public static fif a(BooleanConsumer $$0, BanDetails $$1) {
      return new fif($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", wf.m, true);
   }

   public static fif a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fif($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", wf.m, true);
   }

   public static fif a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fif($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, wg.a("gui.banned.name.description", wg.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", wf.m, true);
   }

   private static wg a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wg b(BanDetails $$0) {
      return wg.a("gui.banned.description", c($$0), d($$0), wg.b("https://aka.ms/mcjavamoderation"));
   }

   private static wg c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fvh $$4 = fvh.a($$3);
         wg $$5;
         if ($$4 != null) {
            $$5 = wj.a($$4.a().f(), xd.a.a(true));
         } else if ($$2 != null) {
            $$5 = wg.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wg.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wg.a("gui.banned.description.reason", $$5);
      } else {
         return wg.c("gui.banned.description.unknownreason");
      }
   }

   private static wg d(BanDetails $$0) {
      if (f($$0)) {
         wg $$1 = e($$0);
         return wg.a("gui.banned.description.temporary", wg.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wg.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wg e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wf.a($$1.toDays());
      } else {
         return $$2 < 1L ? wf.c($$1.toMinutes()) : wf.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
