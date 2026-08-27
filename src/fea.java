import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fea {
   private static final vq b = vq.c("gui.banned.title.temporary").a(n.r);
   private static final vq c = vq.c("gui.banned.title.permanent").a(n.r);
   public static final vq a = vq.c("gui.banned.name.title").a(n.r);
   private static final vq d = vq.c("gui.banned.skin.title").a(n.r);
   private static final vq e = vq.a("gui.banned.skin.description", vq.b("https://aka.ms/mcjavamoderation"));

   public static fed a(BooleanConsumer $$0, BanDetails $$1) {
      return new fed($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", vp.m, true);
   }

   public static fed a(Runnable $$0) {
      String $$1 = "https://aka.ms/mcjavamoderation";
      return new fed($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$0.run();
      }, d, e, "https://aka.ms/mcjavamoderation", vp.m, true);
   }

   public static fed a(String $$0, Runnable $$1) {
      String $$2 = "https://aka.ms/mcjavamoderation";
      return new fed($$1x -> {
         if ($$1x) {
            ac.j().a("https://aka.ms/mcjavamoderation");
         }

         $$1.run();
      }, a, vq.a("gui.banned.name.description", vq.b($$0).a(n.o), "https://aka.ms/mcjavamoderation"), "https://aka.ms/mcjavamoderation", vp.m, true);
   }

   private static vq a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static vq b(BanDetails $$0) {
      return vq.a("gui.banned.description", c($$0), d($$0), vq.b("https://aka.ms/mcjavamoderation"));
   }

   private static vq c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         frb $$4 = frb.a($$3);
         vq $$5;
         if ($$4 != null) {
            $$5 = vt.a($$4.a().f(), wn.a.a(true));
         } else if ($$2 != null) {
            $$5 = vq.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = vq.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return vq.a("gui.banned.description.reason", $$5);
      } else {
         return vq.c("gui.banned.description.unknownreason");
      }
   }

   private static vq d(BanDetails $$0) {
      if (f($$0)) {
         vq $$1 = e($$0);
         return vq.a("gui.banned.description.temporary", vq.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return vq.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static vq e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return vp.a($$1.toDays());
      } else {
         return $$2 < 1L ? vp.c($$1.toMinutes()) : vp.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
