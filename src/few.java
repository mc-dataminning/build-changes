import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class few {
   private static final vs b = vs.c("gui.banned.title.temporary").a(n.r);
   private static final vs c = vs.c("gui.banned.title.permanent").a(n.r);
   public static final vs a = vs.c("gui.banned.name.title").a(n.r);
   private static final vs d = vs.c("gui.banned.skin.title").a(n.r);
   private static final vs e = vs.a("gui.banned.skin.description", vs.b("https://aka.ms/mcjavamoderation"));

   public static fez a(BooleanConsumer $$0, BanDetails $$1) {
      return new fez($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", vr.m, true);
   }

   public static fez a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fez($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", vr.m, true);
   }

   public static fez a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fez($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vs.a("gui.banned.name.description", vs.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", vr.m, true);
   }

   private static vs a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vs b(BanDetails $$0) {
      return vs.a("gui.banned.description", c($$0), d($$0), vs.b("https://aka.ms/mcjavamoderation"));
   }

   private static vs c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fry $$4 = fry.a($$3);
         vs $$5;
         if ($$4 != null) {
            $$5 = vv.a($$4.a().f(), wp.a.a(true));
         } else if ($$2 != null) {
            $$5 = vs.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vs.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vs.a("gui.banned.description.reason", $$5);
      } else {
         return vs.c("gui.banned.description.unknownreason");
      }
   }

   private static vs d(BanDetails $$0) {
      if (f($$0)) {
         vs $$1 = e($$0);
         return vs.a("gui.banned.description.temporary", vs.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vs.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vs e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return vr.a($$1.toDays());
      } else {
         return $$2 < 1L ? vr.c($$1.toMinutes()) : vr.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
