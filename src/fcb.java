import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fcb {
   private static final vg b = vg.c("gui.banned.title.temporary").a(n.r);
   private static final vg c = vg.c("gui.banned.title.permanent").a(n.r);
   public static final vg a = vg.c("gui.banned.name.title").a(n.r);
   private static final vg d = vg.c("gui.banned.skin.title").a(n.r);
   private static final vg e = vg.a("gui.banned.skin.description", vg.b("https://aka.ms/mcjavamoderation"));

   public static fce a(BooleanConsumer $$0, BanDetails $$1) {
      return new fce($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", vf.m, true);
   }

   public static fce a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fce($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", vf.m, true);
   }

   public static fce a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fce($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vg.a("gui.banned.name.description", vg.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", vf.m, true);
   }

   private static vg a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vg b(BanDetails $$0) {
      return vg.a("gui.banned.description", c($$0), d($$0), vg.b("https://aka.ms/mcjavamoderation"));
   }

   private static vg c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fpa $$4 = fpa.a($$3);
         vg $$5;
         if ($$4 != null) {
            $$5 = vj.a($$4.a().f(), wd.a.a(true));
         } else if ($$2 != null) {
            $$5 = vg.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vg.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vg.a("gui.banned.description.reason", $$5);
      } else {
         return vg.c("gui.banned.description.unknownreason");
      }
   }

   private static vg d(BanDetails $$0) {
      if (f($$0)) {
         vg $$1 = e($$0);
         return vg.a("gui.banned.description.temporary", vg.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vg.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vg e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return vf.a($$1.toDays());
      } else {
         return $$2 < 1L ? vf.c($$1.toMinutes()) : vf.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
