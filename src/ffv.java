import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ffv {
   private static final vu b = vu.c("gui.banned.title.temporary").a(n.r);
   private static final vu c = vu.c("gui.banned.title.permanent").a(n.r);
   public static final vu a = vu.c("gui.banned.name.title").a(n.r);
   private static final vu d = vu.c("gui.banned.skin.title").a(n.r);
   private static final vu e = vu.a("gui.banned.skin.description", vu.b("https://aka.ms/mcjavamoderation"));

   public static ffy a(BooleanConsumer $$0, BanDetails $$1) {
      return new ffy($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", vt.m, true);
   }

   public static ffy a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new ffy($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", vt.m, true);
   }

   public static ffy a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new ffy($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vu.a("gui.banned.name.description", vu.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", vt.m, true);
   }

   private static vu a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vu b(BanDetails $$0) {
      return vu.a("gui.banned.description", c($$0), d($$0), vu.b("https://aka.ms/mcjavamoderation"));
   }

   private static vu c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fta $$4 = fta.a($$3);
         vu $$5;
         if ($$4 != null) {
            $$5 = vx.a($$4.a().f(), wr.a.a(true));
         } else if ($$2 != null) {
            $$5 = vu.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vu.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vu.a("gui.banned.description.reason", $$5);
      } else {
         return vu.c("gui.banned.description.unknownreason");
      }
   }

   private static vu d(BanDetails $$0) {
      if (f($$0)) {
         vu $$1 = e($$0);
         return vu.a("gui.banned.description.temporary", vu.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vu.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vu e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return vt.a($$1.toDays());
      } else {
         return $$2 < 1L ? vt.c($$1.toMinutes()) : vt.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
