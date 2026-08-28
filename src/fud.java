import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fud {
   private static final wp b = wp.c("gui.banned.title.temporary").a(n.r);
   private static final wp c = wp.c("gui.banned.title.permanent").a(n.r);
   public static final wp a = wp.c("gui.banned.name.title").a(n.r);
   private static final wp d = wp.c("gui.banned.skin.title").a(n.r);
   private static final wp e = wp.a("gui.banned.skin.description", wp.a(axv.n));

   public static fuf a(BooleanConsumer $$0, BanDetails $$1) {
      return new fuf($$0, a($$1), b($$1), axv.n, wo.m, true);
   }

   public static fuf a(Runnable $$0) {
      URI $$1 = axv.n;
      return new fuf($$2 -> {
         if ($$2) {
            af.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wo.m, true);
   }

   public static fuf a(String $$0, Runnable $$1) {
      URI $$2 = axv.n;
      return new fuf($$2x -> {
         if ($$2x) {
            af.n().a($$2);
         }

         $$1.run();
      }, a, wp.a("gui.banned.name.description", wp.b($$0).a(n.o), wp.a(axv.n)), $$2, wo.m, true);
   }

   private static wp a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wp b(BanDetails $$0) {
      return wp.a("gui.banned.description", c($$0), d($$0), wp.a(axv.n));
   }

   private static wp c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         ghz $$4 = ghz.a($$3);
         wp $$5;
         if ($$4 != null) {
            $$5 = ws.a($$4.a().f(), xm.a.a(true));
         } else if ($$2 != null) {
            $$5 = wp.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wp.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wp.a("gui.banned.description.reason", $$5);
      } else {
         return wp.c("gui.banned.description.unknownreason");
      }
   }

   private static wp d(BanDetails $$0) {
      if (f($$0)) {
         wp $$1 = e($$0);
         return wp.a("gui.banned.description.temporary", wp.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wp.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wp e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wo.a($$1.toDays());
      } else {
         return $$2 < 1L ? wo.c($$1.toMinutes()) : wo.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
