import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fkm {
   private static final wx b = wx.c("gui.banned.title.temporary").a(n.r);
   private static final wx c = wx.c("gui.banned.title.permanent").a(n.r);
   public static final wx a = wx.c("gui.banned.name.title").a(n.r);
   private static final wx d = wx.c("gui.banned.skin.title").a(n.r);
   private static final wx e = wx.a("gui.banned.skin.description", wx.b("https://aka.ms/mcjavamoderation"));

   public static fkp a(BooleanConsumer $$0, BanDetails $$1) {
      return new fkp($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", ww.m, true);
   }

   public static fkp a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fkp($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", ww.m, true);
   }

   public static fkp a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fkp($$1x -> {
         if ($$1x) {
            ac.k().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, wx.a("gui.banned.name.description", wx.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", ww.m, true);
   }

   private static wx a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wx b(BanDetails $$0) {
      return wx.a("gui.banned.description", c($$0), d($$0), wx.b("https://aka.ms/mcjavamoderation"));
   }

   private static wx c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fxr $$4 = fxr.a($$3);
         wx $$5;
         if ($$4 != null) {
            $$5 = xa.a($$4.a().f(), xu.a.a(true));
         } else if ($$2 != null) {
            $$5 = wx.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wx.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wx.a("gui.banned.description.reason", $$5);
      } else {
         return wx.c("gui.banned.description.unknownreason");
      }
   }

   private static wx d(BanDetails $$0) {
      if (f($$0)) {
         wx $$1 = e($$0);
         return wx.a("gui.banned.description.temporary", wx.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wx.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wx e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return ww.a($$1.toDays());
      } else {
         return $$2 < 1L ? ww.c($$1.toMinutes()) : ww.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
