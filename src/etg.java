import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class etg {
   private static final sw a = sw.c("gui.banned.title.temporary").a(n.r);
   private static final sw b = sw.c("gui.banned.title.permanent").a(n.r);

   public static etj a(BooleanConsumer $$0, BanDetails $$1) {
      return new etj($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", sv.m, true);
   }

   private static sw a(BanDetails $$0) {
      return f($$0) ? a : b;
   }

   private static sw b(BanDetails $$0) {
      return sw.a("gui.banned.description", c($$0), d($$0), sw.b("https://aka.ms/mcjavamoderation"));
   }

   private static sw c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         ffn $$4 = ffn.a($$3);
         sw $$5;
         if ($$4 != null) {
            $$5 = sy.a($$4.a().e(), ts.a.a(true));
         } else if ($$2 != null) {
            $$5 = sw.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = sw.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return sw.a("gui.banned.description.reason", $$5);
      } else {
         return sw.c("gui.banned.description.unknownreason");
      }
   }

   private static sw d(BanDetails $$0) {
      if (f($$0)) {
         sw $$1 = e($$0);
         return sw.a("gui.banned.description.temporary", sw.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return sw.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static sw e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return sv.a($$1.toDays());
      } else {
         return $$2 < 1L ? sv.c($$1.toMinutes()) : sv.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
