import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class ftf {
   private static final wo b = wo.c("gui.banned.title.temporary").a(n.r);
   private static final wo c = wo.c("gui.banned.title.permanent").a(n.r);
   public static final wo a = wo.c("gui.banned.name.title").a(n.r);
   private static final wo d = wo.c("gui.banned.skin.title").a(n.r);
   private static final wo e = wo.a("gui.banned.skin.description", wo.a(axv.n));

   public static fth a(BooleanConsumer $$0, BanDetails $$1) {
      return new fth($$0, a($$1), b($$1), axv.n, wn.m, true);
   }

   public static fth a(Runnable $$0) {
      URI $$1 = axv.n;
      return new fth($$2 -> {
         if ($$2) {
            af.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wn.m, true);
   }

   public static fth a(String $$0, Runnable $$1) {
      URI $$2 = axv.n;
      return new fth($$2x -> {
         if ($$2x) {
            af.m().a($$2);
         }

         $$1.run();
      }, a, wo.a("gui.banned.name.description", wo.b($$0).a(n.o), wo.a(axv.n)), $$2, wn.m, true);
   }

   private static wo a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wo b(BanDetails $$0) {
      return wo.a("gui.banned.description", c($$0), d($$0), wo.a(axv.n));
   }

   private static wo c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         ggz $$4 = ggz.a($$3);
         wo $$5;
         if ($$4 != null) {
            $$5 = wr.a($$4.a().f(), xl.a.a(true));
         } else if ($$2 != null) {
            $$5 = wo.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wo.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wo.a("gui.banned.description.reason", $$5);
      } else {
         return wo.c("gui.banned.description.unknownreason");
      }
   }

   private static wo d(BanDetails $$0) {
      if (f($$0)) {
         wo $$1 = e($$0);
         return wo.a("gui.banned.description.temporary", wo.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wo.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wo e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wn.a($$1.toDays());
      } else {
         return $$2 < 1L ? wn.c($$1.toMinutes()) : wn.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
