import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fbq {
   private static final vf b = vf.c("gui.banned.title.temporary").a(n.r);
   private static final vf c = vf.c("gui.banned.title.permanent").a(n.r);
   public static final vf a = vf.c("gui.banned.name.title").a(n.r);
   private static final vf d = vf.c("gui.banned.skin.title").a(n.r);
   private static final vf e = vf.a("gui.banned.skin.description", vf.b("https://aka.ms/mcjavamoderation"));

   public static fbt a(BooleanConsumer $$0, BanDetails $$1) {
      return new fbt($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", ve.m, true);
   }

   public static fbt a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fbt($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", ve.m, true);
   }

   public static fbt a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fbt($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vf.a("gui.banned.name.description", vf.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", ve.m, true);
   }

   private static vf a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vf b(BanDetails $$0) {
      return vf.a("gui.banned.description", c($$0), d($$0), vf.b("https://aka.ms/mcjavamoderation"));
   }

   private static vf c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fon $$4 = fon.a($$3);
         vf $$5;
         if ($$4 != null) {
            $$5 = vi.a($$4.a().f(), wc.a.a(true));
         } else if ($$2 != null) {
            $$5 = vf.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vf.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vf.a("gui.banned.description.reason", $$5);
      } else {
         return vf.c("gui.banned.description.unknownreason");
      }
   }

   private static vf d(BanDetails $$0) {
      if (f($$0)) {
         vf $$1 = e($$0);
         return vf.a("gui.banned.description.temporary", vf.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vf.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vf e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return ve.a($$1.toDays());
      } else {
         return $$2 < 1L ? ve.c($$1.toMinutes()) : ve.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
