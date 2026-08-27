import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class far {
   private static final vb b = vb.c("gui.banned.title.temporary").a(n.r);
   private static final vb c = vb.c("gui.banned.title.permanent").a(n.r);
   public static final vb a = vb.c("gui.banned.name.title").a(n.r);
   private static final vb d = vb.c("gui.banned.skin.title").a(n.r);
   private static final vb e = vb.a("gui.banned.skin.description", vb.b("https://aka.ms/mcjavamoderation"));

   public static fau a(BooleanConsumer $$0, BanDetails $$1) {
      return new fau($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", va.m, true);
   }

   public static fau a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fau($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", va.m, true);
   }

   public static fau a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fau($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vb.a("gui.banned.name.description", vb.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", va.m, true);
   }

   private static vb a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vb b(BanDetails $$0) {
      return vb.a("gui.banned.description", c($$0), d($$0), vb.b("https://aka.ms/mcjavamoderation"));
   }

   private static vb c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fno $$4 = fno.a($$3);
         vb $$5;
         if ($$4 != null) {
            $$5 = ve.a($$4.a().f(), vy.a.a(true));
         } else if ($$2 != null) {
            $$5 = vb.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vb.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vb.a("gui.banned.description.reason", $$5);
      } else {
         return vb.c("gui.banned.description.unknownreason");
      }
   }

   private static vb d(BanDetails $$0) {
      if (f($$0)) {
         vb $$1 = e($$0);
         return vb.a("gui.banned.description.temporary", vb.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vb.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vb e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return va.a($$1.toDays());
      } else {
         return $$2 < 1L ? va.c($$1.toMinutes()) : va.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
