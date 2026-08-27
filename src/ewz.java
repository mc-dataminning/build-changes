import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ewz {
   private static final tm b = tm.c("gui.banned.title.temporary").a(n.r);
   private static final tm c = tm.c("gui.banned.title.permanent").a(n.r);
   public static final tm a = tm.c("gui.banned.name.title").a(n.r);
   private static final tm d = tm.c("gui.banned.skin.title").a(n.r);
   private static final tm e = tm.a("gui.banned.skin.description", tm.b("https://aka.ms/mcjavamoderation"));

   public static exc a(BooleanConsumer $$0, BanDetails $$1) {
      return new exc($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", tl.m, true);
   }

   public static exc a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new exc($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", tl.m, true);
   }

   public static exc a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new exc($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, tm.a("gui.banned.name.description", tm.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", tl.m, true);
   }

   private static tm a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static tm b(BanDetails $$0) {
      return tm.a("gui.banned.description", c($$0), d($$0), tm.b("https://aka.ms/mcjavamoderation"));
   }

   private static tm c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fjr $$4 = fjr.a($$3);
         tm $$5;
         if ($$4 != null) {
            $$5 = to.a($$4.a().e(), ui.a.a(true));
         } else if ($$2 != null) {
            $$5 = tm.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = tm.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return tm.a("gui.banned.description.reason", $$5);
      } else {
         return tm.c("gui.banned.description.unknownreason");
      }
   }

   private static tm d(BanDetails $$0) {
      if (f($$0)) {
         tm $$1 = e($$0);
         return tm.a("gui.banned.description.temporary", tm.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return tm.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static tm e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return tl.a($$1.toDays());
      } else {
         return $$2 < 1L ? tl.c($$1.toMinutes()) : tl.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
