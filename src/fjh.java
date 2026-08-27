import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fjh {
   private static final ws b = ws.c("gui.banned.title.temporary").a(n.r);
   private static final ws c = ws.c("gui.banned.title.permanent").a(n.r);
   public static final ws a = ws.c("gui.banned.name.title").a(n.r);
   private static final ws d = ws.c("gui.banned.skin.title").a(n.r);
   private static final ws e = ws.a("gui.banned.skin.description", ws.b("https://aka.ms/mcjavamoderation"));

   public static fjk a(BooleanConsumer $$0, BanDetails $$1) {
      return new fjk($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", wr.m, true);
   }

   public static fjk a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fjk($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", wr.m, true);
   }

   public static fjk a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fjk($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, ws.a("gui.banned.name.description", ws.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", wr.m, true);
   }

   private static ws a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static ws b(BanDetails $$0) {
      return ws.a("gui.banned.description", c($$0), d($$0), ws.b("https://aka.ms/mcjavamoderation"));
   }

   private static ws c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fwm $$4 = fwm.a($$3);
         ws $$5;
         if ($$4 != null) {
            $$5 = wv.a($$4.a().f(), xp.a.a(true));
         } else if ($$2 != null) {
            $$5 = ws.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = ws.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return ws.a("gui.banned.description.reason", $$5);
      } else {
         return ws.c("gui.banned.description.unknownreason");
      }
   }

   private static ws d(BanDetails $$0) {
      if (f($$0)) {
         ws $$1 = e($$0);
         return ws.a("gui.banned.description.temporary", ws.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return ws.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static ws e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wr.a($$1.toDays());
      } else {
         return $$2 < 1L ? wr.c($$1.toMinutes()) : wr.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
