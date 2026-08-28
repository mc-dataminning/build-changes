import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fme {
   private static final wu b = wu.c("gui.banned.title.temporary").a(n.r);
   private static final wu c = wu.c("gui.banned.title.permanent").a(n.r);
   public static final wu a = wu.c("gui.banned.name.title").a(n.r);
   private static final wu d = wu.c("gui.banned.skin.title").a(n.r);
   private static final wu e = wu.a("gui.banned.skin.description", wu.b("https://aka.ms/mcjavamoderation"));

   public static fmg a(BooleanConsumer $$0, BanDetails $$1) {
      return new fmg($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", wt.m, true);
   }

   public static fmg a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fmg($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", wt.m, true);
   }

   public static fmg a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fmg($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, wu.a("gui.banned.name.description", wu.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", wt.m, true);
   }

   private static wu a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wu b(BanDetails $$0) {
      return wu.a("gui.banned.description", c($$0), d($$0), wu.b("https://aka.ms/mcjavamoderation"));
   }

   private static wu c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fzk $$4 = fzk.a($$3);
         wu $$5;
         if ($$4 != null) {
            $$5 = wx.a($$4.a().f(), xr.a.a(true));
         } else if ($$2 != null) {
            $$5 = wu.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wu.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wu.a("gui.banned.description.reason", $$5);
      } else {
         return wu.c("gui.banned.description.unknownreason");
      }
   }

   private static wu d(BanDetails $$0) {
      if (f($$0)) {
         wu $$1 = e($$0);
         return wu.a("gui.banned.description.temporary", wu.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wu.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wu e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wt.a($$1.toDays());
      } else {
         return $$2 < 1L ? wt.c($$1.toMinutes()) : wt.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
