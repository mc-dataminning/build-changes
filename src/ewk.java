import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ewk {
   private static final te a = te.c("gui.banned.title.temporary").a(n.r);
   private static final te b = te.c("gui.banned.title.permanent").a(n.r);

   public static ewn a(BooleanConsumer $$0, BanDetails $$1) {
      return new ewn($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", td.m, true);
   }

   private static te a(BanDetails $$0) {
      return f($$0) ? a : b;
   }

   private static te b(BanDetails $$0) {
      return te.a("gui.banned.description", c($$0), d($$0), te.b("https://aka.ms/mcjavamoderation"));
   }

   private static te c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fix $$4 = fix.a($$3);
         te $$5;
         if ($$4 != null) {
            $$5 = tg.a($$4.a().e(), ua.a.a(true));
         } else if ($$2 != null) {
            $$5 = te.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = te.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return te.a("gui.banned.description.reason", $$5);
      } else {
         return te.c("gui.banned.description.unknownreason");
      }
   }

   private static te d(BanDetails $$0) {
      if (f($$0)) {
         te $$1 = e($$0);
         return te.a("gui.banned.description.temporary", te.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return te.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static te e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return td.a($$1.toDays());
      } else {
         return $$2 < 1L ? td.c($$1.toMinutes()) : td.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
