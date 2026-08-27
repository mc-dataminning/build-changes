import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ewu {
   private static final tl b = tl.c("gui.banned.title.temporary").a(n.r);
   private static final tl c = tl.c("gui.banned.title.permanent").a(n.r);
   public static final tl a = tl.c("gui.banned.name.title").a(n.r);
   private static final tl d = tl.c("gui.banned.skin.title").a(n.r);
   private static final tl e = tl.a("gui.banned.skin.description", tl.b("https://aka.ms/mcjavamoderation"));

   public static ewx a(BooleanConsumer $$0, BanDetails $$1) {
      return new ewx($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", tk.m, true);
   }

   public static ewx a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new ewx($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", tk.m, true);
   }

   public static ewx a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new ewx($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, tl.a("gui.banned.name.description", tl.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", tk.m, true);
   }

   private static tl a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static tl b(BanDetails $$0) {
      return tl.a("gui.banned.description", c($$0), d($$0), tl.b("https://aka.ms/mcjavamoderation"));
   }

   private static tl c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fjn $$4 = fjn.a($$3);
         tl $$5;
         if ($$4 != null) {
            $$5 = to.a($$4.a().f(), ui.a.a(true));
         } else if ($$2 != null) {
            $$5 = tl.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = tl.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return tl.a("gui.banned.description.reason", $$5);
      } else {
         return tl.c("gui.banned.description.unknownreason");
      }
   }

   private static tl d(BanDetails $$0) {
      if (f($$0)) {
         tl $$1 = e($$0);
         return tl.a("gui.banned.description.temporary", tl.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return tl.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static tl e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return tk.a($$1.toDays());
      } else {
         return $$2 < 1L ? tk.c($$1.toMinutes()) : tk.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
