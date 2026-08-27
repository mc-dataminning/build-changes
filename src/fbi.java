import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fbi {
   private static final vd b = vd.c("gui.banned.title.temporary").a(n.r);
   private static final vd c = vd.c("gui.banned.title.permanent").a(n.r);
   public static final vd a = vd.c("gui.banned.name.title").a(n.r);
   private static final vd d = vd.c("gui.banned.skin.title").a(n.r);
   private static final vd e = vd.a("gui.banned.skin.description", vd.b("https://aka.ms/mcjavamoderation"));

   public static fbl a(BooleanConsumer $$0, BanDetails $$1) {
      return new fbl($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", vc.m, true);
   }

   public static fbl a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fbl($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", vc.m, true);
   }

   public static fbl a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fbl($$1x -> {
         if ($$1x) {
            ac.i().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vd.a("gui.banned.name.description", vd.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", vc.m, true);
   }

   private static vd a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vd b(BanDetails $$0) {
      return vd.a("gui.banned.description", c($$0), d($$0), vd.b("https://aka.ms/mcjavamoderation"));
   }

   private static vd c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fof $$4 = fof.a($$3);
         vd $$5;
         if ($$4 != null) {
            $$5 = vg.a($$4.a().f(), wa.a.a(true));
         } else if ($$2 != null) {
            $$5 = vd.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vd.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vd.a("gui.banned.description.reason", $$5);
      } else {
         return vd.c("gui.banned.description.unknownreason");
      }
   }

   private static vd d(BanDetails $$0) {
      if (f($$0)) {
         vd $$1 = e($$0);
         return vd.a("gui.banned.description.temporary", vd.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vd.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vd e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return vc.a($$1.toDays());
      } else {
         return $$2 < 1L ? vc.c($$1.toMinutes()) : vc.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
