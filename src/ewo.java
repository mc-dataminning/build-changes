import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ewo {
   private static final tf a = tf.c("gui.banned.title.temporary").a(n.r);
   private static final tf b = tf.c("gui.banned.title.permanent").a(n.r);

   public static ewr a(BooleanConsumer $$0, BanDetails $$1) {
      return new ewr($$0, a($$1), b($$1), "https://aka.ms/mcjavamoderation", te.m, true);
   }

   private static tf a(BanDetails $$0) {
      return f($$0) ? a : b;
   }

   private static tf b(BanDetails $$0) {
      return tf.a("gui.banned.description", c($$0), d($$0), tf.b("https://aka.ms/mcjavamoderation"));
   }

   private static tf c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         fjc $$4 = fjc.a($$3);
         tf $$5;
         if ($$4 != null) {
            $$5 = th.a($$4.a().e(), ub.a.a(true));
         } else if ($$2 != null) {
            $$5 = tf.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = tf.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return tf.a("gui.banned.description.reason", $$5);
      } else {
         return tf.c("gui.banned.description.unknownreason");
      }
   }

   private static tf d(BanDetails $$0) {
      if (f($$0)) {
         tf $$1 = e($$0);
         return tf.a("gui.banned.description.temporary", tf.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return tf.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static tf e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return te.a($$1.toDays());
      } else {
         return $$2 < 1L ? te.c($$1.toMinutes()) : te.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
