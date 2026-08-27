import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ezo {
   private static final uv b = uv.c("gui.banned.title.temporary").a(n.r);
   private static final uv c = uv.c("gui.banned.title.permanent").a(n.r);
   public static final uv a = uv.c("gui.banned.name.title").a(n.r);
   private static final uv d = uv.c("gui.banned.skin.title").a(n.r);
   private static final uv e = uv.a("gui.banned.skin.description", uv.b("https://aka.ms/mcjavamoderation"));

   public static ezr a(BooleanConsumer $$0, BanDetails $$1) {
      return new ezr($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", uu.m, true);
   }

   public static ezr a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new ezr($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", uu.m, true);
   }

   public static ezr a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new ezr($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, uv.a("gui.banned.name.description", uv.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", uu.m, true);
   }

   private static uv a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static uv b(BanDetails $$0) {
      return uv.a("gui.banned.description", c($$0), d($$0), uv.b("https://aka.ms/mcjavamoderation"));
   }

   private static uv c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fmj $$4 = fmj.a($$3);
         uv $$5;
         if ($$4 != null) {
            $$5 = uy.a($$4.a().f(), vs.a.a(true));
         } else if ($$2 != null) {
            $$5 = uv.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = uv.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return uv.a("gui.banned.description.reason", $$5);
      } else {
         return uv.c("gui.banned.description.unknownreason");
      }
   }

   private static uv d(BanDetails $$0) {
      if (f($$0)) {
         uv $$1 = e($$0);
         return uv.a("gui.banned.description.temporary", uv.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return uv.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static uv e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return uu.a($$1.toDays());
      } else {
         return $$2 < 1L ? uu.c($$1.toMinutes()) : uu.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
